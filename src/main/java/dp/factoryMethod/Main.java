package dp.factoryMethod;

public class Main {
 public static void main(String[] args) {
	 Factory factory = new IDCardFactory();
	 Product card1 = factory.create("박윤호");
	 card1.use();
	 Product card2 = factory.create("김하나");
	 card2.use();
 }
}
