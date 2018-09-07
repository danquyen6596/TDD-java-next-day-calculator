package vn.codegym.QuyenLeSy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void nextDay1() {
        int day = 1;
        int month = 1;
        int year = 2018;

        int expected_day = 2;
        int expected_month = 1;
        int expected_year = 2018;

        int resultDay = NextDayCalculator.nextDay(day, month, year);
        int resultMonth = NextDayCalculator.nextMonth(day, month, year);
        int resultYear = NextDayCalculator.nextYear(day, month, year);
        assertEquals(resultDay, expected_day);
        assertEquals(resultMonth, expected_month);
        assertEquals(resultYear, expected_year);
    }

    @Test
    void nextDay2() {
        int day = 31;
        int month = 1;
        int year = 2018;

        int expected_day = 1;
        int expected_month = 2;
        int expected_year = 2018;

        int resultDay = NextDayCalculator.nextDay(day, month, year);
        int resultMonth = NextDayCalculator.nextMonth(day, month, year);
        int resultYear = NextDayCalculator.nextYear(day, month, year);
        assertEquals(resultDay, expected_day);
        assertEquals(resultMonth, expected_month);
        assertEquals(resultYear, expected_year);
    }


    @Test
    void nextDay3() {
        int day = 30;
        int month = 4;
        int year = 2018;

        int expected_day = 1;
        int expected_month = 5;
        int expected_year = 2018;

        int resultDay = NextDayCalculator.nextDay(day, month, year);
        int resultMonth = NextDayCalculator.nextMonth(day, month, year);
        int resultYear = NextDayCalculator.nextYear(day, month, year);
        assertEquals(resultDay, expected_day);
        assertEquals(resultMonth, expected_month);
        assertEquals(resultYear, expected_year);
    }


    @Test
    void nextDay4() {
        int day = 28;
        int month = 2;
        int year = 2018;

        int expected_day = 1;
        int expected_month = 3;
        int expected_year = 2018;

        int resultDay = NextDayCalculator.nextDay(day, month, year);
        int resultMonth = NextDayCalculator.nextMonth(day, month, year);
        int resultYear = NextDayCalculator.nextYear(day, month, year);
        assertEquals(resultDay, expected_day);
        assertEquals(resultMonth, expected_month);
        assertEquals(resultYear, expected_year);
    }

    @Test
    void nextDay5() {
        int day = 29;
        int month = 2;
        int year = 2020;

        int expected_day = 1;
        int expected_month = 3;
        int expected_year = 2020;

        int resultDay = NextDayCalculator.nextDay(day, month, year);
        int resultMonth = NextDayCalculator.nextMonth(day, month, year);
        int resultYear = NextDayCalculator.nextYear(day, month, year);
        assertEquals(resultDay, expected_day);
        assertEquals(resultMonth, expected_month);
        assertEquals(resultYear, expected_year);
    }

    @Test
    void nextDay6() {
        int day = 31;
        int month = 12;
        int year = 2018;

        int expected_day = 1;
        int expected_month = 1;
        int expected_year = 2019;

        int resultDay = NextDayCalculator.nextDay(day, month, year);
        int resultMonth = NextDayCalculator.nextMonth(day, month, year);
        int resultYear = NextDayCalculator.nextYear(day, month, year);
        assertEquals(resultDay, expected_day);
        assertEquals(resultMonth, expected_month);
        assertEquals(resultYear, expected_year);
    }
}