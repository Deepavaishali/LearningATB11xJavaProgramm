package ex_13_funstions;

public class Lab131_user_defined_function {
    public static void main(String[] args) {
        int result = sum_of_a_and_b(10,20);
        int result2 = sum_of_a_and_b(100,200);
        int result3= sum_of_a_and_b(1,2);

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
    }
    //with return type , with parameter type
    static int sum_of_a_and_b(int a, int b){
        return a+b;
    }
}
