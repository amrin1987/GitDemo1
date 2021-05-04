package addition;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition obj = new Addition();
		obj.additionMethod(5, 6);
		obj.additionMethod(9, 0, 8);
		obj.additionMethod(0, 3, 5, 7);
		System.out.println("Theese are results ");
		System.out.println("Theese are results 2 ");
	}

	public int additionMethod(int a, int b) {

		int c = a + b;
		System.out.println("result is " + c);
		return c;
	}

	public int additionMethod(int x, int y, int z) {
		int total = x + y + z;
		System.out.println("result is " + total);
		return total;

	}
	
	public int additionMethod(int a1, int a2, int a3,int a4) {
		int subtotal = a1 + a2 + a3+ a4;
		System.out.println("result is " + subtotal);
		return subtotal;

	}
}
