package helloWorld;

public class Rechnen {

	public String Berechnen(int i,int j) {
	String text ="";
	
	if (i+j < 10 ) {
		text = "KleineSumme";
	}
	
	if (i+j >10) {
		text = "Gro�eSumme";
	}
	
	return text;

}
}