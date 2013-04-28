package edu.serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Logger;

public class SerializableClass implements Serializable
{
    /**
     * 
     */
    private static final long serialVersionUID = -8239569057946741348L;

    public transient int      field1;
    public int                field2;
    public transient int      field3;
    public int                field4;
    public static Logger      logger           = Logger.getAnonymousLogger();

    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        SerializableClass s = new SerializableClass();

        s.field1 = 100;
        s.field2 = 200;
        s.field3 = 300;
        s.field4 = 400;

        FileOutputStream fos = new FileOutputStream(new File("serialized.ser"));
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(s);

        oos.close();
        fos.close();

        FileInputStream fis = new FileInputStream(new File("serialized.ser"));
        ObjectInputStream ois = new ObjectInputStream(fis);

        s = (SerializableClass) ois.readObject();

        ois.close();
        fis.close();

        logger.info(s.toString());
    }

    @Override
    public String toString()
    {
        return "\nf1 = " + field1 + "\nf2 = " + field2 + "\nf3 = " + field3 + "\nf4 = " + field4;
    }
}
