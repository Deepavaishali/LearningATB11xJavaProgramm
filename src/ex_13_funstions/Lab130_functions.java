package ex_13_funstions;

public class Lab130_functions {
    public static void main(String[] args) {
           f1();
        System.out.println(return_int_type()); //this way also you can print the interger value
        //else assigning the value and then printing it
        int result = return_int_type();
        System.out.println(result);

        boolean result2 = return_boolean_type();
        System.out.println(result2);

        float result3 = return_float_type();
        System.out.println(result3);

        long result4 = return_long_type();
        System.out.println(result4);


        String result5 = return_String_type();
        System.out.println(result5);

        byte result6 = return_byte_type();
        System.out.println(result6);




    }
    //non returning function
    static void f1(){
        System.out.println("void means - not returing any value");
    }
    // returning function
    static int return_int_type() {
        //if you want to return interger value , then use int
        return 10;

        //what interger value you want to return
    }
        //this applies for all data types like boolean , string, char etc
     static boolean return_boolean_type() {
            return true;
        }
        static float return_float_type() {
        return 3.13f;
         }
    static long return_long_type() {
        return 313l;

    }
    static String return_String_type() {
        return "deepa";
    }
    static byte return_byte_type() {
        return 127;
    }
    }


