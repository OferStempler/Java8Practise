package ofer.stempler.lambda;

public class Test222 {
    public static void main(String[] args) {

        Runnable r = () -> System.out.println("Hi!");
        Runnable r2 = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(i);
            }
        };
        r.run();
//        r2.run();
    }
}
