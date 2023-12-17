import java.util.Scanner;
public class Aufgaben_1 {
    public static void main (String[]args){
        int n=0;
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();

        sterne(n);
    }
    public static void sterne(int n){
        if (n>0){
            System.out.print("*");
            sterne(n-1);
        } else{
            System.out.println();
        }
    }
}
