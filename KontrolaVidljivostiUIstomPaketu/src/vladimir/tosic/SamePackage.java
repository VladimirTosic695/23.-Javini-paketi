package vladimir.tosic;

public class SamePackage {

	SamePackage(){
		Base b = new Base();
		System.out.println("Konstruktor klase SamePackage.");
		
		
		//System.out.println("Base klasa n_def = "+b.n_pri);
		System.out.println("Base klasa n_def = "+b.n_def);
		System.out.println("Base klasa n_pro = "+b.n_pro);
		System.out.println("Base klasa n_pub = "+b.n_pub);
	}

}
