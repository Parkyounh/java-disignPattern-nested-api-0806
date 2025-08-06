package nested.f;

public class Outter {
	String field = "OUtter-field";
	void method() {
		System.out.println("Outter-method");
	}
	
	class Nested {
		String field = "Nested-field";
		void method() {
			System.out.println("Nested-method");
		}
		void print() {
			System.out.println(Outter.this.field);  //그냥 this.field만 쓰면 Nested의 field 참조ㅌ
			Outter.this.method();
		}
	}
	
	public static void main(String[] args) {
		Outter.Nested nested = new Outter().new Nested();
		nested.print();
	}
}
