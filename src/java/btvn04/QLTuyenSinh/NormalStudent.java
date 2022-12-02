package QLTuyenSinh;

public class NormalStudent extends Student{
    private float englishScore;
    private float entryTestScore;


    private Student student;

    public NormalStudent(String fullName, String doB, String sex, int phoneNumber, String universityName, String gradeLevel, float englishScore, float entryTestScore, Student student) {
        super(fullName, doB, sex, phoneNumber, universityName, gradeLevel);
        this.englishScore = englishScore;
        this.entryTestScore = entryTestScore;
        this.student = student;
    }

    public float getEnglishScore() {
        return this.englishScore;
    }

    public void setEnglishScore(float englishScore) {
        this.englishScore = englishScore;
    }

    public float getEntryTestScore() {
        return this.entryTestScore;
    }

    public void setEntryTestScore(float entryTestScore) {
        this.entryTestScore = entryTestScore;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "NormalStudent{" +
                "englishScore=" + englishScore +
                ", entryTestScore=" + entryTestScore +
                ", student=" + student +
                '}';
    }
}
