public class Worker extends CanBo{
    private int level;

    public Worker(String name, int age, String sex, String address, int level) {
        super(name, age, sex, address);
        this.level = level;
    }
    

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Worker add(String name, int age, String sex, String address, int level){
        Worker worker = new Worker(name,age,sex,address,level);
        return  worker;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "level=" + level +", name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", sex='" + super.getSex() + '\'' +
                ", address='" + super.getAddress() + '\'' +
                '}';
    }
}
