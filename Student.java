package StudentManagement;

public class Student {
    public String fullname;
    public String id;
    public double marks;
    public String rank;
    public Student(String id, String fullname, double marks){
        this.id = id;
        this.fullname = fullname;
        this.marks = marks;
        if(this.marks >= 0 && this.marks < 5){
            this.rank = "Fail";
        } else if (this.marks >= 5 && this.marks < 6.5) {
            this.rank = "Medium";
        } else if (this.marks >= 6.5 && this.marks < 7.5) {
            this.rank = "Good";
        } else if (this.marks >= 7.5 && this.marks < 9) {
            this.rank = "Very good";
        } else if (this.marks >= 9 && this.marks <= 10) {
            this.rank = "Excellent";
        }
    }
}
