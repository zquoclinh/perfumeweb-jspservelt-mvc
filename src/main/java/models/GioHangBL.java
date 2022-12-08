package models;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import javabeans.SanPham;
import javabeans.SanPhamMua;

public class GioHangBL {
    private Hashtable<Integer, Integer> dsh; // key: id san pham, value: so luong mmua
    public GioHangBL() {
        dsh = new Hashtable<>();
    }
    public void them(int idsp, int slm) {
        if(dsh.containsKey(idsp)) 
            dsh.replace(idsp, dsh.get(idsp)+slm);
        else
            dsh.put(idsp, slm);     
    }
    public int soMatHang() {
        return dsh.size();
    }
    public double tongTien() {
        double tt = 0;
        for(int idsp:dsh.keySet()) {
            SanPham sp = SanPhamBL.docTheoID(idsp);
            tt += sp.getDonGiaKM() * dsh.get(idsp);
        }
        return tt;
    }
    public List<SanPhamMua> danhSachSanPhamMua(){
        List<SanPhamMua> dsspm = new ArrayList<>();
        for(int idsp:dsh.keySet()) {
            SanPham sp = SanPhamBL.docTheoID(idsp);
            SanPhamMua spm = new SanPhamMua();
            
            spm.setId(sp.getId());
            spm.setTenSanPham(sp.getTenSanPham());
            spm.setMoTa(sp.getMoTa());
            spm.setHinhAnh(sp.getHinhAnh());
            spm.setDonGia(sp.getDonGia());
            spm.setDonGiaKM(sp.getDonGiaKM());
            spm.setSoLuong(sp.getSoLuong());
            spm.setNgayTao(sp.getNgayTao());
            spm.setHienThi(sp.getHienThi());
            spm.setId_loai(sp.getId_loai());
            spm.setId_thuongHieu(sp.getId_thuongHieu());
            
            spm.setSoLuongMua(dsh.get(idsp));
            
            dsspm.add(spm);
        }
        return dsspm;
    }
    public List<SanPhamMua> xoaSanPhamMua(){
        List<SanPhamMua> dsspm = new ArrayList<>();
        for(int idsp:dsh.keySet()) {
            SanPham sp = SanPhamBL.docTheoID(idsp);
            SanPhamMua spm = new SanPhamMua();
            
            spm.setId(sp.getId());
            spm.setTenSanPham(sp.getTenSanPham());
            spm.setMoTa(sp.getMoTa());
            spm.setHinhAnh(sp.getHinhAnh());
            spm.setDonGia(sp.getDonGia());
            spm.setDonGiaKM(sp.getDonGiaKM());
            spm.setSoLuong(sp.getSoLuong());
            spm.setNgayTao(sp.getNgayTao());
            spm.setHienThi(sp.getHienThi());
            spm.setId_loai(sp.getId_loai());
            spm.setId_thuongHieu(sp.getId_thuongHieu());
            
            spm.setSoLuongMua(dsh.get(idsp));
            
            dsspm.remove(spm);
        }
        return dsspm;
//  public static void main(String[] args) {
//      gio_hang gh = new gio_hang();
//      gh.them(1, 1);
//      gh.them(2, 1);
//      System.out.println(gh.soMatHang());
//      System.out.println(gh.tongTien());
//  }
//  public static void main(String[] args) {
//      gio_hang gh = new gio_hang();
//      gh.them(1, 1);
//      gh.them(2, 1);
//      for(SanPhamMua spm:gh.danhSachSanPhamMua()) {
//          System.out.println(spm.getTenSanPham() + spm.getSoLuongMua());
//      }
//  }
    }
}
