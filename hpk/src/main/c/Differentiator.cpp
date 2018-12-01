#include "Differentiator.h"
#include <math.h>

double delta(Function &f, double h, double x) {
    double result = f(x + h) - f(x - h);
    return result;
}

double diff_f(Function &f, double h, double x) {
    return (8 * delta(f, h, x) - delta(f, 2 * h, x)) / (12 * h);
}

double differentiate(Function &f, double x, double err) throw(int){
    double h = 1.E-4;

    double diff1h = diff_f(f, h, x);
    double diff2h = diff_f(f, 2 * h, x);

    double result = (16 * diff1h - diff2h) / 15;

    if (fabs(diff1h - diff2h) > err) {
        result = NAN;
       throw 0;
    }

    return result;
}
