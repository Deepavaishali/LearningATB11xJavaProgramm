package ex_13_funstions;

public class Lab129_methods_functions {
    public static void main(String[] args) {
        //step - 2-> calling the function
        //what is the function name ?
        //function_name
        function_name();
        function_name();
        function_name(); //it will print for  how many times you have called the function
        //i have called 3 times, so printing 3 times
        function_name2();
        //this function_name2 has printing statemnts 3 times, so printing 3 times



    }
    //step :1 -> declaration of function
    static void function_name(){
        System.out.println("i am creating my first program in functions");
    }
    static void function_name2(){
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
    }
}
