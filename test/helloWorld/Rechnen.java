package helloWorld;

public class Rechnen {

	public String Berechnen(int i,int j) {
	String text ="";
	
	if (i+j < 10 ) {
		text = "KleineSumme";
	}
	
	if (i+j >10 && i+j <=100) {
		text = "MittlereSumme";
	}
	
	if (i+j >100) {
		text = "GrosseSumme";
	}
	
	return text;

}
}