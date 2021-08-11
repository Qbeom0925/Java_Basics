package object_oriented_programming;

class Date1{
	int value;
}

class Date2 {
	int value;
	
	Date2(int x){ //매개변수가 있는 생성자
		value = x;
	}
}

public class ConstructorTest {

	public static void main(String[] args) {
		Date1 d1 = new Date1();
		Date2 d2 = new Date2(); //compile오류
	}

}
