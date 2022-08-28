package model;

public class Counter_Model {
	private int value;

	public Counter_Model() {
		this.value = 0;
	}

	public Counter_Model(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	};
	public void increment() {
		this.value++;
	}
	public void decrement() {
		this.value--;
	}
	public void resetCounter() {
		this.value = 0;
	}
}
