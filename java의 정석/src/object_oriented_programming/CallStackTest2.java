package object_oriented_programming;

public class CallStackTest2 {

	public static void main(String[] args) {
		System.out.println("main(String[] args)¿Ã Ω√¿€µ ");
		firstMethod();
		System.out.println("main(String[] args)¿Ã ¡æ∑·µ ");
	}

	static void firstMethod() {
		System.out.println("firstMethod()¿Ã Ω√¿€µ ");
		secondMethod();
		System.out.println("firstMethod()¿Ã ¡æ∑·µ ");
	}

	static void secondMethod() {
		System.out.println("secondMethod()¿Ã Ω√¿€µ ");
		System.out.println("secondMethod()¿Ã ¡æ∑·µ ");
		
	}

}
