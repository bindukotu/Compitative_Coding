package Seminar;

import java.util.ArrayList;
import java.util.List;

public class HeteroList {
  private   String studentName;

    public String getStudentName() {
        return studentName;
    }

    public int getPassedYear() {
        return passedYear;
    }

    public String getLocation() {
        return location;
    }

    private int passedYear;
    private String location;


    public HeteroList(String studentName, int passedYear, String location) {
        this.studentName = studentName;
        this.passedYear = passedYear;
        this.location = location;
    }


    public static void main(String[] args) {
        List<HeteroList> hl = new ArrayList<HeteroList>();
        hl.add(new HeteroList("Naveen", 19, "USA"));
        hl.add(new HeteroList("Kumar", 20, "India"));
        System.out.println(hl.get(0).getStudentName()+" "+hl.get(0).getPassedYear()+" "+hl.get(0).getLocation());
        System.out.println(hl.get(1).getStudentName()+" "+hl.get(1).getPassedYear()+" "+hl.get(1).getLocation());
    }
}
