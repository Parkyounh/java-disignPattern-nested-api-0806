package dp.templateMethod;

public abstract class AbstractDisplay {
	public abstract void open();
	public abstract void print();
	public abstract void close();
	public final void display() { //재정의 불가능하게 함 templateMethod
		open();
		for(int i=0;i<5;i++) {
			print();
		}
		close();
	}
}
