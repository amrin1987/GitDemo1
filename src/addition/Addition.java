package addition;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition obj = new Addition();
		obj.additionMethod(5, 6);
		obj.additionMethod(9, 0, 8);
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
}
