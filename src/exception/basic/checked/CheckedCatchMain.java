package exception.basic.checked;

public class CheckedCatchMain {

    public static void main(String[] args) {
        Service service = new Service();
        service.callCatch();
        System.out.println("정사 종료");
    }
}
