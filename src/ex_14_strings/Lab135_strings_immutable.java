package ex_14_strings;

public class Lab135_strings_immutable {
    public static void main(String[] args) {
        String s="deepa";//to create a string , that is using assignment operator
        //above string stored in SCP
        s.toUpperCase();//its just converting to uppercase but not stored in any other value
        System.out.println(s);//asking to rpint s only , so output is deepa
        //if you assign  uppercase to any other name , then it will print in capital letters


        s=s.toUpperCase();
        System.out.println(s);


    }
}
