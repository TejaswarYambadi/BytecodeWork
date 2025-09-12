package thread_Examples;

class Count {
    int i = 0;

    public void incremented() {
        i++;   // not synchronized
    }
}

public class Counter {
    public static void main(String[] args) {
        Count c = new Count();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                c.incremented();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                c.incremented();
            }
        });

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // No join here → main thread prints immediately
        System.out.println("Final count = " + c.i);
    }
}
