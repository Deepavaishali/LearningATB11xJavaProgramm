package ex_14_strings;

public class Lab142_string_functions {
    public static void main(String[] args) {
        String s1="deepa";
        String s2="deepa";
        String s3=new String("deepa");

        System.out.println(s1==s2);
        System.out.println(s2==s3);
        System.out.println(s1.equals(s3));
    }
}
