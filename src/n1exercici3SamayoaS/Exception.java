package n1exercici3SamayoaS;

import java.util.ArrayList;
import java.util.List;

public class Exception {
private List<String> month = new ArrayList<String>(); 
	
	public List<String> getMonth() {
		return month;
	}

	/*public int size () {
		return month.size();	
	}*/
	
	public void addMonth(String mes) {
		month.add(mes);	
	}

	@Override
	public String toString() {
		return "Month [month=" + month + "]";
	}	


	public void PrintException() {
		try
		{
			System.out.println(month.toString());			
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("No hay nada en la lista");	
		}
		
	}

}
