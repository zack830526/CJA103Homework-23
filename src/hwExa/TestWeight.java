package hwExa;

public class TestWeight {
    public static void main(String[] args) {
        Weighable[] items = {
            new Dog("Lucky", 15.0),
            new Plane("Boeing747", 80000.0),
            new Powder("Flour", 1.5)
        };

        for (Weighable w : items) {
            w.printWeightTool();
            System.out.println();
        }
    }
}
