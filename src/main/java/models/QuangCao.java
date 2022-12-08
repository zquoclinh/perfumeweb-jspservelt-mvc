package models;

import java.io.Serializable;

public class QuangCao implements Serializable{
    private String hinhAnh;
    private String thongDiep;
    private String thongTinChiTiet;
    private String ngayDang;
    public String getHinhAnh() {
        return hinhAnh;
    }
    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }
    public String getThongDiep() {
        return thongDiep;
    }
    public void setThongDiep(String thongDiep) {
        this.thongDiep = thongDiep;
    }
    public String getThongTinChiTiet() {
        return thongTinChiTiet;
    }
    public void setThongTinChiTiet(String thongTinChiTiet) {
        this.thongTinChiTiet = thongTinChiTiet;
    }
    public String getNgayDang() {
        return ngayDang;
    }
    public void setNgayDang(String ngayDang) {
        this.ngayDang = ngayDang;
    }
    public QuangCao() {
        super();
    }
    public QuangCao(String hinhAnh, String thongDiep, String thongTinChiTiet, String ngayDang) {
        super();
        this.hinhAnh = hinhAnh;
        this.thongDiep = thongDiep;
        this.thongTinChiTiet = thongTinChiTiet;
        this.ngayDang = ngayDang;
    }
    
}
