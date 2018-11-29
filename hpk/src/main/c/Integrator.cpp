#include <stdio.h>
#include <math.h>
#include "Integrator.h"



inline double simpsonsRule(Function &f, double a, double b, int n)
{
	double xi, xi_1;
	double result=0;

	double dX = (b-a)/(1.0*n);

	xi_1 = a;

	for(int i=0;i<n;i++)
	{
		xi  = xi_1;
		xi_1+= dX;

		result += f(xi_1);
		result += 4*f((xi + xi_1)/2.0);
		result += f(xi);
	}

	result *= (b-a)/(6.0*n);

	return result;
}

/**
	*             b
	*			 /
	* Calculate / f(t) dt
	*          /
	*         a
	*/
double integrate(Function &f, double a, double b, double EPS)
{
	int n;
	double dif;
	double difPrevious;

	difPrevious = simpsonsRule(f,a,b,1);

	for(n=2;n<100;n++)
	{
		dif = simpsonsRule(f,a,b,n);

		if(fabs(difPrevious - dif)<EPS)
		{
			return dif;
		}

		difPrevious = dif;
	}

	printf("This would be a warning, because the function could not find F(x)<EPS for a=%f and b=%f\n",a,b);

	return dif;
};
