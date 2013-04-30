package oracle.certified.java.associate.exception;

public class Return {

    public static void main(String[] args) {
        System.out.println(foo());
    }

    private static String foo() throws RuntimeException {

        try {
            throw new Exception();
            // return "1";
        } catch (Exception e) {
            return "2";
        } finally {
            return "3";
        }

        // return "";
    }
}
