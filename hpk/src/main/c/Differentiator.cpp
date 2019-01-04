#include "Differentiator.h"
#include <math.h>


int functionCallCounterDifferentiator = 0;

double delta(Function &f, double h, double x) {
    double result = f(x + h) - f(x - h);
    functionCallCounterDifferentiator += 2;
    return result;
}

double diff_f(Function &f, double h, double x) {
    return (8 * delta(f, h, x) - delta(f, 2 * h, x)) / (12 * h);
}

bool isConvergent(double diff1h, double diff2h, double eps) {
    double approximation = fabs(((diff1h + diff2h) / 2));
    double absError = fabs(diff1h - diff2h);
    double relError = absError / approximation;


    if (absError < eps || relError < eps) {
        return true;
    }
    return false;
}

double differentiate(Function &f, double x, double eps) throw(int){
    functionCallCounterDifferentiator = 0;
    double h = 1.E-5;

    double diff1h = diff_f(f, h, x);
    double diff2h = diff_f(f, 2 * h, x);
    double result = (16 * diff1h - diff2h) / 15;

    if (isConvergent(diff1h, diff2h, eps)) {
        return result;
    } else {
        throw 0;
    }
}

