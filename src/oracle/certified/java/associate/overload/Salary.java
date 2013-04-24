package oracle.certified.java.associate.overload;

public class Salary {
    public static void main(String[] args) {
        double rValue = 1700;

        // System.out.println(rValue);

        double fullSlr = rValue / 0.964 / 0.85;
        // System.out.println(rValue);

        double ESV = rValue * .6324;
        System.out.println(fullSlr + ESV);
    }
}
