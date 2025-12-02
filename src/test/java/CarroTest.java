import org.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarroTest {
    @Test
    void testClone() throws CloneNotSupportedException {
        Carro carro = new Carro("Fiat", "siena", 4, 200);

        Carro carroClone = carro.clone();
        carroClone.setMarca("Chevrolet");
        carroClone.setNumPortass(2);

        assertEquals("Carro{marca=Fiat, modelo='siena', numero de portas=4, velocidade maxima='200'}", carro.toString());
        assertEquals("Carro{marca=Chevrolet, modelo='siena', numero de portas=2, velocidade maxima='200'}", carroClone.toString());
    }
}