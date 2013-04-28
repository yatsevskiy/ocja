package n;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class L3 {
    public static void main(String[] args) throws Exception {
        ByteArrayOutputStream bOut = new ByteArrayOutputStream();
        ObjectOutputStream oOut = new ObjectOutputStream(bOut);
        oOut.writeObject(new Whole());

        ByteArrayInputStream bIn = new ByteArrayInputStream(bOut.toByteArray());
        ObjectInputStream oIn = new ObjectInputStream(bIn);
        oIn.readObject();
    }
}

class Whole implements Serializable {
    transient Part part = new Part(1);
    int wholePart;

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.writeInt(part.partField);
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws Exception {
    	in.defaultReadObject(); // (1)
    	part = new Part(in.readInt()); // (2)
    }
}

class Part {

    int partField;

    public Part(int field) {
        this.partField = field;
    }
}
