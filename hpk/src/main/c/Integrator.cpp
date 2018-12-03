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

double simpsonRule(Function &f, double a, double b, int n, double fa, double fb) {
	double sum1 = 0, sum2 = 0, xj = 0, xj1 = 0;
	double h;

	h = (b - a) / (2 * n);
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

	return (h / 3) * (fa + fb + (2 * sum1) + (4 * sum2));
}

double integrate(Function &f, double a, double b, double eps) throw(int){
    double new_result = 0, old_result = 0;
    int n = 2;
    double fa, fb;
    fa = f(a);
    fb = f(b);

    do {
        old_result = new_result;
        new_result = simpsonRule(f, a, b, n, fa, fb);
        n = n * 2;

    } while (!isConvergent(new_result, old_result, n, NMAX, eps));
    return new_result;
}
