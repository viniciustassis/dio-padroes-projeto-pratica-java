package br.com.java.Adapter;

import br.com.java.Adapter.Arredondados.PinoRedondo;
import br.com.java.Adapter.Quadrados.PinoQuadrado;

// Adapter permite o encaixe do pino quadrado no burraco redondo
public class PinoQuadradoAdapter extends PinoRedondo {
    private PinoQuadrado pino;

    public PinoQuadradoAdapter(PinoQuadrado pino) {
        this.pino = pino;
    }

    @Override
    public double getRaio() {
        double result;
        // Calcula o raio mínimo necessário para encaixar o pino quadrado no burraco
        // redondo
        result = (Math.sqrt(Math.pow((pino.getLargura() / 2), 2) * 2));
        return result;
    }
}
