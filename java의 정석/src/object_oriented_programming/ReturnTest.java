package object_oriented_programming;

public class ReturnTest {

	public static void main(String[] args) {
		ReturnTest r = new ReturnTest();
		
		int result = r.add(3,5);
		
		System.out.println(result);
		
		int[] result2 = {0};
		r.add(3,5,result2);
		System.out.println(result2[0]);
	}
	
	void add(int a, int b, int[] result) {
		result[0] =a+b;
	}

	int add(int a, int b) {
		return a+b;
	}

}
