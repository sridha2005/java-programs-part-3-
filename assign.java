import java.util.Scanner;
class assign{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("a:");
int a = sc.nextInt();
System.out.println("b:");
int b = sc.nextInt();
a+=b;
System.out.println("Add:"+a);
a-=b;
System.out.println("Sub:"+a);
a*=b;
System.out.println("Multiply:"+a);
a/=b;
System.out.println("Division:"+a);
a%=b;
System.out.println("modulus:"+a);
}
}