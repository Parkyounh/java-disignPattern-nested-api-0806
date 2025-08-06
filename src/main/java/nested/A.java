package nested;

public class A {
	class B{
		
	}
	static class C{
		
	}
	void method() {
		class D{}
		D d1 = new D();
	}
	public static void main(String[] args) {
		A a1 = new A();
		B b = a1.new B();  //B b = new B(); 사용 불가
		
		B b1 = new A().new B();
		
		C c= new C();
		A.C c1 = new A.C();
	}
}
