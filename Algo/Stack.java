package Algo;

public class Stack {

	private int[] data;
	private int size;
	private int top;

	public Stack() {
		size = 10; // Setting stack default size
		data = new int[size];
		top = -1;
	}

	public Stack(int size) {
		this.size = size;
		data = new int[this.size];
		top = -1;
	}

	public void push(int value) {
		if (top == size - 1)
			System.out.println("Stack is full!!! Sorry!!!");
		else
			data[++top] = value;
	}

	public int pop() {
		if (top == -1) {
			System.out.println("Stack is Empty!!! Sorry!!!");
			return -1;
		}
		else
		return data[top--];
	}

	public void print() {
		System.out.println("Stack Elements");
		for (int counter = 0; counter <= top; counter++)
			System.out.println(data[counter]);
	}

}
