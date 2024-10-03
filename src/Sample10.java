import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.nio.Buffer;

public class Sample10 {
    public static void main(String[] args) throws IOException {
        System.out.println("Please input a integer");

        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br1.readLine();

        int num1 = Integer.parseInt(str1);

        System.out.println("Your input is: " + num1);

        System.out.println("Please input a String");

        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

        String str2 = br2.readLine();

        System.out.println("Your input is: " + str2);


    }
}
