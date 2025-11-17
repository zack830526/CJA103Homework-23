package hw9;

class Depot {
    private int stock = 2000; // 初始餘額 2000

    // 媽媽匯款
    synchronized public void produce(int qty) {
        while (stock > 3000) {  
            System.out.println("餘額達 3000 以上，媽媽停止匯款");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        stock += qty; 
        System.out.println("媽媽匯了 " + qty + " 元，現在餘額：" + stock);

        notifyAll();
    }

    // 熊大提款
    synchronized public void consume(int qty) {
        while (stock < qty) {  
            System.out.println("餘額不足（" + stock + "），熊大暫停提款，請求匯款");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        stock -= qty;
        System.out.println("熊大提款 " + qty + " 元，現在餘額：" + stock);

        if (stock < 2000) {
            System.out.println("餘額低於 2000，請媽媽匯款！");
        }

        notifyAll();
    }
}

class Producer extends Thread {
    Depot depot;

    public Producer(Depot depot) {
        this.depot = depot;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            depot.produce(2000);  // 每次匯款 2000
        }
    }
}

class Consumer extends Thread {
    Depot depot;

    public Consumer(Depot depot) {
        this.depot = depot;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            depot.consume(1000); // 每次提領 1000
        }
    }
}

public class hw92 {
    public static void main(String[] args) {
        Depot depot = new Depot();
        Producer mom = new Producer(depot);
        Consumer bear = new Consumer(depot);

        mom.start();
        bear.start();
    }
}
