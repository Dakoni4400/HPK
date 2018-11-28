/*
 * wrb_Differentiator.c
 *
 *  Created on: 28 Nov 2018
 *      Author: Till
 */

#include "de_lab4inf_wrb_numeric_Differentiator.h"
#include "Differentiator.h"
#include "JavaFunction.h"

#define EPS 1.E-8

JNIEXPORT jdouble JNICALL Java_de_lab4inf_wrb_numeric_Differentiator_differentiate
  (JNIEnv * env, jobject _this, jobject f, jdouble x) {
	JavaFunction func = JavaFunction(env, f);
	return differentiate(func, x, EPS);
}
