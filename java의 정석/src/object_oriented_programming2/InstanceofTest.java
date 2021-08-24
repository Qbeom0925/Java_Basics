package object_oriented_programming2;

public class InstanceofTest {

	public static void main(String[] args) {
		FireEngine fe = new FireEngine();
		
		if(fe instanceof FireEngine) {
			System.out.println("this is a FireEngine instance.");
		}
		
		if(fe instanceof Car) {
			System.out.println("this is a Car instance.");
		}
		
		if(fe instanceof Object) {
			System.out.println("this is a an Object instance.");  
		}
		System.out.println(fe.getClass().getName());  //클래스의 이름을 출력

	}
}
