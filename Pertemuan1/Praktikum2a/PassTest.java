class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void print() {
        System.out.println("Date: " + day + "/" + month + "/" + year);
    }
}

public class PassTest {
    public static void changeInt(int value) {
        value = 55;
    }
    
    public static void changeObjectRef(MyDate ref) {
        ref.setDate(1, 1, 2000);
    }
    
    public static void changeObjectAttr(MyDate ref) {
        ref.setDay(4);
    }
    
    public static void main(String args[]) {
        MyDate date;
        int val;
        
        val = 11;
        changeInt(val);
        System.out.println("Int value is: " + val);
        
        date = new MyDate(22, 7, 1964);
        changeObjectRef(date);
        date.print();
        
        changeObjectAttr(date);
        date.print();
    }
}
