class emp{
private int salary;
public void setSalary(int salary){
this.salary = salary;
}
public int getSalary(){
return salary;
}
public static void main(String[] args){
emp e = new emp();
e.setSalary(50000);
System.out.println(e.getSalary());
}
}