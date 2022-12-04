package btvn04.QLThuVien;

public class TapChi extends TaiLieu{
    private int thangPhatHanh;

    public TapChi(String tenNXB, String soPhatHanh, String maTL, int thangPhatHanh) {
        super(tenNXB, soPhatHanh, maTL);
        this.thangPhatHanh = thangPhatHanh;
    }

    public TapChi(){super();}

    public int getThangPhatHanh() {
        return this.thangPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        // neu thang phat hanh khong hop le, mac dinh set default value: 8
        int realMonth = thangPhatHanh > 0 && thangPhatHanh <= 12 ? thangPhatHanh:8;
        this.thangPhatHanh = realMonth;
    }

    @Override
    public String toString(){
        return "Tap Chi: Ma Tai Lieu=" + getMaTL() + "; NXB=" + getTenNXB() + "; So Phat Hanh=" + getSoPhatHanh() + "; Thang Phat Hanh=" + this.thangPhatHanh;
    }
}
