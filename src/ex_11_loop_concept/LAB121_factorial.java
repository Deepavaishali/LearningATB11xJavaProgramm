package ex_11_loop_concept;

import java.util.Scanner;

public class LAB121_factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number\n you want to check factorial value");
        int number = scanner.nextInt();

        int factorial = 1;

        if (number <= 0) {
            System.out.println(factorial);
        } else {
            for (int i = 1; i <= number; i++)
            {
            factorial = factorial * i;

        }
    }System.out.println("factorail number of  " + number + "is" +factorial);

}
}
