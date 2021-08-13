package object_oriented_programming;

class Document{
	static int cnt = 0;
	String name;
	
	Document() {
		this("제목없음"+ ++cnt);
	}
	
	Document(String name){
		this.name = name;
		System.out.println("문서 "+this.name+"가 생성되었습니다.");
	}
}

public class DocumentTest {

	public static void main(String[] args) {
		Document d1 = new Document();
		Document d2 = new Document("자바.txt");
		Document d3 = new Document();
		Document d4 = new Document();
		
	}

}
