import java.util.Arrays;
public class attendancetracker
{
public static void main(String[] args)
{
int [] attendance = {1,1,1,0,0};
int present = 0;
int absent = 0;
for(int a:attendance){
if(a==1){
present++;
}
else{
absent++;
}
}
double percentage = (present * 100.0) / attendance.length;
System.out.println("Present:" + present);
System.out.println("Absent:" + absent);
System.out.println("Total percentage:"+ percentage);
}
}