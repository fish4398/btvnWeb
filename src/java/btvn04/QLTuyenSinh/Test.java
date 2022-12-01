package QLTuyenSinh;


import java.text.ParseException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test {
    private static final Scanner sc = new Scanner(System.in);
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
    public static void main(String[] args) throws ParseException {
        checkPhoneNumber("0991234567");
    }

    public static void checkInfor(String fullname, String birth, String number){

    }

    public static void checkName(){
        int count = 0;
        while (count < 3){
            String fullName = sc.nextLine();
            if (fullName.length() >= 10 && fullName.length() <= 50) break;
            else System.out.println("Input files have unknow errors !!! Please try again!");
            count++;
        }
    }

    public static void checkPhoneNumber(String number){
        String[] startNumber = {"090", "098", "091", "031", "035", "038"};
        if((number.length() == 10) && Arrays.stream(startNumber).anyMatch(n -> number.startsWith(n))) {
            System.out.println("Pass");
        }else System.out.println("Throw InvalidPhoneNumberException");
    }

    public static void checkBirth(String birth){
        
    }

}
