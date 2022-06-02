package btthread;

public class Main {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator("teo");
        NumberGenerator numberGenerator1 = new NumberGenerator("real");
        Thread thread1=new Thread(numberGenerator);
        Thread thread2=new Thread(numberGenerator1);
        thread2.setPriority(10);
        thread1.start();
        thread2.start();
    }

}
