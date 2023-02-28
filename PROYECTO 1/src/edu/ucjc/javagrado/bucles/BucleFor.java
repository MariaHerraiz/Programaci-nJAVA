package edu.ucjc.javagrado.bucles;

public class BucleFor {

	public static void main(String[] args) {
		/* BUCLE FOR
		 *  Nomenclatura: for ( INICIACION ; CONDICION ; COMO VARÍA )
		 */
		for (int i=0; i<10 ; i++) {
			System.out.println(i);
		}
		
		for (int i=0 ; i<10 ; i+=2) {
			if (i%2 == 0 && i<8) {
				continue;
			}else if (i%3 == 0) {
				break;
			}
			System.out.println(i);
		}
			
;
	}

}
