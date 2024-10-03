public class Sample12 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        System.out.println("multiple caculations of num1 and num2");
        System.out.println("num1 + num2 = " + (num1 + num2));
        System.out.println("num1 - num2 = " + (num1 - num2));
        System.out.println("num1 * num2 = " + (num1 * num2));
        System.out.println("num1 / num2 = " + (num1 / num2));
        System.out.println("num1 % num2 = " + (num1 % num2));

        int a = 0, b = 0, c = 0;

        b = a++;
        c = ++a;

        System.out.println("Because it's increased after assigned, b = " + b);
        System.out.println("Because it's iecreased before assigned, c = " + c);
    }
}
