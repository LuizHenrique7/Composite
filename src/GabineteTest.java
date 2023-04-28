import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GabineteTest {

    @Test
    void deveRetornarDescricaoGabinete() {
        Computador computador1 = new Computador("Cybertron");

        Computador computador2 = new Computador("Helix");
        Teclado teclado2 = new Teclado("Teclado Mecânico HyperX ", "Abnt2");
        computador2.addComponente(teclado2);

        Computador computador3 = new Computador("Quantum");
        Teclado teclado3 = new Teclado("Teclado Gamer Razer", "Abnt2");
        Teclado teclado4 = new Teclado("Teclado Logitech", "Abnt2");
        computador3.addComponente(teclado3);
        computador3.addComponente(teclado4);

        Computador computadorNeuronet = new Computador("Neuronet");
        computadorNeuronet.addComponente(computador1);
        computadorNeuronet.addComponente(computador2);
        computadorNeuronet.addComponente(computador3);

        Gabinete gabinete = new Gabinete();
        gabinete.setDescricao(computadorNeuronet);

        assertEquals("Computador: Neuronet\n" +
                "Computador: Cybertron\n" +
                "Computador: Helix\n" +
                "Teclado: Teclado Mecânico HyperX  - modelo: Abnt2\n" +
                "Computador: Quantum\n" +
                "Teclado: Teclado Gamer Razer - modelo: Abnt2\n" +
                "Teclado: Teclado Logitech - modelo: Abnt2\n", gabinete.getDescricao());
    }

    @Test
    void deveRetornarExecacaoGabineteSemDescricao() {
        try {
            Gabinete gabinete = new Gabinete();
            gabinete.getDescricao();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Gabinete sem descrição", e.getMessage());
        }
    }
}

