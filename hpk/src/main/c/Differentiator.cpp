#include <stdio.h>
#include <math.h>
#include "Differentiator.h"

double centralDif(Function& f, double h, double x) {
	return f(x+h)-f(x-h);
}

double approxF(Function& f, double h, double x) {
	return (8 * centralDif(f, h, x) - centralDif(f, 2.*h, x)) / (12. * h);
}

double approxF2H(Function& f, double h, double x) {
	return (8 * centralDif(f, 2.*h, x) - centralDif(f, 4.*h, x)) / (24. * h);
}

double differentiate(Function& f, double x, double err) {
	int n ;
	double h;
	double dif;
	double difPrevious;

	difPrevious = (16 * approxF(f, 1.0, x) - approxF2H(f, 1.0, x)) / 15;

	for(n = 2; n < 1000; n++) {
		h = 1.0 / (16*n);
		dif = (16 * approxF(f, h, x) - approxF2H(f, h, x)) / 15;

		if(fabs(dif - difPrevious) < err) {
			return dif;
		}

		difPrevious = dif;
	}

	printf("Warning: Differentiator could not find f'(%f)=%f<EPS\n", x, dif);

	return dif;
}



