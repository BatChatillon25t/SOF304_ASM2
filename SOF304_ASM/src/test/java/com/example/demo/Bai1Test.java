package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bai1Test {
    Bai1 calculator = new Bai1();

    //Tong
    @Test
    public void tong1() {
        assertEquals(3, calculator.tong(1.0, 2.0));
    }

    @Test
    public void tong2() {
        assertEquals(-7, calculator.tong(-3.0, -4.0));
    }

    @Test
    public void tong3() {
        assertEquals(3, calculator.tong(5.0, -2.0));
    }

    @Test
    public void tong4() {
        assertEquals(-3, calculator.tong(-7.0, 4.0));
    }

    @Test
    public void tong5() {
        assertEquals(0, calculator.tong(0.0, 0.0));
    }

    @Test
    public void tong6() {
        assertEquals(8, calculator.tong(8.0, 0.0));
    }

    @Test
    public void tong7() {
        assertEquals(-6, calculator.tong(0.0, -6.0));
    }

    @Test
    public void tong8() {
        assertEquals(2147485, calculator.tong(2147483.0, 2.0));
    }

    @Test
    public void tong9() {
        assertEquals(-2147484, calculator.tong(-2147483.0, -1.0));
    }

    @Test
    public void tong10() {
        assertThrows(IllegalArgumentException.class, () -> calculator.tong(3.5, -2.5));
    }


    //Tich
    @Test
    public void tich1() {
        assertEquals(6, calculator.tich(2.0, 3.0));
    }

    @Test
    public void tich2() {
        assertEquals(-12, calculator.tich(-3.0, 4.0));
    }

    @Test
    public void tich3() {
        assertEquals(-10, calculator.tich(5.0, -2.0));
    }

    @Test
    public void tich4() {
        assertEquals(-28, calculator.tich(-7.0, 4.0));
    }

    @Test
    public void tich5() {
        assertEquals(0, calculator.tich(0.0, 0.0));
    }

    @Test
    public void tich6() {
        assertEquals(0, calculator.tich(8.0, 0.0));
    }

    @Test
    public void tich7() {
        assertEquals(0, calculator.tich(0.0, -6.0));
    }

    @Test
    public void tich8() {
        assertEquals(429496728, calculator.tich(214748364, 2.0));
    }

    @Test
    public void tich9() {
        assertEquals(214748364, calculator.tich(-214748364, -1.0));
    }

    @Test
    public void tich10() {
        assertThrows(IllegalArgumentException.class, () -> calculator.tich(3.5, -2.5));
    }

    //Hieu
    @Test
    void testHieuCase1() {

        assertEquals(-1, calculator.hieu(2.0, 3.0));
    }

    @Test
    void testHieuCase2() {

        assertEquals(-7, calculator.hieu(-3.0, 4.0));
    }

    @Test
    void testHieuCase3() {

        assertEquals(7, calculator.hieu(5.0, -2.0));
    }

    @Test
    void testHieuCase4() {

        assertEquals(-11, calculator.hieu(-7.0, 4.0));
    }

    @Test
    void testHieuCase5() {

        assertEquals(0, calculator.hieu(0.0, 0.0));
    }

    @Test
    void testHieuCase6() {

        assertEquals(8, calculator.hieu(8.0, 0.0));
    }

    @Test
    void testHieuCase7() {

        assertEquals(6, calculator.hieu(0.0, -6.0));
    }

    @Test
    void testHieuCase8() {

        assertEquals(214748362, calculator.hieu(214748364, 2.0));
    }

    @Test
    void testHieuCase9() {

        assertEquals(-214748363, calculator.hieu(-214748364, -1.0));
    }

    @Test
    void testHieuCase10() {

        assertThrows(IllegalArgumentException.class, () -> calculator.hieu(3.5, -2.5));
    }
}


