package hw2;

public class homework2 {

	public static void main(String[] args){
		int a=0;
		int sum=0;
		int j=0;
		for(int b=1;b<=500;b++)
		{
			a=a+2;
			sum=sum+a;
		}
		System.out.println("1~1000偶數和是 "+sum);
		sum=1;
		for(int c=1;c<=10;c++)
		{
			sum=c*sum;
		}
		System.out.println("1~10連乘積是 "+ sum);
		a=1;
		sum=1;
		while(a<=10)
		{
			sum=a*sum;
			a++;
		}
		System.out.println("1~10連乘積是 "+ sum);
		
		sum=1;
		for(int c=1;c<=10;c++)
		{
			sum=c*c;
			
			System.out.print(" "+ sum);
		}
		a=0;
		sum=0;
		System.out.println("");
		System.out.print("可以選擇的數字有");
		for(int c=1;c<=49;c++)
		{
			if(c % 10 != 4 && c / 10 != 4)
			{
				System.out.print(" "+ c);
				a++;				
			}	
			
		}
		System.out.println("");
		System.out.println("總共有"+a+"個");
		
		a=10;
		sum=1;
		j=10;
		for(int b=10;b>=1;b--)
		{
			for(int c=1;c<=b;c++)
			{
			System.out.print(" "+c);						
			}			
		System.out.println("");
		}
		char g=65;
		for(int c=1;c<=6;c++)
		{
			for(int d=1;d<=c;d++)
			{
			
			System.out.print(" "+ g);
			}
			System.out.println("");
			g++;
		}
		
		
		
		
	}
}
