package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SearchTest {
    private Bai2 qlsv;

    @BeforeEach
    public void ADD() {
        qlsv = new Bai2();
        qlsv.themSinhVien(new Sinhvien("1", "Nguyen Van A", "IT01", "Information Technology", "SV001"));
        qlsv.themSinhVien(new Sinhvien("2", "Le Thi B", "IT02", "Information Technology", "SV002"));
        qlsv.themSinhVien(new Sinhvien("3", "Tran Van C", "IT03", "Information Technology", "SV003"));
        qlsv.themSinhVien(new Sinhvien("4", "Pham Thi D", "IT04", "Information Technology", "SV004"));
        qlsv.themSinhVien(new Sinhvien("5", "Nguyen Van E", "IT05", "Information Technology", "SV005"));
    }

    @Test
    public void s1() {
        List<Sinhvien> ketQua = qlsv.timKiemTheoMaLop("IT01");
        assertEquals(1, ketQua.size());
        assertEquals("SV001", ketQua.get(0).getMasv());
    }

    @Test
    public void s2() {
        List<Sinhvien> ketQua = qlsv.timKiemTheoMaLop("IT06");
        assertEquals(0, ketQua.size());
    }

    @Test
    public void s3() {
        List<Sinhvien> ketQua = qlsv.timKiemTheoMaLop("");
        assertEquals(0, ketQua.size());
    }

    @Test
    public void s4() {
        qlsv.themSinhVien(new Sinhvien("6", "Nguyen Van F", "IT01", "Information Technology", "SV006"));
        List<Sinhvien> ketQua = qlsv.timKiemTheoMaLop("IT01");
        assertEquals(2, ketQua.size());
    }

    @Test
    public void s5() {
        qlsv.themSinhVien(new Sinhvien("7", "Le Van G", "IT07", "Information Technology", "SV002"));
        List<Sinhvien> ketQua = qlsv.timKiemTheoMaLop("IT07");
        assertEquals(1, ketQua.size());
        assertEquals("SV002", ketQua.get(0).getMasv());
    }

}