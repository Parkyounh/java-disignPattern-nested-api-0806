package nested.d;

public class A {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	class B{
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	static class C{
		void method() {
//			field1 = 10;  //사용 불가
//			method1();
			new A().field1 = 10;
			new A().method1();
			
			field2 = 10;
			method2();
		}
	}
}
