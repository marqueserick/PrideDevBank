package dominio;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CaixaEletronicoTest {
	//int notas[] = { 100, 50, 20, 10, 2 };
	
	@Test
	void deveSerPossivelSacarApenasNotasDeCem() {
	
		assertTrue(CaixaEletronico.retirar(100)[0]==1);
	}

}
