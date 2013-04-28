package ed.scjp.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexp2
{
    public static void main(String[] args)
    {
        // (?:X) is a non-capturing group

        String regex = "(a(?:b*))+(c*)";
        String s = "abbabcd";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);

        if (m.find())
        {
            final int groupCount = m.groupCount();
            for (int i = 0; i < groupCount + 1; i++)
            {
                System.out.println(m.group(i));
            }
        }
    }
}
