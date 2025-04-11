package ex_13_funstions;

public class Lab132_four_type_functions {
    public static void main(String[] args) {
        //without parameters, without return type
        f1();

        //without parameters, with return type
        int result = number();
        System.out.println(result);
        String result2= name();
        System.out.println(result2);

        //with parameters, without return type - 90% used
        sum_of_numbers(10, 20);

        details("Deepa", 28, 100);
        details("jay", 30, 200);
        details("Rudh", 2, 300);

        full_name("Deepa","vaishali");
        full_name("jaya","raj");

        //with parameters, with return type
       int total_addition_value=  addition(100, 200);
        System.out.println(total_addition_value);




    }
    //without parameters, without return type
    //without parameters, with return type
    //with parameters, without return type - 90% used
    //with parameters, with return type

    //without parameters, without return type
    static void f1(){
        System.out.println("hello");
    }

    //without parameters, with return type
    static int number(){
        return 10;
    }
    static String name(){
        return "deepa";
    }

    //with parameters, without return type - 90% used
    static void sum_of_numbers(int a , int b){
        System.out.println(a+b);
    }

    static void details(String name, int age, double salary){
        System.out.println("hi");
        System.out.println("your name is " +name+"\nyour age is " +age +"\n your salary is " +salary );
    }

    static void full_name(String firstname, String secondname){
        System.out.println("hi,\n my full name is " + firstname + secondname);
        //if you give like this, between names, there wont be any space
        System.out.println("hi,\n my full name is " + firstname + " " +secondname);
        //if you give like this, between names, there will be a space between names
    }
    //with parameters, with return type
    static int addition(int a, int b){
        System.out.println("do addition");
        return a+b;
    }
}
