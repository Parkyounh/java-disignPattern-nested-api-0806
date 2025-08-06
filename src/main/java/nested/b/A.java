package nested.b;

public class A {
	A(){
		System.out.println("A 객체 생성");
	}
	static class B{
		B(){
			System.out.println("B 객체가 생성");
		}
		int field1;
		static int field2;
		void method() {}
		static void method2() {
			System.out.println("static method2");
		}
	}
	
	public static void main(String[] args) {
		A a = new A();
		A.B b = new A.B();
		b.method2();
		
	}
}
