package KiemTraJava.Bai01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    /*
    Xây dựng chương trình in ra chuỗi ký tự từ bàn phím điện thoại.
Như các bạn đã biết, điện thoại gồm các phím số và ký tự theo quy tắc
sau:
Phím số 02: Gồm 03 ký tự (a, b, c); Với các phím số đặc biệt, ta quy ước như sau; 1 ~ ký tự @; 0 ký tự $;
Hãy viết chương trình nhập vào 2 số và in ra danh sách các cặp giá trị có thể xảy ra của nó theo thứ tự
Ví dụ: Nhập vào số 23 => Kết quả: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
Thứ tự được lưu từ số đầu kết hợp với các số tiếp theo ví dụ thứ tự kết hợp sẽ là 2->3 và sẽ không tính 3->2.
Giải thích: Chúng ta kết hợp 2 (a,b,c) kết hợp 3(d,e,f): Kết hợp từng số ta sẽ có các cặp số như trên;

Điều kiện: 0 < số nhập vào < 399
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Điều kiện: 0 < số nhập vào < 399");
        System.out.println("Nhap so ma ban muon");
        try {
            String strnum = scanner.nextLine();
            int number = Integer.parseInt(strnum);
            if(number <= 0 || number >= 399) return;
            listCharInNum(number);
        }catch (NumberFormatException e){
            e.printStackTrace();
        }
    }

    private static void listCharInNum(int number){
        String[] num1 = {"@"};
        String[] num2 = {"a", "b", "c"};
        String[] num3 = {"d", "e", "f"};
        String[] num4 = {"g", "h", "i"};
        String[] num5 = {"j", "k", "l"};
        String[] num6 = {"m", "n", "o"};
        String[] num7 = {"p", "q", "s", "r"};
        String[] num8 = {"t", "u", "v"};
        String[] num9 = {"w", "x", "y", "z"};
        String[] num0 = {"$"};
        List<String[]> list = new ArrayList<>();
        list.add(num1);
        list.add(num2);
        list.add(num3);
        list.add(num4);
        list.add(num5);
        list.add(num6);
        list.add(num7);
        list.add(num8);
        list.add(num9);
        list.add(num0);

        list.forEach(v-> System.out.println(v));
        if(number < 10){
            String[] matrix = new String[number];
            for(int i = 0; i <= list.get(number - 1).length; i++){
//                matrix[i] = String.valueOf(list.get(number + 1));
            }
            System.out.println(matrix);
        }else if(number < 100){

        }else {

        }
    }
}
