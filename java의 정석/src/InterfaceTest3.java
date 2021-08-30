public class InterfaceTest3 {

	public static void main(String[] args) {
		A1 a = new A1();
		a.methodA();
	}

}

class A1{
	void methodA() {
		I1 i = InstanceManager.getInstance();
		i.methodB();
		System.out.println(i.toString());
	}
}

interface I1 {
	public abstract void methodB();
}

class B1 implements I1{
	public void methodB() {
		System.out.println("methodB in B calss");
	}
	
	public String toString() {return "class B";}
}

class InstanceManager{
	public static I1 getInstance() {
		return new B1();
	}
}