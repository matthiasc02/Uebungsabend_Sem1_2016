package org.campus02.LV10a;

public class DemoKonto {

	public static void main(String[] args) {
		
		GiroKonto Test1 = new GiroKonto("Friedolin", 1000);
		Test1.einzahlen(1000);
		Test1.auszahlen(2000);
		
		
		JugendGiroKonto Test2 = new JugendGiroKonto("Fred", 1000, 300);
		Test2.einzahlen(1000);
		Test2.auszahlen(300);
		
		
		Konto Test2_Konto = Test2; //up cast
		Test2_Konto.auszahlen(300);
		
		Test2 = (JugendGiroKonto) Test2_Konto; //down cast nur zum selben möglich

	}

}
