package KiemTraJava.Bai04;

import java.util.Scanner;

public class Test {
    /*
    Xây dựng chương trình triển khai các thông tin trên.
Phát triển phương tính tính diện tích (getArea) và tạo ra đối tượng cho từng loại dựa trên kích
thước người dùng nhập vào.
Diện tích hình tròn: S = πR2.
Diện tích hình vuông/chữ nhật: S = Dai x Rong
     */
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        callShape();
    }

    private static void callShape(){
        int yourChoose = 0;
        do{
            System.out.println("Moi ban nhap hinh ban muon tinh: " +
                    "\n1. Hinh tron" +
                    "\n2. Hinh chu nhat" +
                    "\n3. Hinh vuong" +
                    "\n4. Thoat chuong trinh hay nhan 0");
            yourChoose = scanner.nextInt();
            if(yourChoose == 1) callCircle();
            else if (yourChoose == 2) callRectangle();
            else if (yourChoose == 3) callSquare();
        }while (yourChoose != 0);
    }

    public static void callCircle(){
        Circle circle = new Circle();
        System.out.println("Moi ban nhap color: ");
        String color = scanner.next().trim().toLowerCase();

        System.out.println("Moi ban nhap trang thai cua filled (T la true, other False): ");
        String filled = scanner.next().trim().toLowerCase();
        boolean fi = filled.equals("t");

        System.out.println("Moi ban nhap ban kinh (la kieu doublt 1.0): ");
        String r = scanner.next().trim();
        try {
            double ra = Double.parseDouble(r);
            circle.setRadius(ra);
            circle.setColor(color);
            circle.setFilled(fi);
            System.out.println("Thong tin hinh tron la " + circle.toString());
            System.out.println("Dien tich hinh tron la " + circle.getArea());
            System.out.println("Chu vi hinh tron la " + circle.getPerimeter());
        }catch (NumberFormatException e){
            e.printStackTrace();
        }
    }

    public static void callRectangle(){
        Rectangle rectangle = new Rectangle();
        System.out.println("Moi ban nhap color: ");
        String color = scanner.next().trim().toLowerCase();

        System.out.println("Moi ban nhap trang thai cua filled (T la true, other False): ");
        String filled = scanner.next().trim().toLowerCase();
        boolean fi = filled.equals("t");

        System.out.println("Moi ban nhap chieu dai (la kieu double 1.0): ");
        String length = scanner.next().trim();
        System.out.println("Moi ban nhap chieu rong (la kieu double 1.0): ");
        String width = scanner.next().trim();
        try {
            double le = Double.parseDouble(length);
            double wi = Double.parseDouble(width);
            rectangle.setLength(le);
            rectangle.setWidth(wi);
            rectangle.setColor(color);
            rectangle.setFilled(fi);
            System.out.println("Thong tin hinh chu nhat la " + rectangle.toString());
            System.out.println("Dien tich hinh tron la " + rectangle.getArea());
            System.out.println("Chu vi hinh tron la " + rectangle.getPerimeter());
        }catch (NumberFormatException e){
            e.printStackTrace();
        }
    }

    public static void callSquare(){
        Square square = new Square();
        System.out.println("Moi ban nhap color: ");
        String color = scanner.next().trim().toLowerCase();

        System.out.println("Moi ban nhap trang thai cua filled (T la true, other False): ");
        String filled = scanner.next().trim().toLowerCase();
        boolean fi = filled.equals("t");

        System.out.println("Moi ban nhap chieu dai (la kieu doublt 1.0): ");
        String r = scanner.next().trim();
        try {
            double ra = Double.parseDouble(r);
            square.setSide(ra);
            square.setColor(color);
            square.setFilled(fi);
            System.out.println("Thong tin hinh tron la " + square.toString());
        }catch (NumberFormatException e){
            e.printStackTrace();
        }
    }
}
