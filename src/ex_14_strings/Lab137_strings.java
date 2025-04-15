package ex_14_strings;

public class Lab137_strings {
    public static void main(String[] args) {
        String s1= "deepa";
        //s2=s1.concat("vaishali");
        // we cant store in s2, bcox, value must be declared with a data type
        //System.out.println(s2);

        String s2=s1.concat("vaishali");//now s2 is decalred and initialised
        System.out.println(s2);

        String s3=s1.concat(" vaishali");//now space is given
        System.out.println(s3);
    }
}
