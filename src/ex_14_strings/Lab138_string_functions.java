package ex_14_strings;

public class Lab138_string_functions {
    public static void main(String[] args) {
        char c= 'A';
        System.out.println(c);

        String s = "ABCD";
        System.out.println(s.length());
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.concat("E"));

        //String s2=s.length();
        //this s.length returns value in interger, and int assigning to string is not allowed,
        //so first convert and then store it
        int s2=s.length();
        System.out.println(s2);

        String s3=s.toLowerCase();
        System.out.println(s3);

        String s4=s.toUpperCase();
        System.out.println(s4);

    }


}
