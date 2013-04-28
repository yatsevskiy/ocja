package ed.scjp.serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class A
{
    public static void main(String ... args)
    {
        B b = new B();
        b.a = 100;
        b.b = 200;

        ObjectOutputStream save;
        ObjectInputStream restore;
        try
        {
            save = new ObjectOutputStream(new FileOutputStream("datafile"));
            save.writeObject(b);
            save.flush();

            restore = new ObjectInputStream(new FileInputStream("datafile"));
            b = (B) restore.readObject();
            System.out.println(b.a);
            System.out.println(b.b);
        }
        catch (FileNotFoundException e)
        {
            //
        }
        catch (IOException e)
        {
            //
        }
        catch (ClassNotFoundException e)
        {
            //
        }
    }

    static class B implements Serializable
    {
        transient int a;

        int b;

        public B()
        {
            System.out.println("Constructor");
        }
    }
}
