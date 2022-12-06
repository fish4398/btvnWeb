package btvn04.QLTuyenSinh;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Test {
    private static final Scanner sc = new Scanner(System.in);
    private static ListStudent listStudent = new ListStudent();
    /*
    Họ tên sinh viên có chiều dài tối đa là 50 ký tự và tổi thiểu là 10 ký tự.
    Nếu sai cho phép nhập tổng 3 lần. Quá hạn dừng chương trình và không được nhập thông tin nữa
Chương trình phải bắt được lỗi sai định dạng ngày tháng năm đối với trường DoB phải
theo định dạng dd/MM/YYYY. Throw InvalidDOBException nếu có thông tin không chính xác
Số điện thoại: phải là chuỗi số có chiều dài 10 ký tự và phải bắt đầu bằng một trong
các chuỗi số: 090, 098, 091, 031, 035 hoặc 038. Throw InvalidPhoneNumberException nếu SĐT không hợp lệ
Ngoài ra nếu có bất cứ một exception nào khác trong quá trình thực thi chương trình,
hãy thông báo ra màn hình nội dung “Input files have unknow errors !!!”
     */
    public static void main(String[] args) {
        System.out.println("Nhap so hoc sinh ban muon nhap: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            System.out.println("Nhap loai hoc sinh ban dien (G la good student, other la hoc sinh normal student): ");
            String typeSt = sc.next().trim().toUpperCase();
            if(typeSt.equals("G")) {
                GoodStudent student = new GoodStudent();
                if(!student.checkInputName() || !student.checkPhoneNumber() || !student.checkBirth()) continue;
                student.inputSex();
                student.inputUniversity();
                student.inputGradeLevel();
                if(!student.checkGPA()) continue;
                student.inputBestReward();
                listStudent.addStudent(student);
            }
            else {
                NormalStudent student = new NormalStudent();
                if(!student.checkInputName() || !student.checkPhoneNumber() || !student.checkBirth()) continue;
                student.inputSex();
                student.inputUniversity();
                student.inputGradeLevel();
                if(!student.checkEnglishScore() || !student.checkEntryTestScore()) continue;
                listStudent.addStudent(student);
            }

        }
        System.out.println("list danh sach hoc sinh la ");
        listStudent.getStudentList().forEach(Student::toString);

    }


    public static Student typeStudent(Student student){
        System.out.println("Nhap loai hoc sinh ban dien (G la good student, other la hoc sinh normal student): ");
        String typeSt = sc.next().trim().toUpperCase();
        if(typeSt.equals("G")) return student = new GoodStudent();
        else return student = new NormalStudent();
    }

    public static void printTrungTuyen(int soNguoi){
        int countPerson = listStudent.getStudentList().size();


//        int soluongGood = (int) listStudent.getGoodStudentList().stream().count();
//        if(soNguoi <= soluongGood){
//            listStudent.getGoodStudentList().stream().sorted((o1, o2)->{
//                if(o1.getGpa() == o2.getGpa())
//                    return o1.getFullName().compareTo(o2.getFullName());
//                else if(o1.getGpa() > o2.getGpa()) return 1;
//                else return -1;
//            }).limit(soNguoi).forEach(System.out::println);
//        }else {
//            listStudent.getGoodStudentList().forEach(System.out::println);
//            listStudent.getNormalStudentList().stream().sorted((o1, o2)->{
//                if(o1.getEntryTestScore() == o2.getEntryTestScore()){
//                    if(o1.getEnglishScore() == o2.getEnglishScore()){
//                        return o1.getFullName().compareTo(o2.getFullName());
//                    }else if (o1.getEnglishScore() > o2.getEnglishScore()) return 1;
//                    else return -1;
//                } else if (o1.getEntryTestScore() > o2.getEntryTestScore()) return 1;
//                else return -1;
//            }).limit(soNguoi - soluongGood).forEach(System.out::println);

    }

}
