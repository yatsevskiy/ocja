package edu.inner;

import java.util.logging.Logger;

public class Anonymous
{
    public interface Interface1
    {
        public abstract void function();
    }

    public static interface Interface2
    {
        public abstract void function();
    }

    private static Logger logger = Logger.getAnonymousLogger();

    @SuppressWarnings("unused")
    private Interface1    anonymousInterface1Implementation;
    @SuppressWarnings("unused")
    private Interface2    anonymousInterface2Implementation;

    private int           field1 = 100;
    private int           field2 = 200;

    public Anonymous()
    {
        anonymousInterface1Implementation = new Interface1()
        {
            public void function()
            {
                logger.info("field 1 = " + field1 + ", field 2 = " + field2);
            }
        };

        anonymousInterface2Implementation = new Interface2()
        {
            public void function()
            {
                logger.info("field 1 = " + field1 + ", field 2 = " + field2);
            }
        };
    }

    public static void main(String[] args)
    {
        @SuppressWarnings("unused")
        Interface1 i1 = new Interface1()
        {
            @Override
            public void function()
            {
//                 logger.info("field 1 = " + field1 + ", field 2 = " + field2);
            }
        };

        @SuppressWarnings("unused")
        Interface2 i2 = new Interface2()
        {
            @Override
            public void function()
            {
                // logger.info("field 1 = " + field1 + ", field 2 = " + field2);
            }
        };
    }
}
