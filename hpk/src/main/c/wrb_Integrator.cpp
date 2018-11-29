/*
 * wrb_Integrator.c
 *
 *  Created on: 28 Nov 2018
 *      Author: Till
 */

#include "de_lab4inf_wrb_numeric_Integrator.h"
#include "Integrator.h"
#include "JavaFunction.h"

#define EPS 1.E-9

JNIEXPORT jdouble JNICALL Java_de_lab4inf_wrb_numeric_Integrator_integrate
  (JNIEnv * env, jobject _this, jobject f, jdouble a, jdouble b) {
	JavaFunction func = JavaFunction(env, f);
	return integrate(func, a, b, EPS);
}
