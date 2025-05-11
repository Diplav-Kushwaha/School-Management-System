package Project_SchoolManagementSystem;

public class Student {

    private int std_id;
    private String std_name;
    private String std_class;
    private int paid_fee;         // initial fees paid always zero(0)
    private int total_fee;        // let total fee od School is Rs 20,000
    private int total_fine;       // initial total fine always zero(0)

    public Student(int std_id, String std_name, String std_class){

        this.paid_fee=0;
        this.total_fine=0;
        this.total_fee=20000;
        this.std_id=std_id;
        this.std_name=std_name;
        this.std_class=std_class;

    }
    public static void add(Student student) {
        Student.add(student);
    }
    public int getStd_id(){
        return std_id;
    }
    public String getStd_name(){
        return std_name;
    }
    public void setStd_class(String std_class){
        this.std_class=std_class;
    }
    public String getStd_class(){
        return std_class;
    }
    public int getPaid_fee(){
        return paid_fee;
    }
    public int getTotal_fee(){
        return total_fee;
    }
    public int getTotal_fine(int i){
        return total_fine;
    }
    public void UpdatePaidFee(int fee){
        paid_fee = paid_fee + fee;
        School.UpdateTotalMoneyEarned(paid_fee);
    }
    public void UpdateTotalFine(int fine){
        total_fine = total_fine + fine;
        School.UpdateTotalFine(fine);
    }
}
