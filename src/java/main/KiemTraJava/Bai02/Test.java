package KiemTraJava.Bai02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    /*
    Xây dựng chương trình in ra các chuỗi fibonacci trong khoảng từ 100 tới 10000. Dãy Fibonacci
    là dãy vô hạn các số tự nhiên bắt đầu bằng 1 và 1, sau đó các số tiếp theo sẽ bằng tổng của 2
    số liền trước nó.
     */

    public static void main(String[] args) {
        System.out.println("chuỗi fibonacci trong khoảng từ 100 tới 10000");
        printFabonacci(100, 1000);
    }

    public static void printFabonacci(int start, int end){
        List<Integer> fibonacci = new ArrayList<>();
        if (end == 0) System.out.printf("\nSo %s khong phai la so Fabonacci", end);
        else if(end == 1 || end == 2) {
            fibonacci.add(1);
        }
        else {
            fibonacci.add(1);
            fibonacci.add(1);
            int sum;
            for(int i = 2; i <= end; i++){
                sum = fibonacci.get(i - 1) + fibonacci.get(i - 2);
                fibonacci.add(sum);
            }
        }
        fibonacci.stream().filter(f-> f>= start && f <= end).forEach(f-> System.out.print(f + " "));
    }
}
