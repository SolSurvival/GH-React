package lanceLab4;

public class Class1 {

	private int one;
	private int two;
	
	public void aAndB(int a, int b) {
		this.one = a;
		this.two = b;		
	}
	public int getOne() {
		return one;
	}
	public void setOne(int one) {
		this.one = one;
	}
	public int getTwo() {
		return two;
	}
	public void setTwo(int two) {
		this.two = two;
	}
	public void returnSum(int a, int b) {
		
		int sum = a + b;
		
		String total = String.valueOf(sum);
		String numA = String.valueOf(a);
		
		if(total.length() == numA.length()) {
			System.out.println("Your total is " + sum);
		}else {
			System.out.println("Your total is larger than " + a);
		}
	}
	
}
