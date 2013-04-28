package edu.cloneable;

public class CloneableImplementation implements Cloneable
{
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

    public static void main(String[] args)
    {
    }
}
