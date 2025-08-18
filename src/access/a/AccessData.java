package access.a;

public class AccessData {

    public int publicFiled;
    int defaultField;
    private int privatefield;

    public void publicMethod() {
        System.out.println("publicMethod 호출 " + publicFiled);
    }

    void defaultMethod() {
        System.out.println("defaultMethod 호출 " + defaultField);
    }

    private void privateMethod() {
        System.out.println("privateMethod 호출 " + privatefield);
    }

    public void innerAccess() {
        System.out.println("내부 호출");
        publicFiled = 100;
        defaultField = 200;
        privatefield = 300;
        publicMethod();
        defaultMethod();
        privateMethod();
    }
}
