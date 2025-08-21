package static1;

public class DataCountMain2 {

    public static void main(String[] args) {
        Counter counter = new Counter();
        Data2 data1 = new Data2("A", counter);
        System.out.println("A count=" + counter.count);

        Data1 data2 = new Data1("B");
        System.out.println("B count=" + counter.count);

        Data1 data3 = new Data1("C");
        System.out.println("C count=" + counter.count);
    }
}
