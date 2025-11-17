package hw8;

import java.math.BigInteger;
import java.util.*;

public class homewrk8 {

	public void Train() {
		Object[] arr2 = {
			    number(0),
			    "type",
			    "start",
			    "dest",
			    Double.valueOf(0.0)
			};
	}
	private String word;  // 宣告屬性

	public String getWord() {
	    return word;
	}

	public void setWord(String word) {
	    this.word = word;
	}
	
	
	
    private Object number(int i) {
		// TODO Auto-generated method stub
		return null;
	}

    public homewrk8() {
    	 	
    }
    
    


	public static void main(String[] args) {

        // 原始陣列
        Object[] arr = {
            Integer.valueOf(100),
            Double.valueOf(3.14),
            Long.valueOf(21L),
            Short.valueOf((short)100),
            Double.valueOf(5.1),
            "Kitty",
            Integer.valueOf(100),
            new Object(),
            "Snoopy",
            new BigInteger("1000")
        };

        System.out.println("原始陣列：");
        for (Object o : arr) {
            System.out.println(o + " (" + o.getClass().getSimpleName() + ")");
        }

        // 先計算有多少 Number 元素
        int count = 0;
        for (Object o : arr) {
            if (o instanceof Number) {
                count++;
            }
        }

        // 建立新的陣列只放 Number
        Object[] numbersOnly = new Object[count];
        int index = 0;
        for (Object o : arr) {
            if (o instanceof Number) {
                numbersOnly[index++] = o;
            }
        }

        System.out.println("\n移除非 Number 後的陣列：");
        for (Object o : numbersOnly) {
            System.out.println(o + " (" + o.getClass().getSimpleName() + ")");
        }
// 作業1
        Set<Train> trains = new TreeSet<>(Comparator.comparingInt(Train::getNumber).reversed());

        // 建立 7 個 Train 物件
        trains.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
        trains.add(new Train(1254, "區間", "屏東", "基隆", 700));
        trains.add(new Train(118, "自強", "高雄", "台北", 500));
        trains.add(new Train(1288, "區間", "新竹", "基隆", 400));
        trains.add(new Train(122, "自強", "台中", "花蓮", 600));
        trains.add(new Train(1222, "區間", "樹林", "七堵", 300));
        trains.add(new Train(1254, "區間", "屏東", "基隆", 700)); // 重複班次

        System.out.println("=== 不重複且依班次編號由大到小排列 ===");
        for (Train t : trains) {
            System.out.println(t);
        }
    }
}
// 作業2        
        
        
 
