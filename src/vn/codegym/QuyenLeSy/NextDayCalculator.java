package vn.codegym.QuyenLeSy;

import java.util.Scanner;

public class NextDayCalculator {
    public static int nextDay(int day, int month, int year) {
//        Scanner scanner = new Scanner(System.in);
//        int day, month, year;
        boolean check = false;

//
//        System.out.print("Input Day: ");
//        day = scanner.nextInt();
//        System.out.print("Input Month: ");
//        month = scanner.nextInt();
//        System.out.print("Input Year: ");
//        year = scanner.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    check = true;
                } else {
                    check = false;
                }
            } else {
                check = true;
            }
        } else {
            check = false;
        }

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:{
                if(day == 31 && month !=12){
                    day=1;
                    month +=1;
                }else if(day == 31 && month ==12)
                {
                    day=1;
                    month =1;
                    year += 1;
                }
                else day += 1;

                break;

            }
            case 2:
            case 4:
            case 6:
            case 9:
            case 11:{
                if(day == 29 && month == 2 && check){
                    day = 1;
                    month += 1;
                }else if (day == 28 && month == 2 && !check){
                    day = 1;
                    month += 1;
                } else if(day == 30){
                    day = 1;
                    month += 1;
                }
                else day += 1;
            }
        }while (month > 12);


//        System.out.print("Next Day: "+day+"/"+month+"/"+year);

        return day;
    }

    public static int nextMonth(int day, int month, int year) {
//        Scanner scanner = new Scanner(System.in);
//        int day, month, year;
        boolean check = false;

//
//        System.out.print("Input Day: ");
//        day = scanner.nextInt();
//        System.out.print("Input Month: ");
//        month = scanner.nextInt();
//        System.out.print("Input Year: ");
//        year = scanner.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    check = true;
                } else {
                    check = false;
                }
            } else {
                check = true;
            }
        } else {
            check = false;
        }

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:{
                if(day == 31 && month !=12){
                    day=1;
                    month +=1;
                }else if(day == 31 && month ==12)
                {
                    day=1;
                    month =1;
                    year += 1;
                }
                else day += 1;

                break;

            }
            case 2:
            case 4:
            case 6:
            case 9:
            case 11:{
                if(day == 29 && month == 2 && check){
                    day = 1;
                    month += 1;
                }else if (day == 28 && month == 2 && !check){
                    day = 1;
                    month += 1;
                } else if(day == 30){
                    day = 1;
                    month += 1;
                }
                else day += 1;
            }
        }while (month > 12);


//        System.out.print("Next Day: "+day+"/"+month+"/"+year);

        return month;
    }

    public static int nextYear(int day, int month, int year) {
//        Scanner scanner = new Scanner(System.in);
//        int day, month, year;
        boolean check = false;

//
//        System.out.print("Input Day: ");
//        day = scanner.nextInt();
//        System.out.print("Input Month: ");
//        month = scanner.nextInt();
//        System.out.print("Input Year: ");
//        year = scanner.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    check = true;
                } else {
                    check = false;
                }
            } else {
                check = true;
            }
        } else {
            check = false;
        }

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:{
                if(day == 31 && month !=12){
                    day=1;
                    month +=1;
                }else if(day == 31 && month ==12)
                {
                    day=1;
                    month =1;
                    year += 1;
                }
                else day += 1;

                break;

            }
            case 2:
            case 4:
            case 6:
            case 9:
            case 11:{
                if(day == 29 && month == 2 && check){
                    day = 1;
                    month += 1;
                }else if (day == 28 && month == 2 && !check){
                    day = 1;
                    month += 1;
                } else if(day == 30){
                    day = 1;
                    month += 1;
                }
                else day += 1;
            }
        }while (month > 12);


//        System.out.print("Next Day: "+day+"/"+month+"/"+year);

        return year;
    }
}
