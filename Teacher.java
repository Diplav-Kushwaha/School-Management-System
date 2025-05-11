package Project_SchoolManagementSystem;

public class Teacher {

    private int tchr_id;
    private String tchr_name;
    private int tchr_salary;
    private int salary_earned;

    public Teacher(int tchr_id, String tchr_name, int tchr_salary){

        this.tchr_id=tchr_id;
        this.tchr_name=tchr_name;
        this.tchr_salary=tchr_salary;
        this.salary_earned=0;

    }
    public int getTchr_id(){
        return tchr_id;
    }
    public String getTchr_name(){
        return tchr_name;
    }
    public void setTchr_salary(){
        this.tchr_salary=tchr_salary;
    }
    public int getTchr_salary(){
        return tchr_salary;
    }
    public void add(Teacher teacher) {
        teacher.add(teacher);
    }
    public void RecieveSalary(int salary){
        salary_earned=salary_earned+salary;
        School.UpdateTotalMoneySpend(salary);
    }
}
