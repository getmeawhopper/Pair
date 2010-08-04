package net.reisub.util;
import java.io.Serializable;

public class Pair<A extends Serializable, B extends Serializable> implements Serializable  {
	private static final long serialVersionUID = 5417502504737554784L;
	public A first;
	public B second;

	public Pair(A a, B b) {
		first = a;
		second = b;
	}

	public String toString() {
		return "( " + first.toString() + " , " + second.toString() + " )";
	}

	public int hashCode() {
		return first.hashCode() + second.hashCode();
	}

	public boolean equals(Pair<A, B> other) {
		return first.equals(other.first) && second.equals(other.second);
	}
}