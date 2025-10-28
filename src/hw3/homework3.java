
package hw3;

import java.util.Scanner;  

public class homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        
        System.out.println("輸入三個數字： ");

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
//    ****************************************************
        
        System.out.println("開始猜數字吧");
        int x = sc.nextInt();
        int y =(int) (Math.random()*10);
        while(x != y)
        {
        	System.out.println("猜錯了");
        	int z = sc.nextInt();
        	x=z;
        }
        System.out.printf("答對了 答案就是"+y);
//      ****************************************************
        int i=0;
        System.out.print("");
        System.out.print("請輸入討厭的數字");
        int j = sc.nextInt();
        x= j%10;
		System.out.println("");
		System.out.print("可以選擇的數字有");
		for(int k=1;k<=49;k++)
		{
			if(k % 10 != x && k / 10 != x)
			{
				System.out.print(" "+ k);
				i++;				
			}	
			
		}
		System.out.println("");
		System.out.println("總共有"+i+"個");
//      ****************************************************
		 		
    }   
    }