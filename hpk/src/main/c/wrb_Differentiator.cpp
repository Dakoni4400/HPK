/*
 * wrb_Differentiator.c
 *
 *  Created on: 28 Nov 2018
 *      Author: Till
 */

#include "de_lab4inf_wrb_numeric_Differentiator.h"
#include "Differentiator.h"
#include "JavaFunction.h"

JNIEXPORT jdouble JNICALL Java_de_lab4inf_wrb_numeric_Differentiator_differentiate
  (JNIEnv * env, jobject _this, jobject f, jdouble x) {
	jfieldID fid;
	jdouble err;
	jdouble y;

	JavaFunction func = JavaFunction(env, f);

	jclass clazz = env->GetObjectClass(_this);
	fid = env->GetFieldID(clazz, "error", "D");
	if(fid == NULL) {
		return 0; //failed to read error field
	}
	err = env->GetDoubleField(_this, fid);

	try {
		y = differentiate(func, x, err);
	} catch (...) {
		jclass newExcCls = env->FindClass("java/lang/ArithmeticException");
		if(newExcCls == 0)
			return 0;
		env->ThrowNew(newExcCls, "no convergence");
	}

	return y;

}
