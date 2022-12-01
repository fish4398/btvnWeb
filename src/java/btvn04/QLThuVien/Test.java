package QLThuVien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Sach sach1 = new Sach("Ngo Tat To", 3435);
        Sach sach2 = new Sach("Nam Cao", 345);

        TapChi tapChi1 = new TapChi(8);
        TapChi tapChi2 = new TapChi(12);

        Bao bao1 = new Bao(21);
        Bao bao2 = new Bao(30);

        TaiLieu taiLieu1 = new TaiLieu(sach1, "S001", "Phuong Nam", "12S");
        TaiLieu taiLieu2 = new TaiLieu(sach2, "S002", "Nha sach Tuoi Tre", "313b");
        TaiLieu taiLieu3 = new TaiLieu(bao1, "B001", "New York Time", "343B");
        TaiLieu taiLieu4 = new TaiLieu(bao2, "B002", "Braza", "34234B");
        TaiLieu taiLieu5 = new TaiLieu(tapChi1, "TC001", "Sao Mai", "5657F");
        TaiLieu taiLieu6 = new TaiLieu(tapChi2, "TC002", "Tuoi Tre", "454v");

        List<TaiLieu> taiLieuList = new ArrayList<>();
        taiLieuList.add(taiLieu1);
        taiLieuList.add(taiLieu2);
        taiLieuList.add(taiLieu3);
        taiLieuList.add(taiLieu4);
        taiLieuList.add(taiLieu5);
        taiLieuList.add(taiLieu6);

        System.out.println("In list tai lieu");
        System.out.println(taiLieuList);

        System.out.println("Nhap ma tai lieu ban muon xoa");
        Scanner scanner = new Scanner(System.in);

        String maTaiLieuXoa = scanner.nextLine();

        QuanLySach quanLySach = new QuanLySach(taiLieuList);
        System.out.println(quanLySach.deleteTaiLieu(maTaiLieuXoa));
        System.out.println(quanLySach);

        System.out.println("Ham search");
        quanLySach.searchTaiLieu(sach1);
//        QuanLySach quanLySach = new QuanLySach(taiLieuList);
//
//        System.out.println(quanLySach.deleteTaiLieu("S001"));
    }
}
