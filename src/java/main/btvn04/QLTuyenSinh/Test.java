package btvn04.QLTuyenSinh;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Test {
    private static final Scanner sc = new Scanner(System.in);
    private static ListStudent listStudent;
    private static Student student;
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
//        System.out.println("Nhap so hoc sinh ban muon nhap: ");
//        int n = sc.nextInt();
//        for (int i = 0; i < n; i++){
//            System.out.println("Nhap loai hoc sinh ban dien (G la good student, other la hoc sinh normal student): ");
//            String typeSt = sc.next().trim().toUpperCase();
//            String fullName = inputName();
//
//        }
        inputName(student);
        System.out.println(student.getFullName());

        boolean check = checkPhoneNumber(student);
        if(!check) return;
        System.out.println(student.getPhoneNumber());

        boolean checkBir = checkBirth(student);
        if(!checkBir) return;
        System.out.println(student.getDoB());


    }

    public static void inputName(Student student){
        String fullName = "";
        for (int i = 0; i < 3; i++) {
            System.out.println("Nhap ten hoc sinh (dieu kien co chiều dài tối đa là 50 ký tự và tổi thiểu là 10 ký tự. Nếu sai cho phép nhập tổng 3 lần): ");
            fullName = sc.nextLine().trim();
            if(fullName.length() >= 10 && fullName.length() <= 50) {
                break;
            }
            if(i == 2) {
                System.out.printf("Ban da nhap sai %s lan. ban da mat 1 lan nhap hoc sinh vao list hoc sinh.", i + 1);
                break;
            }
            System.out.printf("\nBan da nhap sai %s lan. Xin moi ban nhap lai ho va ten sinh vien.", i + 1);
        }
        student.setFullName(fullName);
    }

    public static boolean checkPhoneNumber(Student student){
        System.out.println("SDT gom 10 so va bat dau bang 1 trong cac so o list {\"090\", \"098\", \"091\", \"031\", \"035\", \"038\"}. Nhap so DT: ");
        String number = sc.nextLine().trim();
        String[] startNumber = {"090", "098", "091", "031", "035", "038"};
        try {
            Integer.parseInt(number);
            if((number.length() == 10) && Arrays.stream(startNumber).anyMatch(n -> number.startsWith(n))) {
                student.setPhoneNumber(number);
                return true;
            }else return false;
        }catch (NumberFormatException e){
            System.out.println("Throw InvalidPhoneNumberException");
            return false;
        }
    }

    public static boolean checkBirth(Student student){
        System.out.println("Ngay sinh nhap theo dinh dang dd/MM/yyyy.");
        System.out.println("Nhap ngay sinh: ");
        String birth = sc.nextLine().trim();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        simpleDateFormat.setLenient(false);
        try {
            Date dateBirth = simpleDateFormat.parse(birth);
            student.setDoB(birth);
        }catch (ParseException e){
            System.out.println("Throw InvalidDOBException");
            return false;
        }
        return true;
    }

    public static void inputSex(Student student){
        System.out.println("Gioi tinh gom: M (male), F (female), O (other). Neu ban nhap ky tu khac M hoac F he thong se tu dong hieu gioi tinh cua ban la O (other). Please chu y!");
        System.out.println("Nhap gioi tinh: ");
        String sex = sc.nextLine().trim().toUpperCase();
        if(sex.equals("M")) student.setSex("Male");
        else if(sex.equals("F")) student.setSex("Female");
        else student.setSex("Other");
    }

    public static void inputUniversity(Student student){
        System.out.println("Nhap ten truong dai hoc cua ban: ");
        String name = sc.nextLine().trim();
        student.setUniversityName(name);
    }

    public static void inputGradeLevel(Student student){
        String[] list = {"Yeu", "Trung Binh", "Kha", "Gioi", "Xuat Sac"};
        System.out.println("Xep loai tot nghiep: Yeu, Trung Binh, Kha, Gioi, Xuat Sac. Please chu y nhap sai se tu dong xep ban thanh loai yeu.");
        System.out.println("Nhap xep loai: ");
        String level = sc.nextLine().trim().toUpperCase();
        Arrays.stream(list).forEach(v->{
            if(v.toUpperCase().equals(level)) student.setGradeLevel(v);
            else student.setGradeLevel(list[0]);
        });
    }

    // englishScore entryTestScore

    public static void printTrungTuyen(int soNguoi){
        int countPerson = (int) listStudent.getStudentList().stream().count();



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
