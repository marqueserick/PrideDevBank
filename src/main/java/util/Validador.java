package util;

public class Validador {
	public static void validaCPF(String CPF) {
		if(CPF.length()!=11) {
			throw new IllegalArgumentException("CPF Inválido!");
		}
	}

}
