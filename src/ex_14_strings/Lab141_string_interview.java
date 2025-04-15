package ex_14_strings;

public class Lab141_string_interview {
    public static void main(String[] args) {
        String s1="deepa"; //SCP
        String s2="deepa";//SCP

        String s4= new String("deepa");//OA
        String s5= new String("deepa");//OA
        String s6= new String("Deepa");//OA

        //== is comaprison in string , which checks the location refernce

        System.out.println(s1==s4);
        //both stores in different location
        //that is , SCP and OA
        //SO OUTPUT IS FALSE
        System.out.println(s2==s4);
        System.out.println(s5==s4);
        System.out.println(s6==s4);
        System.out.println(s1==s2);
        System.out.println("content checking ");
        //if you want to check the contents are same or not ?
        //then use equals
        System.out.println(s1.equals(s2));
        System.out.println(s4.equals(s2));
        System.out.println(s5.equals(s1));
        System.out.println(s1.equals(s6)); //thsi alone false, bcoz deepa is different from Deepa
        System.out.println("ignoring the case ");
        //if you want to ifnore the case ,
        //then use equalsIgnoreCase
        System.out.println(s1.equalsIgnoreCase(s6));

    }
}
