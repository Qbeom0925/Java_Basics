package object_oriented_programming;

class Car2{
	String color;
	String gearType;
	int door;
	
	Car2(){
		this("white", "auto", 4);
	}
	
	Car2(String color){
		this(color, "auto", 4);
	}
	
	Car2(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}

public class CarTest2 {

	public static void main(String[] args) {
		Car2 c1 = new Car2();
		Car2 c2 = new Car2("blue");
		
		System.out.println("c1ÀÇ corlor = "+ c1.color + ", gearType="+c1.gearType+", door="+c1.door);
		System.out.println("c2ÀÇ corlor = "+ c2.color + ", gearType="+c2.gearType+", door="+c2.door);		
	}

}
