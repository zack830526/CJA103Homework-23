package hw7;

import java.io.*;
import java.util.*;


public class Sample7 {

    public static void copyFile(String a, String b) {
        File src = new File(a);
        File dest = new File(b);

        try (
            FileInputStream fis = new FileInputStream(src);
            FileOutputStream fos = new FileOutputStream(dest);
        ) {
            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.out.println("檔案複製失敗：" + e.getMessage());
        }
    }


    
    public static void main(String[] args) throws IOException {
       
        File f = new File("C:\\cja103_workspace\\CJA103Homework-23\\src\\hw7\\Sample.txt");
        BufferedReader br = new BufferedReader(new FileReader(f));
        int lines = 0;
        int chars = 0;
        String line;
        while ((line = br.readLine()) != null) {
            lines++;
            chars += line.length(); 
        }
        br.close();

        System.out.println("Sample.txt檔案共有"+ f.length()+"個位元組,"+ chars+"個字元,"+lines+"列資料");
//題目1   	
    	Set<Integer> set = new HashSet<>();
        Random rand = new Random();

        while (set.size() != 10) {
            int r = rand.nextInt(1000) + 1;
            set.add(r);
        }

        Iterator<Integer> it = set.iterator();
        FileWriter fw = new FileWriter("Data.txt", true);

        while (it.hasNext()) {
            int num = it.next();
            System.out.print(" " + num);
            fw.write(num + " ");
        }
        fw.close();
//題目2
        copyFile(
            "C:\\cja103_workspace\\CJA103Homework-23\\src\\hw7\\Sample.txt",
            "C:\\cja103_workspace\\CJA103Homework-23\\src\\hw7\\Data.txt"
        );
//題目3       
        try {
            File dir = new File("C:\\data");
            if (!dir.exists()) {
                dir.mkdirs();
            }
            Cat a = new Cat("a");
            Dog b = new Dog("b");
            FileOutputStream fos = new FileOutputStream("C:\\data\\Object.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(a);
            oos.writeObject(b);
            oos.close();
            fos.close();
       } catch (IOException e) {
            e.printStackTrace();
        }
//題目4         
        File file = new File("C:\\data\\Object.ser");

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            while (true) {  
                try {
                    Object obj = ois.readObject();
                    if (obj instanceof Animal) {
                        ((Animal) obj).speak();  
                    }
                } catch (EOFException e) {

                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}