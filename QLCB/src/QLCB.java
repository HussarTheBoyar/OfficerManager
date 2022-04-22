import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class QLCB {
    private ArrayList<CanBo> officer;

    public QLCB(List<CanBo> officer) {
        this.officer = new ArrayList<>();
    }

    public void add(CanBo officer){
        this.officer.add(officer);
    }

    public void searchByName(String name){
        ArrayList<CanBo> result = new ArrayList<>();
        for (CanBo officer:this.officer
             ) {
            boolean check = officer.getName().contains(name);
            if (check){
                result.add(officer);
            }
        }

        for (CanBo officer:result
             ) {
            System.out.println(officer.toString());
        }

    }

    public void showOfficer(){
        for (CanBo officer:this.officer
             ) {
            System.out.println(officer.toString());
        }
    }

    public boolean checkCondition(int max, int min, int data){
        boolean result = data<=max && data>=min;
        return result;
    }
}
