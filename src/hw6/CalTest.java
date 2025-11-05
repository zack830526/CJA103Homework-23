package hw6;

import java.util.Scanner;

public class CalTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        try {
            System.out.print("請輸入 x 的值: ");
            int x = sc.nextInt();

            System.out.print("請輸入 y 的值: ");
            int y = sc.nextInt();

            double result = calc.powerXY(x, y);
            System.out.println(x + " 的 " + y + " 次方等於 " + result);

        } catch (CalException e) {
            System.out.println("計算錯誤: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("輸入錯誤: 請輸入整數");
        } finally {
       
        }
    }
}
