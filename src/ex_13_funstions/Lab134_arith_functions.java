package ex_13_funstions;

import java.util.Scanner;

public class Lab134_arith_functions {
    //create a function of  add, sub, mul, div
    //with parameter a and b from the user

    //logic building
    //get input a and b - integer
    //output = integer
    //step -2 ->
    // which function need to use?
    // 4 th type - declare functions
    //find and fix and edge cases
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number1");
        //fixing the edge cases - that is what if user gives string value instead of interger
        int a = 0;
        if(scanner.hasNextInt()){
            a=scanner.nextInt();
        }else{
            System.out.println("give integr value only");
            System.exit(0);//if you are not giving this line, it will execute other  below lines
        }


        System.out.println("Enter the number2");
        int b = 0;
        if(scanner.hasNextInt()){
            b=scanner.nextInt();
        }else{
            System.out.println("give integr value only");
            System.exit(0);
        }


        int addition_result = sum(a,b);
        System.out.println(addition_result);

        int sub_result = sub(a,b);
        System.out.println(sub_result);

        int mul_result = mul(a,b);
        System.out.println(mul_result);

        int div_result = div(a,b);//anything divide by zero is not possible , throws error
        System.out.println(div_result);

        int mod_result = mod(a,b);
        System.out.println(mod_result);
    }

    static int sum(int a, int b){
        return a+b;
    }

    static int sub(int a, int b){
        return a-b;
    }

    static int mul(int a, int b){
        return a*b;
    }

    static int div(int a, int b){
        if(b==0){
            System.out.println("divided by zero is not allowed");
            System.exit(0);

        }

        return a/b;
    }

    static int mod(int a, int b){
        return a%b;
    }

}
