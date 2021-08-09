package object_oriented_programming;

public class CallStackTest {

	public static void main(String[] args) {
		firstMethod();
		
	}

	static void firstMethod() {
		secondMethod();
	}

	static void secondMethod() {
		System.out.println("SecondMethod()");
	}

}
