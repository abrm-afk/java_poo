package p2;

public class Test {

	public static void main(String[] args) {
		 Pizza p1 = new Margherita();
	        System.out.println(p1);
	        
	        Pizza p2 = new Pan(new Margherita());
	        System.out.println(p2);
	        
	        Pizza p3 = new CheesyCrust(new Margherita());
	        System.out.println(p3);
	    }
		

	}


