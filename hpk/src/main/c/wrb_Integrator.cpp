/*
 * wrb_Integrator.c
 *
 *  Created on: 28 Nov 2018
 *      Author: Till
 */

#include "de_lab4inf_wrb_numeric_Integrator.h"
#include "Integrator.h"
#include "JavaFunction.h"

JNIEXPORT jdouble JNICALL Java_de_lab4inf_wrb_numeric_Integrator_integrate
  (JNIEnv * env, jobject _this, jobject f, jdouble a, jdouble b) {
	jfieldID fid;
	jdouble eps;
	jdouble y;

	JavaFunction func = JavaFunction(env, f);

	jclass clazz = env->GetObjectClass(_this);
	fid = env->GetFieldID(clazz, "eps", "D");
	if(fid == NULL) {
		return 0; //failed to read error field
	}
	eps = env->GetDoubleField(_this, fid);

	try{
		y = integrate(func, a, b, eps);
	} catch(...) {
		jclass newExcCls = env->FindClass("java/lang/ArithmeticException");
		if(newExcCls == 0)
			return 0;
		env->ThrowNew(newExcCls, "no convergence");
	}

	return y;
}
