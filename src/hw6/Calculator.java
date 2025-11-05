package hw6;

public class Calculator {

  
    public double powerXY(int x, int y) throws CalException {
        if (x == 0 && y == 0) {
            throw new CalException("0 的 0 次方沒有意義");
        }
        if (y < 0 ) {
            throw new CalException("y為負值,而導致x的y次方結果不為整數");
        }

        double sum = 1.0;
        if (y > 0) {
            for (int i = 0; i < y; i++) {
            	sum =sum* x;
            }
        } 
        
        return sum;
    }
}
