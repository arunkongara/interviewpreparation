package DataStructures;

import java.util.EmptyStackException;

import DataStructuresInterface.StackInterface;

public class StackImpl implements StackInterface {
	private int top = 0;
	int[] stack;

	public StackImpl(int size) {
		stack = new int[size];
	}

	@Override
	public void push(int elemnt) {
		stack[top] = elemnt;
		top++;
	}

	@Override
	public int pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}

		return stack[--top];
	}

	@Override
	public int peek() {
		return stack[top];
	}

	@Override
	public boolean isEmpty() {
		if (top == 0)
			return true;
		else
			return false;
	}

	@Override
	public int SearchForElemnt(int elemnt) {
		for (int i : stack) {
			if (stack[i] == elemnt) {
				return i;
			}
		}
		return -1;
	}

}
