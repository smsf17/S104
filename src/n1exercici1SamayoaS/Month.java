package n1exercici1SamayoaS;

import java.util.ArrayList;
import java.util.List;

public class Month {
	
	private List<String> month = new ArrayList<String>(); 
	
	public List<String> getMonth() {
		return month;
	}

	public int size () {
		return month.size();	
	}
	
	public String august2() {
		String august = month.get(7);
		return august;	
	}
	
	public void addMonth(String mes) {
		month.add(mes);	
	}

	@Override
	public String toString() {
		return "Month [month=" + month + "]";
	}	

}
