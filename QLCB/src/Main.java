import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ArrayList<CanBo> officer = null;
        QLCB officerManager = new QLCB(officer);
        Scanner input = new Scanner(System.in);
        int key;
        String officerKey;

        Hashtable majorTable = new Hashtable<>();
        Hashtable workTable  = new Hashtable<>();
        Hashtable sexTable  = new Hashtable<>();

        //Adding major
        majorTable.put(1,"ET");
        majorTable.put(2,"IT");
        majorTable.put(3,"ME");

        //Adding work
        workTable.put(1,"HR");
        workTable.put(2,"accountant");

        //Adding sex
        sexTable.put(1,"Male");
        sexTable.put(2,"Female");

        Integer age = 0;
        Integer sex = 0;
        String address;
        Integer level;
        Integer major;
        Integer work;
        boolean check = true;

        while (check){
            System.out.println("Nhập vào hoạt động bạn muốn thực hiện");
            System.out.println("1.Nhập thêm cán bộ");
            System.out.println("2.Tìm kiếm cán bộ theo tên");
            System.out.println("3.Hiển thị danh sách cán bộ");
            System.out.println("4.Thoát");

            key = input.nextInt();

            switch (key) {
                case 1:
                    System.out.println("Nhập tên cán bộ");
                    input.skip("\\R?");
                    String name = input.nextLine();
                    //System.out.println(name);

                    age = 0;
                    while (!officerManager.checkCondition(70,18,age)){
                        System.out.println("Nhập tuổi cán bộ (Chú ý tuổi phải từ 18-70)");
                        //age = input.nextInt();
                        try {
                            age = input.nextInt();
                        } catch (InputMismatchException ex){
                            System.out.println("Dữ liệu nhập vào là số từ 18-70");
                            input.next();
                        }
                    }

                    sex = 0;
                    while (!officerManager.checkCondition(2,1,sex)){
                        System.out.println("Chọn giới tính (1: nam, 2:nữ)");
                        //sex = input.nextInt();
                        try {
                            sex = input.nextInt();
                        } catch (InputMismatchException ex){
                            System.out.println("Dữ liệu nhập vào chỉ là 1-2");
                            input.next();
                        }
                    }

                    System.out.println("Nhập địa chỉ");
                    input.skip("\\R?");
                    address = input.nextLine();


                    System.out.println("Chọn kiểu nhân viên muốn nhập:");
                    System.out.println("a: Kỹ sư");
                    System.out.println("b: Công nhân");
                    System.out.println("c: Nhân viên");

                    input.skip("\\R?");
                    officerKey = input.nextLine();

                    switch (officerKey){
                        case "a":
                            System.out.println("Chuyên ngành đào tạo: (1-ET, 2-IT, 3-ME)");
                            major = input.nextInt();
                            System.out.println(majorTable.get(major));;
                            CanBo engineer = new Engineer(name,age,sexTable.get(sex).toString(),address,majorTable.get(major).toString());
                            officerManager.add(engineer);
                            System.out.println(engineer.toString());
                            break;
                        case "b":
                            System.out.println("Bậc công nhân");
                            level = input.nextInt();
                            CanBo worker = new Worker(name,age,sexTable.get(sex).toString(),address,level);
                            System.out.println(worker.toString());
                            break;
                        case "c":
                            System.out.println("Công việc:");
                            work = input.nextInt();
                            System.out.println(workTable.get(work));;
                            CanBo employee = new Employee(name,age,sexTable.get(sex).toString(),address,workTable.get(work).toString());
                            officerManager.add(employee);
                            System.out.println(employee);
                            break;
                    }

                    break;


                case 2:
                    System.out.println("Nhập tên cán bộ cần tìm");
                    input.skip("\\R?");
                    String searchName = input.nextLine();
                    officerManager.searchByName(searchName);
                    break;

                case 3:
                    officerManager.showOfficer();
                    break;

                case 4:
                    check = false;
                    break;

            }

        }

    }
}
