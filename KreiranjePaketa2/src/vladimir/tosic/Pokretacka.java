package vladimir.tosic;

public class Pokretacka {

	public static void main(String[] args) {
		
		Balance niz[] = new Balance[3];
		
		niz[0] = new Balance("Mika",123.45);
		niz[1] = new Balance("Zika",345.21);
		niz[2] = new Balance("Ljubivoje", -12.35);
		
		for(int i = 0; i < 3; i++) {
			niz[i].show();
		}

	}

}
