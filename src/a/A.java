package a;

import java.util.ListIterator;

public class A {

	public static void main(String[] args) {
		It<Integer> it = new It<Integer>(new Integer[] { 1, 2, 3, 4 });

		while (it.hasPrevious()) {
			System.out.println(it.previous());
		}

		System.out.println("---");

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("---");

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("---");

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("---");

		while (it.hasPrevious()) {
			System.out.println(it.previous());
		}
		System.out.println("---");
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("---");

		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("---");

		while (it.hasPrevious()) {
			System.out.println(it.previous());
		}
		System.out.println("---");

		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("---");
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("---");
		while (it.hasPrevious()) {
			System.out.println(it.previous());
		}
		System.out.println("---");
	}

}

class It<E> implements ListIterator<E> {
	E[] collection;
	int position = -1;

	public It(E[] collection) {
		super();
		this.collection = collection;
	}

	@Override
	public boolean hasNext() {
		return position < collection.length - 1;
	}

	@Override
	public E next() {
		return collection[++position];
	}

	@Override
	public int nextIndex() {
		return position + 1;
	}

	@Override
	public boolean hasPrevious() {
		return position > -1;
	}

	@Override
	public E previous() {
		return collection[position--];
	}

	@Override
	public int previousIndex() {
		return position;
	}

	@Override
	public void add(E e) {
	}

	@Override
	public void remove() {
	}

	@Override
	public void set(E e) {
	}
}

class It2<E> implements ListIterator<E> {
	E[] collection;
	int position;

	public It2(E[] collection) {
		super();
		this.collection = collection;
	}

	@Override
	public boolean hasNext() {
		return position < collection.length;
	}

	@Override
	public E next() {
		return collection[position++];
	}

	@Override
	public int nextIndex() {
		return position;
	}

	@Override
	public boolean hasPrevious() {
		return position > 0;
	}

	@Override
	public E previous() {
		return collection[--position];
	}

	@Override
	public int previousIndex() {
		return position - 1;
	}

	@Override
	public void add(E e) {
	}

	@Override
	public void remove() {
	}

	@Override
	public void set(E e) {
	}
}
