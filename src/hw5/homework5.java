package hw5;

import java.util.Random;
import java.util.Scanner;

public class homework5 {


    public static void starSquare(int width, int height) {
        for (int i = 0; i < height; i++) {      
            for (int j = 0; j < width; j++) {   
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void randAvg() {
        int[] x = new int[10];
        int sum = 0;
        
        for (int i = 0; i < x.length; i++) {
            x[i] = (int)(Math.random() * 101); 
            sum += x[i];
        }      

        System.out.print("本次亂數結果：");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }      

        double avg = sum / (double)x.length;
        System.out.println();
        System.out.printf("平均值：%.2f%n", avg);
    }

 
    public int maxElement(int[][] x) {
        int max = x[0][0];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                if (x[i][j] > max) {
                    max = x[i][j];
                }
            }
        }
        return max;
    }


    public double maxElement(double[][] x) {
        double max = x[0][0];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                if (x[i][j] > max) {
                    max = x[i][j];
                }
            }
        }
        return max;
    }

     public static String genAuthCode() {
            String z = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
            String code = "";
            Random rand = new Random();

            for (int i = 0; i < 8; i++) {
                int index = rand.nextInt(z.length());
                code = code + z.charAt(index); 
            }

            return code;
        }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("請輸入寬: ");
        int width = sc.nextInt();

        System.out.print("請輸入高: ");
        int height = sc.nextInt();

        System.out.println();
        starSquare(width, height);
        randAvg();


        homework5 w = new homework5();
        int[][] intArray = {
            {1, 6, 3},
            {9, 5, 2}
        };
        double[][] doubleArray = {
            {1.2, 3.5, 2.2},
            {7.4, 2.1, 8.2}
        };
        System.out.println(w.maxElement(intArray));
        System.out.println(w.maxElement(doubleArray));

        System.out.println("驗證碼：" + genAuthCode());
    }
}
