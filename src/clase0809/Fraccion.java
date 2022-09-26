package src.clase0809;

public class Fraccion implements Relacionable{
    private int numerador;
    private int denominador;

    public Fraccion () {
        this.numerador = 0;
        this.denominador = 1;
    }

    public Fraccion (int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    @Override
    public boolean esMayorQue(Relacionable input) {
        if (instanciaValida(input)) {
            Fraccion f = (Fraccion) input;
            if ((this.numerador / (double) this.denominador) > (f.numerador / (double) f.denominador)) {
                return true;
            }
            return false;
        } else return false;
    }

    @Override
    public boolean esMenorQue(Relacionable input) {
        if (instanciaValida(input)) {
            Fraccion f = (Fraccion) input;
            if ((this.numerador / (double) this.denominador) < (f.numerador / (double) f.denominador)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public boolean esIgualQue (Relacionable input) {
        if (instanciaValida(input)) {
            Fraccion f = (Fraccion) input;
            if ((this.numerador / (double) this.denominador) == (f.numerador / (double) f.denominador)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean instanciaValida(Relacionable input) {
        if (input == null) {
            return false;
        }
        if (!(input instanceof Fraccion)) {
            return false;
        }
        return true;
    }

    //Método para simplificar una fracción
    private void simplificar() {
        int n = mcd(); //se calcula el mcd de la fracción
        numerador = numerador / n;
        denominador = denominador / n;
    }

    //Cálculo del máximo común divisor por el algoritmo de Euclides
    //Lo utiliza el método simplificar()
    private int mcd() {
        int u = Math.abs(numerador); //valor absoluto del numerador
        int v = Math.abs(denominador); //valor absoluto del denominador
        if (v == 0) {
            return u;
        }
        int r;
        while (v != 0) {
            r = u % v;
            u = v;
            v = r;
        }
        return u;
    }

    @Override
    public String toString() {
        simplificar();
        return numerador + "/" + denominador;
    }


}
