package br.com.java;

import br.com.java.Adapter.PinoQuadradoAdapter;
import br.com.java.Adapter.Arredondados.BurracoRedondo;
import br.com.java.Adapter.Arredondados.PinoRedondo;
import br.com.java.Adapter.Quadrados.PinoQuadrado;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    public static void main(String[] args) {
        TestarAdapter();
    }

    public static void TestarAdapter() {
        // Round fits round, no surprise.
        BurracoRedondo burracoRedondo = new BurracoRedondo(5);
        PinoRedondo pinoRedondo = new PinoRedondo(5);
        if (burracoRedondo.encaixa(pinoRedondo)) {
            /* System.out.println("Round peg r5 fits round hole r5."); */
            System.out.println("Pino redondo de raio 5 encaixa no burraco redondo de raio 5");
        }

        PinoQuadrado pinoQuadradoPequeno = new PinoQuadrado(2);
        PinoQuadrado pinoQuadradoGrande = new PinoQuadrado(20);
        // hole.fits(smallSqPeg); // Won't compile.

        // Adapter solves the problem.
        PinoQuadradoAdapter pinoQuadradoPequenoAdapter = new PinoQuadradoAdapter(pinoQuadradoPequeno);
        PinoQuadradoAdapter pinoQuadradoGrandeAdapter = new PinoQuadradoAdapter(pinoQuadradoGrande);
        if (burracoRedondo.encaixa(pinoQuadradoPequenoAdapter)) {
            // System.out.println("Square peg w2 fits round hole r5.");
            System.out.println("Pino quadrado de largura 2 encaixa no burraco redondo de 5");
        }
        if (!burracoRedondo.encaixa(pinoQuadradoGrandeAdapter)) {
            // System.out.println("Square peg w20 does not fit into round hole r5.");
            System.out.println("Pino quadrado de largura 20 nao encaixa no burraco redondo de 5");
        }
    }
}
