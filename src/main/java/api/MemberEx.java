package api;

public class MemberEx {
	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		
		System.out.println(obj1.hashCode()); //객체를 식별하는 정수값, 메모리 번지를 통해 만듬0
		
		if (obj1.equals(obj2)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
	}
}
