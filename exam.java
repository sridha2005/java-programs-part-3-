import java.util.Scanner;
class exam{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter mark:");
int mark = sc.nextInt();
if(mark>=40){
System.out.println("pass");
}else{
System.out.println("fail");
}
}
}
