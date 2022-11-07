package FunctionalInterface;

public class Test {
	public static void main(String[] args) {
		MyFunctionalInterface m=(int x,int y)->x*y;
		m.calculate(10, 5);
		System.out.println();
	}

}
