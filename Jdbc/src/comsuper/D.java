package comsuper;

public class D extends C {

	D() {
		this("rahul");
		System.out.println("222");

	}

	D(int i, int j) {
		
		System.out.println("444");
	}

	D(String s) {
		this(10.10,true);
		System.out.println("666");
	}

	D(double d, boolean b) {
     this (10,20);
     System.out.println("333");
     
	}
	public static void main(String[] args) {
		D d=new D();
	}

}
