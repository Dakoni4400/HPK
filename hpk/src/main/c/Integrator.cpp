#include "Integrator.h"
#include <math.h>
#include <map>

#define NMAX 2048

int functionCallCounterIntegrator = 0;

bool isConvergent(double new_result, double old_result, int n, int n_max, double eps) {
    double absError = fabs(old_result - new_result);
    double approximation = fabs(((old_result + new_result) / 2));
    double relError = absError / approximation;

    if (absError < eps || relError < eps) {
        return true;
    }
    if (n > n_max) {
        throw 0;
    }
    return false;
}

double integrate(Function &f, double a, double b, double eps) throw(int) {
    functionCallCounterIntegrator = 0;
    if (a == b)return 0.0;
    std::map<double, double> functionCalls;
    double fa, fb, h, sum1 = 0, sum2 = 0, xj = 0, xj1 = 0, new_result = 0, old_result = 0, functionResult = 0;

    int n = 1;
    fa = f(a);
    fb = f(b);
    functionCallCounterIntegrator = 2;

    do {
        h = (b - a) / n;
        sum1 = 0;
        sum2 = 0;

        for (int j = 1; j <= n - 1; j++) {
            xj = a + h * j;
            try {
                functionResult = functionCalls.at(xj);

            } catch (const std::out_of_range &e) {
                functionResult = f(xj);
                functionCalls.emplace(xj, functionResult);
            }
            sum1 += functionResult;

        }

        for (int j = 0; j <= n - 1; j++) {
            xj = a + h * j;
            xj1 = a + h * (j + 1);
            try {
                functionResult = functionCalls.at((xj + xj1) / 2);

            } catch (const std::out_of_range &e) {
                functionResult = f((xj + xj1) / 2);
                functionCalls.emplace((xj + xj1) / 2, functionResult);
            }
            sum2 += functionResult;

        }
        old_result = new_result;
        new_result = ((b - a) / (6 * n)) * (fa + fb + (2 * sum1) + (4 * sum2));
        n = n * 2;

    } while (!isConvergent(new_result, old_result, n, NMAX, eps));
    return new_result;
}

double integrate_(Function &f, double a, double b, double eps) {
    double sum1 = 0, sum2 = 0, xj = 0, xj1 = 0, new_result = 0, old_result = 0;
    int n = 2;
    double fa, fb, h;
    fa = f(a);
    fb = f(b);
    functionCallCounterIntegrator = 2;

    do {

        h = (b - a) / n;

        sum1 = 0;
        sum2 = 0;

        for (int j = 1; j <= n - 1; j++) {
            xj = a + h * j;
            sum1 += f(xj);
        }

        for (int j = 0; j <= n - 1; j++) {
            xj = a + h * j;
            xj1 = a + h * (j + 1);
            sum2 += f((xj + xj1) / 2);

        }
        old_result = new_result;
        new_result = ((b - a) / (6 * n)) * (fa + fb + (2 * sum1) + (4 * sum2));
        n = n * 2;

    } while (!isConvergent(new_result, old_result, n, NMAX, eps));
    return new_result;
}
