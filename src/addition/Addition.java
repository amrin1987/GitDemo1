package addition;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition obj=new Addition();
		obj.additionMethod(5,6);
	}
public  int additionMethod(int a, int b) {
	 
	     int c=a+b;
	     System.out.println("result is "+c);
		return c;
}
}
