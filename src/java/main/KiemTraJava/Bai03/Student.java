package KiemTraJava.Bai03;

public class Student {
    private String firstName;
    private String lastName;
    private float gpa;

    public Student(String firstName, String lastName, float gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    public Student(){}

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public float getGpa() {
        return this.gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{firstName= " + this.firstName + ", lastName= " + this.lastName + ", gpa=" + this.gpa +"}";
    }

    /*
    Tính toán GPA và đưa ra thang điểm xếp loại.
< 5: Trung Bình; <8 Khá; <10: Giỏi; 10 Xuất sắc;
     */
    public String xepLoai(float gpa){
        String xeploai = "Trung Binh";
        if(gpa < 5) xeploai = "Trung Binh";
        else if (gpa < 8)     xeploai = "Kha";
        else if (gpa < 10) xeploai = "Gioi";
        else if (gpa == 10) xeploai = "Xuat sac";
        return xeploai;
    }
}
