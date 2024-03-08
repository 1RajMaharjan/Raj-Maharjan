import java.util.Scanner;
public class  even_or_odd{
    public static void main(String[]args){
        Scanner read=new Scanner(System.in);
        System.out.print("Enter a number");
        int n=read.nextInt();
        if(n%2==0)
            System.out.println(n +"is a even number");
        else
            System.out.println(n +"is a odd");


    }
}
