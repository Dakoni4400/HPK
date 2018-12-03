#include "Integrator.h"
#include <math.h>
#include <stdio.h>

#define NMAX 1024

inline bool isConvergent(double new_result, double old_result, int n, int n_max, double eps) {
    //Check absolute error
    if (fabs(new_result - old_result) < eps) {
        return true;
    }
    //check rel error
    if (fabs(new_result - old_result) < (eps * fabs(new_result - old_result)) / 2) {
        return true;
    }
    if (n > n_max) {
        throw 0;
    }
    return false;
}

double simpsonRule(Function &f, double a, double b, int n, double h) {
	double sum1 = 0, sum2 = 0, xj = 0, xj1 = 0;

    sum1 = 0;
    sum2 = 0;

    for (int j = 1; j <= n - 1; j++) {
    	xj = a + h * (2 * j);
		sum1 += f(xj);
	}

	for (int j = 1; j <= n; j++) {
		xj1 = a + h * (2 * j - 1);
		sum2 += f(xj1);
	}

	return (2 * sum1) + (4 * sum2);
}

double integrate(Function &f, double a, double b, double eps) throw(int){
    double new_result = 0, old_result = 0;
    int n = 2;
    double fa, fb, h;
    fa = f(a);
    fb = f(b);

    do {
    	h = (b - a) / (2 * n);
        old_result = new_result;
        new_result = (h / 3) * (fa + fb + simpsonRule(f, a, b, n, h));
        n = n * 2;

    } while (!isConvergent(new_result, old_result, n, NMAX, eps));
    return new_result;
}
