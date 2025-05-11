package Project_SchoolManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Teacher tchr1 = new Teacher(1, "Harman", 5000);
        Teacher tchr2 = new Teacher(2, "Pankaj", 4500);
        Teacher tchr3 = new Teacher(3, "Babita", 6500);
        List<Teacher> teacherlist=new ArrayList<>();
        teacherlist.add(tchr1);
        teacherlist.add(tchr2);
        teacherlist.add(tchr3);

        Student stdnt1 = new Student(1, "Park", "3rd");
        Student stdnt2 = new Student(2, "Diplav", "12th");
        Student stdnt3 = new Student(3, "Rohan", "9th");
        List<Student> studentlist=new ArrayList<>();
        studentlist.add(stdnt1);
        studentlist.add(stdnt2);
        studentlist.add(stdnt3);

        School DPS= new School(teacherlist, studentlist);

        stdnt1.UpdatePaidFee(13500);
        stdnt2.UpdatePaidFee(17800);
        stdnt3.UpdatePaidFee(12000);

        System.out.println("School earned money Rs"+DPS.getTotalMoneyEarned());

        tchr1.RecieveSalary(tchr1.getTchr_salary());
        tchr2.RecieveSalary(tchr2.getTchr_salary());
        tchr3.RecieveSalary(tchr3.getTchr_salary());
        System.out.println("School spend money Rs"+DPS.getTotalMoneySpend());

        stdnt1.UpdateTotalFine(2100);

        int SchoolHaveTotalMoney = DPS.getTotalMoneyEarned() - DPS.getTotalMoneySpend();
        System.out.println("School have money Rs"+SchoolHaveTotalMoney);
    }
}
