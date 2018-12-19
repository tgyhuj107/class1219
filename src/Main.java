import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scn =new Scanner(System.in);
	    //01
//        int n=scn.nextInt(),m=scn.nextInt();
//        System.out.println(c(n)/(c(m)*c(n-m)));
        //02
//        k();
        //
        int n=scn.nextInt();
        System.out.println(count(n));
    }
    public static int c(int n) {
        int sum=1;
        for (int i=1;i<=n;i++){
            sum*=i;
        }
        return sum;
    }
    public static void k(){
        System.out.println("=============");
        System.out.println("kurosaki");
        System.out.println("107021045");
        System.out.println("=============");
    }
    public static int count(int n){
        int t=0;
       while (n!=0){
           n/=10;
           t++;
       }
       return t;
    }
}
