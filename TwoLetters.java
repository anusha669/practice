import java.util.Scanner;
public class TwoLetters{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        s1 = s1.concat(s2);
        System.out.println(s1);
        int i=2;
        while(s1[i]!='\0')
        {
            System.out.println(s1[i--]+""+s1[i]);
            i += 3;
        }
    }
}