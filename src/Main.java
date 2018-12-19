import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scn =new Scanner(System.in);
	    //
//        int n=scn.nextInt(),m=scn.nextInt();
//        System.out.println(c(n)/(c(m)*c(n-m)));
        //
//        k();
        //
//        int n=scn.nextInt();
//        System.out.println(count(n));
        //
//        int n=scn.nextInt();
//        String str =scn.next();
//        tr(n,str);
        //01
//        String str=scn.next();
//        for (int i=str.length()-1;i>=0;i--){
//            System.out.print(str.charAt(i));
//        }
        //02
        int n=scn.nextInt();
        Random randnum =new Random();
        randnum.setSeed(n);
        int[] data=new int[6];
        int j=0;
        boolean flag=true;
        while (j<6){
            flag=true;
            data[j]=randnum.nextInt(42)+1;
            for (int k=0;k<j;k++){
                if (data[k]==data[j]){
                    flag=false;
                }
            }
            if (flag==true){
                j++;
            }
        }
        for (int i=0;i<6;i++){
            System.out.print(data[i]+"\t");
        }
        System.out.println();

        //03
//        int[][] data=new int[5][7];
//        for (int i=0;i<5;i++){
//            for (int j=0;j<7;j++){
//                data[i][j]=scn.nextInt();
//            }
//        }
//        for (int i=0;i<7;i++){
//            for (int j=0;j<5;j++){
//                System.out.print(data[j][i]+"\t");
//            }
//            System.out.println();
//        }

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
    public static void tr(int n,String str){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(str);
            }
            System.out.println();
        }

    }
}
