public class Engineer extends CanBo{
    private String major;

    public Engineer(String name, int age, String sex, String address, String major) {
        super(name, age, sex, address);
        this.major = major;
    }



    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Engineer add(String name, int age, String sex, String address, String major){
        Engineer engineer = new Engineer(name,age,sex,address,major);
        return  engineer;
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "major='" + major + '\'' +", name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", sex='" + super.getSex() + '\'' +
                ", address='" + super.getAddress() + '\'' +
                '}';
    }
}
