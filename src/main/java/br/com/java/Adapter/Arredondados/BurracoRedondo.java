package br.com.java.Adapter.Arredondados;

public class BurracoRedondo {
    private double raio;

    public BurracoRedondo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return this.raio;
    }

    public boolean encaixa(PinoRedondo pino) {
        boolean result;
        result = (this.getRaio() >= pino.getRaio());
        return result;
    }
}
