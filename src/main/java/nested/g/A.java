package nested.g;

public class A {
	B field1 = new B();
	class B{}
	
	void method() {
		B v1 = new B();
	}
	
}
