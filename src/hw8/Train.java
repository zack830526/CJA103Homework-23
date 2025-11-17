package hw8;
import java.util.*;

class Train {
    private int number;     // 班次
    private String type;    // 車種
    private String start;   // 出發地
    private String dest;    // 目的地
    private double price;   // 票價

    public Train(int number, String type, String start, String dest, double price) {
        this.number = number;
        this.type = type;
        this.start = start;
        this.dest = dest;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // 讓 Set 知道怎麼判斷「重複的 Train」
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Train)) return false;
        Train train = (Train) o;
        // 以班次號 number 當作判斷重複依據
        return number == train.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return String.format("Train{number=%d, type='%s', start='%s', dest='%s', price=%.1f}",
                number, type, start, dest, price);
    }
}

