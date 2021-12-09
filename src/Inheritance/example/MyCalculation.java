package Inheritance.example;

public class MyCalculation extends Calculate{
    public void phepNhan(int a, int b) {
        c = a * b;
        System.out.println("Tích 2 số = " + c);
    }

    public void phepLuyThua(int a, int b) {
        c = (int) Math.pow(a, b);
        System.out.println(a + "^" + b + " = " + c);
    }

    public static void main(String[] args) {
        int a = 20, b = 4;
        MyCalculation myCalculation = new MyCalculation();
        myCalculation.phepCong(a, b);
        myCalculation.phepTru(a, b);
        myCalculation.phepNhan(a, b);
        myCalculation.phepLuyThua(a, b);
    }
}
