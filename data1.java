class data1 {
    private String name;
    private int rollno;
    public void setName(String name) {
        this.name = name;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public String getName() {
        return name;
    }
    public int getRollno() {
        return rollno;
    }
    public static void main(String[] args) {
        data1 d = new data1();
        d.setName("sridha");
        System.out.println(d.getName());
        d.setRollno(44);
        System.out.println(d.getRollno());
    }
}