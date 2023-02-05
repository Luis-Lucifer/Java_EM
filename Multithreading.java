public class Multithreading {
    public static void main(String[] args) {

        Thread t1 = new Thread(()-> {
            for (int i = 0; i < 8; i++) {
                System.out.println("Hey Team.");
                System.out.println(" ");
                try {
                    Thread.sleep(500);
                } catch (Exception e) {

                }
            }
        });
        Thread t2 = new Thread(()-> {
                for (int i = 0; i < 8; i++) {
                    System.out.println("Hello Mentor...");
                    System.out.println(" ");
                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {

                    }
                }
            });

        t1.start();

        try {
            Thread.sleep(50);
        } catch (Exception e) {

        }

        t2.start();
    }
}