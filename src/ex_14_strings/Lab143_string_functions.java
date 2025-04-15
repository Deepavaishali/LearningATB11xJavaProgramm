package ex_14_strings;

import java.sql.SQLOutput;

public class Lab143_string_functions {
    public static void main(String[] args) {
        String s1="deepa";
        String s3="Deepa";
        String s2=new String("vaishali");

        //length
        System.out.println(s1.length());
        //charAt
        System.out.println(s1.charAt(3));
        //lowercase
        System.out.println(s1.toLowerCase());
        //uppercase
        System.out.println(s1.toUpperCase());
        //equals
        System.out.println(s1.equals(s2));
        //contains
        System.out.println(s1.contains("ep"));
        System.out.println(s2.contains("gh"));
        //equalsignorecase
        System.out.println(s1.equalsIgnoreCase(s3));

        System.out.println("index of printing");
        //indexOf
        String s4="madam";
        System.out.println(s1.indexOf("ep"));
        System.out.println(s1.indexOf('a'));
        System.out.println(s4.indexOf('m'));//takes first occurence of substring
        //lastIndexOf
        String s111="madammadamssss";
        System.out.println(s111.indexOf("m"));
        System.out.println(s111.indexOf("g"));//letter g is not present, so output is -1
        System.out.println(s111.lastIndexOf("m"));

        //replace(,)
        System.out.println(s1.replace("deepa","vaishu"));
        System.out.println(s1.replace("de","pe"));
        System.out.println(s1.replace("d","p"));
        System.out.println(s1.replace('d','p'));
        System.out.println(s1.replace("deepa","deep"));

        //split function
        String s5="deepa@gmail.com@live.com";
        String[] split = s5.split("@");
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);

        //substring
        System.out.println(s1.substring(1,4));
        //startswith - results in true or false
        System.out.println(s1.startsWith("D"));
        //endswith - results in true or false
        System.out.println(s1.endsWith("a"));

        //trim
        String s6="    deepa    ";
        System.out.println(s6.trim());//trim doesnt have any arguments
        // simply removes front and back spaces

        //substring another example
        String s7="niagara. roar .com !";
        String s8=s7.substring(11,15);
        System.out.println(s8);//output "ar ."

        //incase of string , concat also done by + operator
        String s11="deepa";
        String s22="jay";
        String s33="rudh";
        String s55= s11+s22+s33;
        System.out.println(s55);
    }
}
