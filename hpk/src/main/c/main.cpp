/*
 * main.cpp
 *
 *  Created on: 28 Nov 2018
 *      Author: Till
 */

#include <stdio.h>
#include <math.h>
#include "Function.h"
#include "Differentiator.h"

#define EPS 1.E-9

/**
 * Main to test differentiate when code is compiled as executable
 */
int main()
{
	double y,dy,x = 1.5;

	Function f = Function(sin);
	y=f(x);
	dy=differentiate(f,x, EPS);

	printf("x=%f \t y=%f \t dy=%f\n",x,y,dy);

	getchar();

	return 0;
}


