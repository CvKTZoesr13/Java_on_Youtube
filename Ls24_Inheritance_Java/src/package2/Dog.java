package package2;

public class Dog extends Animal {

	public Dog() {
		super("Dog");
		// TODO Auto-generated constructor stub
	}
	public void bark() {
		System.out.println("G�u g�u");
	}
	
	
	@Override
	public void eat() {
		super.eat();
	}
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		d.bark();
	}
}
