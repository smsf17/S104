package n1exercici3SamayoaS;

import java.util.ArrayList;

public class Exception {
	private ArrayList<Integer> numeros= new ArrayList<Integer>();;
	private int sumaNumeros;
	
	public ArrayList<Integer> getNumeros() {
		return numeros;
	}

	public void addNumero(Integer numero) {
		numeros.add(numero);
	}

	public int getSumaNumeros() {
		return sumaNumeros;
	}

	public void setSumaNumeros(int sumaNumeros) {
		this.sumaNumeros = sumaNumeros;
	}

	public void sumaNumerosException() {
		try
		{
			for(int i=0; i<numeros.size(); i++) {
				sumaNumeros = numeros.get(i) + sumaNumeros;				
			}

		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("No hay numeros en la lista");	
		}
		
		}

}
