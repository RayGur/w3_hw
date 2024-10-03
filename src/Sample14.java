public class Sample14 {
    public static void main(String[] args) {
        int d = 2;
        double  pi = 3.14;

        System.out.println("The diameter of the circle is " + d + "cm");
        System.out.println("The circumference of the circle is " + (pi * d) + "cm");

        int num1 = 5;
        int num2 = 4;

        double div1 = num1 / num2;
        double div2 = (double)num1 / (double)num2;

        System.out.println("5/4 = " + div1);
        System.out.println("5/4 = " + div2);
    }
}
