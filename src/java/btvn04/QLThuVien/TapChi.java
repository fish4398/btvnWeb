package QLThuVien;

public class TapChi {
    private int thangPhatHanh;

    public TapChi(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

    public int getThangPhatHanh() {
        return this.thangPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

    @Override
    public String toString() {
        return "TapChi{" +
                "thangPhatHanh=" + thangPhatHanh +
                '}';
    }
}
