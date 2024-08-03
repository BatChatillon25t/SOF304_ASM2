package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AddTest {
    private Bai2 qlsv;

    @BeforeEach
    public void setUp() {
        qlsv = new Bai2();
    }

    @Test
    public void test1() {
        Sinhvien sv = new Sinhvien("1", "Nguyen Van A", "IT01", "Information Technology", "SV001");
        qlsv.themSinhVien(sv);
        assertEquals(1, qlsv.getDanhSachSinhVien().size());
    }

    @Test
    public void test2() {
        Sinhvien sv = new Sinhvien("2", "Le Thi B", "IT02", "Information@Technology", "SV002");
        assertThrows(IllegalArgumentException.class, () -> qlsv.themSinhVien(sv));
    }

    @Test
    public void test3() {
        Sinhvien sv = new Sinhvien("3", "Tran Van C", "IT03", "", "SV003");
        qlsv.themSinhVien(sv);
        assertEquals(1, qlsv.getDanhSachSinhVien().size());
    }

    @Test
    public void test4() {
        String tenlopDai = "A".repeat(256);
        Sinhvien sv = new Sinhvien("4", "Pham Thi D", "IT04", tenlopDai, "SV004");
        assertThrows(IllegalArgumentException.class, () -> qlsv.themSinhVien(sv));
    }

    @Test
    public void test5() {
        String tenlopVuaDu = "A".repeat(255);
        Sinhvien sv = new Sinhvien("5", "Nguyen Van E", "IT05", tenlopVuaDu, "SV005");
        qlsv.themSinhVien(sv);
        assertEquals(1, qlsv.getDanhSachSinhVien().size());
    }

    @Test
    public void test6() {
        Sinhvien sv = new Sinhvien("6", "", "IT06", "Information Technology", "SV006");
        qlsv.themSinhVien(sv);
        assertEquals(1, qlsv.getDanhSachSinhVien().size());
    }

    @Test
    public void test7() {
        String hotenDai = "A".repeat(256); // Giả sử độ dài tối đa là 255 ký tự
        Sinhvien sv = new Sinhvien("7", hotenDai, "IT07", "Information Technology", "SV007");
        assertThrows(IllegalArgumentException.class, () -> qlsv.themSinhVien(sv));
    }

    @Test
    public void test8() {
        String hotenVuaDu = "A".repeat(255);
        Sinhvien sv = new Sinhvien("8", hotenVuaDu, "IT08", "Information Technology", "SV008");
        qlsv.themSinhVien(sv);
        assertEquals(1, qlsv.getDanhSachSinhVien().size());
    }

    @Test
    public void test9() {
        Sinhvien sv = new Sinhvien("9", "Tran Thi G", "", "Information Technology", "SV009");
        qlsv.themSinhVien(sv);
        assertEquals(1, qlsv.getDanhSachSinhVien().size());
    }

    @Test
    public void test10() {
        Sinhvien sv = new Sinhvien("10", "Nguyen Van H", "IT10", "Information Technology", "");
        qlsv.themSinhVien(sv);
        assertEquals(1, qlsv.getDanhSachSinhVien().size());
    }

}