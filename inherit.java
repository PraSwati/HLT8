
class Super_cal {
	int i;
	
	public void add(int a, int b) {
		i=a+b;
		System.out.println("Addition of the given numbers : " +i);		
	}
	
	public void subs(int a, int b) {
		i=a-b;
		System.out.println("Substraction on the given numbers : " +i);
	}
}

public class inherit extends Super_cal {
	public void mul(int a, int b) {
		i=a*b;
		System.out.println("Product of the given numbers : " +i);
	}
	public static void main(String args[]) {
		int a = 20, b = 15;
		inherit cal = new inherit();
		cal.add(a, b);
		cal.subs(a, b);
		cal.mul(a, b);		
	}
}