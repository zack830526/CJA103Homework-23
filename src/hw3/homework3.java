package hw3;

import java.util.Scanner;  

public class homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        
        System.out.println("輸入三個數字：");

        int a = sc.nextInt();  
        int b = sc.nextInt();  
        int c = sc.nextInt(); 

        if(a+b>c && a+c>b && b+c>a)
        {
        	if(a == b && b == c)
        	{  
        		System.out.println("是正三角形 ");
        	}
        	else if (a == b || b == c || c == a)
        	{
        		System.out.println("等腰三角形 ");
        	}
        	else
        	
        		System.out.println("其他三角形 ");
        	
        }
        else
        	System.out.println("不是三角形 ");
    
    }
}