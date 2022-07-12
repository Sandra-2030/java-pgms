import java.util.Scanner;

class Main{
    public static void main(String[] args){
        String s1, s2;
        Scanner in = new Scanner(System.in);
        System.out.println("enter first string :");
        s1 = in.next();
        System.out.println("enter second string :");
        s2 = in.next();
        
        System.out.println("length of second string :" +s2.length());
        System.out.println("replace char 'e' with char 'b' :"+s1.replace('e','b'));
        System.out.println("Concatenated string is : " +s1.concat(s2));
    }
}