package mainpackage;

public class TestBox2 {
	public static void main(String[] args) {
		Box2<Integer> box = new Box2<Integer>(15);
		System.out.println("Giá trị: " + box.getValue());
		Box2<String> box2 = new Box2<String>("Xin chào!");
		System.out.println("Giá trị: " + box2.getValue());
	}
}
