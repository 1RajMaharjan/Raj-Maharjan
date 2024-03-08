import java.util.Scanner; 
class add{
  public static void main(String[] args) {
    int a,b,sum;
    Scanner Scanner=new Scanner(System.in);
    System.out.println("Enter first number:");
    a=Scanner.nextInt();
    System.out.println("Enter second number:");
    b=Scanner.nextInt();
    sum=a+b;
    System.out.println("The sum of a and b is: "+sum);
  }
}
