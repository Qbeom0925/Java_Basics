package object_oriented_programming2;

final class Singleton{
	private static Singleton s = new Singleton();
	
	private Singleton() {
		//...
	}
	
	public static Singleton getSingleton() {
		if(s==null)
			s = new Singleton();
		
		return s;
	}
}

public class SingletonTest {

	public static void main(String[] args) {
		Singleton s = Singleton.getSingleton();		
	}

}
