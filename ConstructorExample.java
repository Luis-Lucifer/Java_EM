class Company{
    private int empId;
    private String empName;

    public Company() {
        System.out.println("This is default constructor...");
    }

    public Company(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
        System.out.println("This is Parameterized Constructor...");
    }

    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
}

public class ConstructorExample {
    public static void main(String[] args) {
        Company obj1 = new Company();
        Company obj2 = new Company(101, "Nilanjan");

        System.out.println(obj2.getEmpId()+" --> "+obj2.getEmpName());
    }
}
