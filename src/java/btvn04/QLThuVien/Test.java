package QLThuVien;

public class Test {
    /*
    1. Thư viện cần quản lý các tài liệu bao gồm Sách, Tạp chí, Báo.
+ Tài liệu có các thuộc tính sau; Mã tài liệu, Tên nhà xuất bản, Số phát hành.
+ Sách cần quản lý thêm các thuộc tính: tên tác giả, số trang.
+ Tạp chí cần quản lý thêm: Số phát hành, tháng phát hành.
+ Báo cần quản lý thêm: Ngày phát hành. <br>
Thực hiện các yêu cầu sau:
  + Xây dựng các lớp để quản lý tài liệu cho thư viện một cách hiệu quả.
  + Xây dựng lớp QuanLySach chứa các tập dữ liệu (Dữ liệu tự tạo) có các chức năng sau
    + Thêm mới tài liêu: Sách, tạp chí, báo.
    + Xoá tài liệu theo mã tài liệu.
    + Hiện thị thông tin về tài liệu.
    + Tìm kiếm tài liệu theo loại: Sách, tạp chí, báo.

     */
    public static void main(String[] args) {
        Sach sach = new Sach("KimDong", "S001", "ThieuNhi", "Vincent", 50);
        Sach sach1 = new Sach("KimDong", "S002", "ThieuNhi", "Vincent", 50);
        Sach sach2 = new Sach("KimDong", "S003", "ThieuNhi", "Vincent", 50);
        Bao bao = new Bao("TuoiTre", "B001", "DanCa", 16);
        Bao bao1 = new Bao("TuoiTre", "B002", "DanCa", 16);
        Bao bao2 = new Bao("TuoiTre", "B003", "DanCa", 16);
        TapChi tapChi = new TapChi("HoaHocTro", "T001", "SinhVien", 10);
        TapChi tapChi1 = new TapChi("HoaHocTro", "T002", "SinhVien", 10);
        TapChi tapChi2 = new TapChi("HoaHocTro", "T003", "SinhVien", 10);
        TaiLieu t = new Sach("KimDong", "S001", "ThieuNhi", "Vincent", 50);
        System.out.println(t.toString());

        QuanLySach quanLySach = new QuanLySach();
        quanLySach.addTaiLieu(sach);
        quanLySach.addTaiLieu(sach1);
        quanLySach.addTaiLieu(sach2);
        quanLySach.addTaiLieu(bao);
        quanLySach.addTaiLieu(bao1);
        quanLySach.addTaiLieu(bao2);
        quanLySach.addTaiLieu(tapChi);
        quanLySach.addTaiLieu(tapChi1);
        quanLySach.addTaiLieu(tapChi2);

        quanLySach.xoaTaiLieu(sach1.getMaTL());
        quanLySach.hienThiThongTinTaiLieu(tapChi);
        quanLySach.timKiemBao();
    }
}
