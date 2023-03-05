package com.example.qlsinhvien.model;

public class SinhVien {
    private String Massv ;
    private String Tensv ;
    private String Ngaysinh ;
    private String Sodt ;
    private String Diachi ;

    public SinhVien() {

    }

    public SinhVien(String massv, String tensv, String ngaysinh, String sodt, String diachi) {
        Massv = massv;
        Tensv = tensv;
        Ngaysinh = ngaysinh;
        Sodt = sodt;
        Diachi = diachi;
    }

    public String getMassv() {
        return Massv;
    }

    public void setMassv(String massv) {
        Massv = massv;
    }

    public String getTensv() {
        return Tensv;
    }

    public void setTensv(String tensv) {
        Tensv = tensv;
    }

    public String getNgaysinh() {
        return Ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        Ngaysinh = ngaysinh;
    }

    public String getSodt() {
        return Sodt;
    }

    public void setSodt(String sodt) {
        Sodt = sodt;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String diachi) {
        Diachi = diachi;
    }
}
