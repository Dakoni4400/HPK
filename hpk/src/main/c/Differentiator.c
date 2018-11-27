#include <stdio.h>
#include <math.h>
#include "Differentiator.h"

double differentiate(Function& f, double x, double err) {
	int n ;
	double h;
	double dif;
	double difPrevious;

	difPrevious = (f(x+1.0) - f(x-1.0)) / 2.0;

	for(n = 2; n < 1000; n++) {
		h = 1.0 / n;
		dif = (f(x+h) - f(x-h)) / (2 * h);

		if(fabs(dif - difPrevious) < err) {
			return dif;
		}

		difPrevious = dif;
	}

	printf("Warning: Differentiator could not find f'(%f)<EPS\n"; x);

	return dif;
}
