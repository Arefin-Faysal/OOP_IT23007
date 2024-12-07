//  code to find factorians inside a range
import java.util.*;

public class Factorial {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a range : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        for (int j = num1; j <= num2; j++) {
            int sum = 1, sum1 = 0, rem;
            int m = j;

            while (m > 0) {
                rem = m % 10;
                for (int i = 1; i <= rem; i++)
                    sum = sum * i;
                sum1 = sum1 + sum;
                m = m / 10;
                sum = 1;
            }

            if (sum1 == j)
                System.out.println(sum1);

        }

        input.close();

    }

}
