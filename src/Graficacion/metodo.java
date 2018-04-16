package Graficacion;



public class metodo {

    public double raiz(funcion f, double x0, double x1, int c, double e)  {
        double r = Double.NaN;
        double x2 = x0;
        int k = 0;
        while (Math.abs(f.evaluar(x2)) > e && k < c) {
            x2 = x0 - f.evaluar(x0) * (x1 - x0) / (f.evaluar(x1) - f.evaluar(x0));
            x0 = x1;
            x1 = x2;
            k++;
        }
        if (k < c) {
            r = x2;
        }
        return r;
    }
}
