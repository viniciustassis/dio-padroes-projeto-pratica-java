package br.com.java.Adapter.Quadrados;

public class PinoQuadrado {
    private double largura;

    public PinoQuadrado(double largura) {
        this.largura = largura;
    }

    public double getLargura() {
        return this.largura;
    }

    public double getArea() {
        double result;
        result = Math.pow(this.largura, 2);
        return result;
    }
}
