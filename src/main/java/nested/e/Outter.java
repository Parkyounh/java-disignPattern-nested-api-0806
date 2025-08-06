package nested.e;

public class Outter {
	public void method1(int arg) {
		int a =1;
//		a =2;
//		arg =200;
		class Inner{
			public void method() {
				int result = arg +100;   //여기서 계산 할태니 arg에 final 부여
			}
		}
	}
}
