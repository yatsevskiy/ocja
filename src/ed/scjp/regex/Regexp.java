package ed.scjp.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexp
{
    public static void main(String[] args)
    {
        String s = "aaaa.aaaa.aaaa.aaaa.aaaa.aaaa.docx";
        String regex = "\\.(?![a-z0-9]+$)";

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
