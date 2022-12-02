package QLTuyenSinh;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class Test {
    private static final Scanner sc = new Scanner(System.in);
    private static ListStudent listStudent;
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
        checkPhoneNumber("0981234567");
        checkBirth("04/03/1198");
    }

    public static boolean checkName(String fullName){
        if (fullName.length() >= 10 && fullName.length() <= 50) return true;
        else return false;
    }

    public static boolean checkPhoneNumber(String number){
        String[] startNumber = {"090", "098", "091", "031", "035", "038"};
        try {
            Integer.parseInt(number);
            if((number.length() == 10) && Arrays.stream(startNumber).anyMatch(n -> number.startsWith(n))) {
                return true;
            }else return false;
        }catch (NumberFormatException e){
            System.out.println("Throw InvalidPhoneNumberException");
            return false;
        }
    }

    public static boolean checkBirth(String birth){

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        simpleDateFormat.setLenient(false);
        try {
            Date dateBirth = simpleDateFormat.parse(birth);
            System.out.println(dateBirth);
        }catch (ParseException e){
            System.out.println("Throw InvalidDOBException");
            return false;
        }
        return true;
    }

    public static void printTrungTuyen(int soNguoi){
        int soluongGood = (int) listStudent.getGoodStudentList().stream().count();
        if(soNguoi <= soluongGood){
            listStudent.getGoodStudentList().stream().sorted((o1, o2)->{
                if(o1.getGpa() == o2.getGpa())
                    return o1.getFullName().compareTo(o2.getFullName());
                else if(o1.getGpa() > o2.getGpa()) return 1;
                else return -1;
            }).limit(soNguoi).forEach(System.out::println);
        }else {
            listStudent.getGoodStudentList().forEach(System.out::println);
            listStudent.getNormalStudentList().stream().sorted((o1, o2)->{
                if(o1.getEntryTestScore() == o2.getEntryTestScore()){
                    if(o1.getEnglishScore() == o2.getEnglishScore()){
                        return o1.getFullName().compareTo(o2.getFullName());
                    }else if (o1.getEnglishScore() > o2.getEnglishScore()) return 1;
                    else return -1;
                } else if (o1.getEntryTestScore() > o2.getEntryTestScore()) return 1;
                else return -1;
            }).limit(soNguoi - soluongGood).forEach(System.out::println);
        }
    }

}
