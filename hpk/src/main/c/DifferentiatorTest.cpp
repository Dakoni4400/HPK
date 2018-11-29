/*
 * DifferentiatorTest.cpp
 *
 *  Created on: 28 Nov 2018
 *      Author: Till
 */

#include <stdio.h>
#include <math.h>
#include "Function.h"
#include "Differentiator.h"
#include "CUnit.h"

#define EPS 1.0

//CUnitTestSuite suite;

int sinTest(int argc, char** argv) {
	double dy[5];
	int counter = 0;

	Function f = Function(sin);

	for(double i = 0; i <= 2; i += 0.5) {
		dy[counter] = differentiate(f,i,EPS);
		counter++;
	}

	assertEqualsF(dy[0], (double)1.0, EPS);
	assertEqualsF(dy[1], (double)0.877583, EPS);
	assertEqualsF(dy[2], (double)0.540302, EPS);
	assertEqualsF(dy[3], (double)0.0707372, EPS);
	assertEqualsF(dy[4], (double)-0.416147, EPS);

	return 0;
}

int expTest(int argc, char** argv) {
	double dy[5];
	int counter = 0;

	Function f = Function(exp);

	for(double i = 0; i <= 2; i += 0.5) {
		dy[counter] = differentiate(f,i,EPS);
		counter++;
	}

	assertEqualsF(dy[0], (double)1.0, EPS);
	assertEqualsF(dy[1], (double)1.64872, EPS);
	assertEqualsF(dy[2], (double)2.71828, EPS);
	assertEqualsF(dy[3], (double)4.48169, EPS);
	assertEqualsF(dy[4], (double)7.38906, EPS);

	return 0;

}

int sqrtTest(int argc, char** argv) {
	double dy[4];
	int counter = 0;

	Function f = Function(sqrt);

	for(double i = 0.5; i <= 2; i += 0.5) {
		dy[counter] = differentiate(f,i,EPS);
		counter++;
	}

	assertEqualsF(dy[0], (double)0.707107, EPS);
	assertEqualsF(dy[1], (double)0.5, EPS);
	assertEqualsF(dy[2], (double)0.408248, EPS);
	assertEqualsF(dy[3], (double)1/(2*sqrt(2)), EPS);

	return 0;

}

DECLARE_TEST(sin)

BEG_SUITE(suite)
	ADD_TEST(sin),
	ADD_TEST(exp),
	ADD_TEST(sqrt)
END_SUITE(suite)

RUN_SUITE(suite)

