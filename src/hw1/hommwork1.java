package hw1;

public class hommwork1 {
	public static void main(String[] args){
		int i=6;
		int j=12;
		int egg=200;
		int t=256559;
		int d,h,m,s=0;
		double money=1500000;
		
		
		System.out.println("6 + 12 = " + (i + j));
		System.out.println("6 * 12 = " + (i * j));
		
		System.out.println(egg/j+"打 " +egg%j+"顆 ");
		
		d=(t/3600)/24;
		h = (t % 86400) / 3600;
		m=(t%3600)/60;
		s=t%60;
		System.out.println(d +"天 " +h+"小時 "+m+"分 " +s+"秒 ");
		
		for(i=1;i<=10;i++)
		{
			money = money + (money * 0.02);		
		}
		System.out.println("本金加利息共有" + money + "元");
		
		double pi=3.1415;
		System.out.println("圓面積"+pi*5*5);
		System.out.println("圓周長"+pi*5*2);
		
		
		
		System.out.println(5+5);
//		純數字相加
		System.out.println(5+'5');
//		數字加文字編碼?
		System.out.println(5+"5");
//		數字加上文字5
	}	
}
