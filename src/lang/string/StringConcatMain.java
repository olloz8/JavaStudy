package lang.string;

public class StringConcatMain {

    public static void main(String[] args) {
        String a = "hello";
        String b = " java";

        String result1 = a.concat(b);
        String reuslt2 = a + b;
        System.out.println("result1 = " + result1);
        System.out.println("reuslt2 = " + reuslt2);
    }
}
