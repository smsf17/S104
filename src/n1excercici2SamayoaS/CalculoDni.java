package n1excercici2SamayoaS;

public class CalculoDni {
	private int numeroDni;

	public CalculoDni(int numeroDni) {
		super();
		this.numeroDni = numeroDni;
	}

	public int getNumeroDni() {
		return numeroDni;
	}

	public void setNumeroDni(int numeroDni) {
		this.numeroDni = numeroDni;
	}
	
	public String letraDni(int numeroDni) {
		
		String letrasValidas = "TRWAGMYFPDXBNJZSQVHLCKE";
		String letraDni;
		int resto;
		
		resto = numeroDni % 23;
		letraDni = letrasValidas.substring(resto, resto+1);
		
		return letraDni;	
	}

	@Override
	public String toString() {
		return "DNI " + numeroDni + letraDni(numeroDni);
	}
}
