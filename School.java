package Project_SchoolManagementSystem;

import java.util.List;
public class School {

    private List<Teacher> teacher;
    private List<Student> student;
    private static int TotalMoneyEarned;
    private static int TotalMoneySpend;
    private static int SchoolHaveTotalMoney;

    public School(List<Teacher> teacher, List<Student> student) {
        this.TotalMoneySpend=0;
        this.TotalMoneyEarned=0;
        this.teacher = teacher;
        this.student = student;
    }
    public static void UpdateTotalMoneyEarned(int paidFee) {
        TotalMoneyEarned = TotalMoneyEarned+paidFee;
    }
    public static void UpdateTotalMoneySpend(int salary) {
        TotalMoneySpend = TotalMoneySpend+salary;
    }
    public static void UpdateTotalFine(int fine){
        TotalMoneyEarned = TotalMoneyEarned + fine;
    }
    public List<Teacher> getTeacher() {
        return teacher;
    }
    public void add(Teacher teacher) {
        teacher.add(teacher);
    }
    public List<Student> getStudent() {
        return student;
    }
    public void addStudent(Student student) {
        Student.add(student);
    }
    public int getTotalMoneyEarned() {
        return TotalMoneyEarned;
    }
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        TotalMoneyEarned = TotalMoneyEarned+MoneyEarned;
    }
    public int getTotalMoneySpend() {
        return TotalMoneySpend;
    }
    public void updateTotalMoneySpend(int MoneySpend) {
        TotalMoneySpend = TotalMoneySpend + MoneySpend;
        TotalMoneyEarned = TotalMoneyEarned - MoneySpend;
    }
}
