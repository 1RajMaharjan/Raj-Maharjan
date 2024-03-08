import java.util.*;
public class prime_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Enter a number:");
        number = scanner.nextInt();
        int a = 0;
        for(int i = 2;i<=number-1;i++){
            if(number %i ==0){
                a=1;
                break;
            }
        }
        if(number==1){
            System.out.println("1 is neither prime nor composite");

        }
        else if(a==0){
            System.out.println("The given number is prime");
        }
        else{
            System.out.println("The given number is composite");
        }
    }
}
