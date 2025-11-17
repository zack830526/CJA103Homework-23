package hw9;



public class hw91 implements Runnable {
    private String name;
    private int bowl = 1;

    public hw91(String name) {
        this.name = name;
    }

    public void run() {
        while (bowl <= 10) {
            System.out.println(name + " 吃第 " + bowl + " 碗飯");
            bowl++;

            try {
                Thread.sleep((int)(Math.random() * 2501) + 500);
            } catch (Exception e) {}
        }
        System.out.println(name + " 吃完了！");
    }
    public static void main(String[] args) {
        Thread t1 = new Thread(new hw91("饅頭人"));
        Thread t2 = new Thread(new hw91("詹姆士"));

        System.out.println("比賽開始！");
        t1.start();
        t2.start();
    }
}
