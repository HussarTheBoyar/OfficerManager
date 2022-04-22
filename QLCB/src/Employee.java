public class Employee extends CanBo{
    private String work;

    public Employee(String name, int age, String sex, String address, String work) {
        super(name, age, sex, address);
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public Employee add(String name, int age, String sex, String address, String work){
        Employee employee = new Employee(name,age,sex,address,work);
        return  employee;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "work='" + work + '\'' +", name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", sex='" + super.getSex() + '\'' +
                ", address='" + super.getAddress() + '\'' +
                '}';
    }
}
