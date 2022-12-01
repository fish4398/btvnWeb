package QLHoDanCu;

import QLHoDanCu.HoGiaDinh;

import java.util.Scanner;

public class Test {
    /*
    Để quản lý các hộ dân cư trong một khu phố, tổ trưởng cần các thông tin sau:
    Số thành viên trong gia đình, Số nhà, thông tin mỗi cá nhân trong gia đình.
Với mỗi cá nhân, người ta quản lý các thông tin sau: Họ tên, Tuổi, Nghề nghiệp,
số chứng minh nhân dân.


Hãy xây dựng lớp QLHoDanCu.Nguoi để quản lý thông tin của mỗi cá nhân.
Xây dựng lớp QLHoDanCu.HoGiaDinh để quản lý thông tin của từng hộ gia đình.
Xây dựng lớp QLHoDanCu.KhuPho để quản lý các thông tin của từng hộ gia đình.
Nhập n hộ dân. (n nhập từ bàn phím), hiển thị thông tin của các hộ trong khu phố.
     */
    public static void main(String[] args) {
        Nguoi nguoi1 = new Nguoi("Hoai", 24, "Tester", 34435464);
        Nguoi nguoi2 = new Nguoi("Hoai1", 24, "Tester1", 34435344);
        Nguoi nguoi3 = new Nguoi("Hoai2", 24, "Tester2", 34434464);
        Nguoi nguoi4 = new Nguoi("Hoai3", 24, "Tester3", 344334464);
        Nguoi nguoi5 = new Nguoi("Hoai4", 24, "Tester4", 344535464);
        Nguoi nguoi6 = new Nguoi("Hoai5", 24, "Tester5", 34434464);
        Nguoi nguoi7 = new Nguoi("Hoai6", 24, "Tester6", 344344464);

        HoGiaDinh hoGiaDinh = new HoGiaDinh();
        hoGiaDinh.themThanhVienVaoHo(nguoi2);
        hoGiaDinh.themThanhVienVaoHo(nguoi1);
        hoGiaDinh.setSoNha("34 Ngo tat to");
        hoGiaDinh.setSoThanhVien(hoGiaDinh.soThanhVienCuaHo());

        HoGiaDinh hoGiaDinh1 = new HoGiaDinh();
        hoGiaDinh1.themThanhVienVaoHo(nguoi3);
        hoGiaDinh1.themThanhVienVaoHo(nguoi4);
        hoGiaDinh1.themThanhVienVaoHo(nguoi5);
        hoGiaDinh1.setSoNha("20 dinh xuyen");
        hoGiaDinh1.setSoThanhVien(hoGiaDinh1.soThanhVienCuaHo());

        HoGiaDinh hoGiaDinh2 = new HoGiaDinh();
        hoGiaDinh2.themThanhVienVaoHo(nguoi6);
        hoGiaDinh2.themThanhVienVaoHo(nguoi7);
        hoGiaDinh2.setSoNha("107 nguyen sac phong");
        hoGiaDinh2.setSoThanhVien(hoGiaDinh2.soThanhVienCuaHo());

        KhuPho khuPho = new KhuPho();
        khuPho.themHoGD(hoGiaDinh);
        khuPho.themHoGD(hoGiaDinh1);
        khuPho.themHoGD(hoGiaDinh2);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap tong so ho ban muon biet thong tin");
        int n = scanner.nextInt();
        System.out.println("thong tin ho gia dinh la ");
        khuPho.inThongTinHGD(n);
    }
}
