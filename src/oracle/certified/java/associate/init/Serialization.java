package oracle.certified.java.associate.init;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization {

	public static void main(String[] args) {

		Whole o = new Whole();

		o.arg = 777;
		o.part.arg = 1100;

		ByteArrayOutputStream outputSream = new ByteArrayOutputStream();

		try {
			ObjectOutputStream out = new ObjectOutputStream(outputSream);
			out.writeObject(o);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		ByteArrayInputStream inputStream = new ByteArrayInputStream(
				outputSream.toByteArray());

		try {
			ObjectInputStream in = new ObjectInputStream(inputStream);
			o = (Whole) in.readObject();
		} catch (IOException e) {
			throw new RuntimeException(e);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}

		System.out.println(o.arg);
		System.out.println(o.part.arg);

	}
}

class Whole implements Serializable {

	int arg;
	transient Part part = new Part(1);

	private void writeObject(ObjectOutputStream out) throws IOException {

		out.defaultWriteObject();
		out.writeInt(part.arg);
	}

	private void readObject(ObjectInputStream in) throws IOException,
			ClassNotFoundException {

		in.defaultReadObject();
		part = new Part(in.readInt());
	}
}

class Part {

	int arg;

	public Part(int arg) {
		this.arg = arg;
	}
}
