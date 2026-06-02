import java.util.Scanner;
class assignment{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("enter number:");
int a = sc.nextInt();
a+=5;
System.out.println("Add:"+a);
a-=5;
System.out.println("Sub:"+a);
a*=5;
System.out.println("Multiply:"+a);
a/=5;
System.out.println("Division:"+a);
a%=5;
System.out.println("modulus:"+a);
}
}