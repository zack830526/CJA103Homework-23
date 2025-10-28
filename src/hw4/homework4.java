package hw4;
import java.util.Scanner;  

public class homework4 {
	public static void main(String[] args){
		   int  x[] ={29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		   int  avg=0;
		   int  count=0;
		   Scanner sc = new Scanner(System.in);
		   for(int i=0;i < x.length;i++ )
			{
					avg=avg+x[i];
					count++;
				}
		   int y=avg/count;
		   System.out.println("所有元素的平均值 = " + y);
  			System.out.println("");
  			System.out.println("平均值大於平均值的元素");
		   for(int i=0;i < x.length;i++ )
			{
			   
			   		if(x[i]>=y)
			   		{
			   			System.out.println(x[i]);			   						   			
			   		}

				}
//==========================================================
					String s = "Hello World";
			        byte[] a = s.getBytes(); 
			        String d = "";

			        for (int i = a.length - 1; i >= 0; i--) {
			            d += (char) a[i]; 
			        }

			        System.out.println("執行結果即為 " + d);
//==========================================================
			        String[] b = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
			        int w = 0;

			        for (int j = 0; j < b.length; j++) {          
			            String word = b[j];                       
			            for (int k = 0; k < word.length(); k++) { 
			                char ch = word.charAt(k);
			                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			                    w++;
			                }
			            }
			        }

			        System.out.println("這陣列裡面共有 " + w + " 個母音");
 //==========================================================
			        int[] emp = {25,32,8,19,27};
			        int[] loan = {2500,800,500,1000,1200} ;
			        System.out.print("請小華輸入欲借的金額 ");
		  			
			        int bro = sc.nextInt();
			        System.out.println("有錢可借的員工編號:");
			        w=0;
			        
			        for (int j = 0; j < loan.length; j++) {          
			        		if(bro<=loan[j])
			        		{
			        			System.out.print(emp[j]+"  ");
			        			w++;
			        		}    
			            
			        }
			        System.out.println("共"+w+"人");
//==========================================================
			        System.out.println("輸入三個整數,分別代表西元yyyy年,mm月,dd日");
			        
			        int yy = sc.nextInt();
			        int mm = sc.nextInt();
			        int dd = sc.nextInt();
			        
			        
	}

}

