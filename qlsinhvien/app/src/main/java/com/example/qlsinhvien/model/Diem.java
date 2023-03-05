package com.example.qlsinhvien.model;

public class Diem {
    private String Masv;
    private Float  Diemtoan ;
    private Float Diemhoa ;
    private Float Diemly ;
    private Float Tbc ;

    public Diem() {
    }

    public Diem(String masv, Float diemtoan, Float diemhoa, Float diemly, Float tbc) {
        Masv = masv;
        Diemtoan = diemtoan;
        Diemhoa = diemhoa;
        Diemly = diemly;
        Tbc = tbc;
    }

    public String getMasv() {
        return Masv;
    }

    public void setMasv(String masv) {
        Masv = masv;
    }

    public Float getDiemtoan() {
        return Diemtoan;
    }

    public void setDiemtoan(Float diemtoan) {
        Diemtoan = diemtoan;
    }

    public Float getDiemhoa() {
        return Diemhoa;
    }

    public void setDiemhoa(Float diemhoa) {
        Diemhoa = diemhoa;
    }

    public Float getDiemly() {
        return Diemly;
    }

    public void setDiemly(Float diemly) {
        Diemly = diemly;
    }

    public Float getTbc() {
        return Tbc;
    }

    public void setTbc(Float tbc) {
        Tbc = tbc;
    }
}
