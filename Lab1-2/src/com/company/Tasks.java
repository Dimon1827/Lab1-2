package com.company;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static java.lang.Math.sqrt;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class Tasks {
    private static final Logger log= LoggerFactory.getLogger(Tasks.class);
    public void task1(int workingMode) throws FileNotFoundException {
        log.info("Задание 1");
        double x;
        double y;
        double result;
        try{
            if (workingMode == 1) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Введите x ");
                x = scanner.nextInt();
                System.out.println("Введите y ");
                y = scanner.nextInt();

            }
            else {
                String path = "C:\\Users\\adrog\\OneDrive\\Рабочий стол\\Lab1-20220521T125944Z-001\\Lab1-2\\src\\1zadan.txt";
                Scanner scanner = new Scanner(new File(path));
                x = scanner.nextInt();
                System.out.println("Ввод x из файла, x=" + x);
                y = scanner.nextInt();
                System.out.println("Ввод y из файла, y=" + y);

                scanner.close();
            }
            result=((Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y)))*Math.tan(x*y);
            System.out.println("Результат равен "+ result);
            log.warn("1 задача работает");}

        catch (Exception ex){
            System.out.println("К сожалению указанный файл не был найден, пожалуйста введите данные в ручную");
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите x ");
            x = scanner.nextInt();
            System.out.println("Введите y ");
            y = scanner.nextInt();
            result=((Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y)))*Math.tan(x*y);
            System.out.println("Результат равен "+ result);
        }}
    public void task2(int workingMode) throws FileNotFoundException {
        System.out.println("Задача №2");
        Scanner sc = new Scanner(System.in);
        double rad;
        double ar;
        double circum;
        try{
            if (workingMode == 1) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Радиус = ");
                rad = scanner.nextDouble();
            }
            else {
                String path = "C:\\Users\\adrog\\OneDrive\\Рабочий стол\\Lab1-20220521T125944Z-001\\Lab1-2\\src\\zadan.txt";
                Scanner scanner = new Scanner(new File(path));
                rad = scanner.nextInt();
                System.out.println("Ввод rad из файла, rad=" + rad);
                scanner.close();
            }
            ar = Math.PI * (rad * rad);
            System.out.println("Площадь круга = " + ar);
            circum= Math.PI * 2*rad;
            System.out.println("Длины окружности = " + circum) ;
            log.warn("2 задача работает");}
        catch (Exception ex){

            log.error("К сожалению указанный файл не был найден, пожалуйста введите данные в ручную");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Радиус = ");
            rad = sc.nextDouble();
            ar = Math.PI * (rad * rad);
            System.out.println("Площадь круга = " + ar);
            circum= Math.PI * 2*rad;
            System.out.println("Длины окружности = " + circum) ;
        }
    }
    public void task3(int workingMode) throws FileNotFoundException {
        System.out.println("Задание 3");
        int u1;
        int u2;
        double b;
        double c;
        try{
            if (workingMode == 1) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("1 угол треугольника (в процентах) = ");
                u1 = scanner.nextInt();
                System.out.print("2 угол треугольника (в процентах) = ");
                u2 = scanner.nextInt();

            }
            else {
                String path = "C:\\Users\\adrog\\OneDrive\\Рабочий стол\\Lab1-20220521T125944Z-001\\Lab1-2\\src\\3zadan.txt";
                Scanner scanner = new Scanner(new File(path));
                u1 = scanner.nextInt();
                System.out.println("Ввод 1 угла из файла, a=" + u1);
                u2 = scanner.nextInt();
                System.out.println("Ввод 2 угла из файла, b=" + u2);
                scanner.close();
            }
            if (u1+u2 >=180)
            {
                System.out.print("Такого треугольника не существует");
            }
            else if (u1==90 || u2==90 || u1+u2==90 )
            { System.out.print("Это прямоугольный треугольник"); }
            else
            { System.out.print ("Это прямоугольник");}}

        catch (Exception ex){
            System.out.println("К сожалению указанный файл не был найден, пожалуйста введите данные в ручную");
            Scanner scanner = new Scanner(System.in);
            System.out.print("1 угол треугольника (в процентах) = ");
            u1 = scanner.nextInt();
            System.out.print("2 угол треугольника (в процентах) = ");
            u2 = scanner.nextInt();
            if (u1+u2 >=180)
            {
                System.out.print("Такого треугольника не существует");
            }
            else if (u1==90 || u2==90 || u1+u2==90 )
            { System.out.print("Это прямоугольный треугольник"); }
            else
            { System.out.print ("Это прямоугольник");}}
    }
    public void task4(int workingMode) throws FileNotFoundException {
        System.out.println("Задание 4");
        double a;
        double b;
        double c;
        double p,s;
        try{
            if (workingMode == 1) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите 1 сторону треугольника =  ");
                a = scanner.nextInt();
                System.out.println("Введите 2 сторону треугольника =  ");
                b = scanner.nextInt();
                System.out.println("Введите 3 сторону треугольника =  ");
                c = scanner.nextInt();
            }
            else {
                String path = "C:\\Users\\adrog\\OneDrive\\Рабочий стол\\Lab1-20220521T125944Z-001\\Lab1-2\\src\\4zadan.txt";
                Scanner scanner = new Scanner(new File(path));
                a = scanner.nextInt();
                System.out.println("Ввод a из файла, a=" + a);
                b = scanner.nextInt();
                System.out.println("Ввод b из файла, b=" + b);
                c = scanner.nextInt();
                System.out.println("Ввод c из файла, c=" + c);
                scanner.close();
            }
            if (a < b + c && b < a + c && c < a + b) {
                p = (a + b + c) / 2;
                s = sqrt(p * (p - a) * (p - b) * (p - c));
                System.out.print("Площадь треугольника =" + s);
            } else {
                System.out.print("Такого треугольника не существует");
            }

        }
        catch (Exception ex){
            System.out.println("К сожалению указанный файл не был найден, пожалуйста введите данные в ручную");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите a ");
            a = scanner.nextInt();
            System.out.println("Введите b ");
            b = scanner.nextInt();
            System.out.println("Введите c ");
            c = scanner.nextInt();
            if (a < b + c && b < a + c && c < a + b) {
                p = (a + b + c) / 2;
                s = sqrt(p * (p - a) * (p - b) * (p - c));
                System.out.print("Площадь треугольника =" + s);
            } else {
                System.out.print("Такого треугольника не существует");
            }}
    }
    public void task5(int workingMode) throws FileNotFoundException {
        System.out.println("Задание 5");
        int month;
        int year;
        try{
            if (workingMode == 1) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите месяц ");
                month = scanner.nextInt();
            }
            else {
                String path = "C:\\Users\\adrog\\OneDrive\\Рабочий стол\\Lab1-20220521T125944Z-001\\Lab1-2\\src\\5zadan.txt";
                Scanner scanner = new Scanner(new File(path));
                month = scanner.nextInt();
                System.out.println("Ввод месяц из файла =" + month);
                scanner.close();
            }
            switch (month)
            {
                case 1: System.out.println("В этом месяце 31 день"); break;
                case 3: System.out.println("В этом месяце 31 день"); break;
                case 5: System.out.println("В этом месяце 31 день"); break;
                case 7: System.out.println("В этом месяце 31 день"); break;
                case 8: System.out.println("В этом месяце 31 день"); break;
                case 10: System.out.println("В этом месяце 31 день"); break;
                case 12:System.out.println("В этом месяце 31 день"); break;
                case 4: System.out.println("В этом месяце 30 дней"); break;
                case 6: System.out.println("В этом месяце 30 дней"); break;
                case 9: System.out.println("В этом месяце 30 дней"); break;
                case 11:System.out.println("В этом месяце 30 дней"); break;
                case 2: {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Введите год:");
                    year = scanner.nextInt();
                    if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                        System.out.println("В этом месяце 29 дней");
                    } else {
                        System.out.println("В этом месяце 28 дней");
                    }
                    break; }
            }}
        catch (Exception ex){
            System.out.println("К сожалению указанный файл не был найден, пожалуйста введите данные в ручную");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите месяц ");
            month = scanner.nextInt();
            switch (month)
            {
                case 1: System.out.println("В этом месяце 31 день"); break;
                case 3: System.out.println("В этом месяце 31 день"); break;
                case 5: System.out.println("В этом месяце 31 день"); break;
                case 7: System.out.println("В этом месяце 31 день"); break;
                case 8: System.out.println("В этом месяце 31 день"); break;
                case 10: System.out.println("В этом месяце 31 день"); break;
                case 12:System.out.println("В этом месяце 31 день"); break;
                case 4: System.out.println("В этом месяце 30 дней"); break;
                case 6: System.out.println("В этом месяце 30 дней"); break;
                case 9: System.out.println("В этом месяце 30 дней"); break;
                case 11:System.out.println("В этом месяце 30 дней"); break;
                case 2: {
                    Scanner scan = new Scanner(System.in);
                    System.out.println("Введите год:");
                    year = scan.nextInt();
                    if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                        System.out.println("В этом месяце 29 дней");
                    } else {
                        System.out.println("В этом месяце 28 дней");
                    }
                    break; }
            }
        }
    }
    public void task6(int workingMode) throws FileNotFoundException {
        System.out.println("Задание 6");
        int n;
        int i;
        int k;
        try{
            if (workingMode == 1) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите a ");
                n = scanner.nextInt();
            }
            else {
                String path = "C:\\Users\\adrog\\OneDrive\\Рабочий стол\\Lab1-20220521T125944Z-001\\Lab1-2\\src\\6zadan.txt";
                Scanner scanner = new Scanner(new File(path));
                n = scanner.nextInt();
                System.out.println("Ввод a из файла, a=" + n);
                scanner.close();
            }
            for ( i=2; i<n; i++){
                int t=0;
                for (k=2; k<n; k++) {
                    if (i % k == 0) t = t + 1;
                    if (t == 1) System.out.println(i);
                }}}
        catch (Exception ex){
            System.out.println("К сожалению указанный файл не был найден, пожалуйста введите данные в ручную");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите a ");
            n = scanner.nextInt();
            for ( i=2; i<n; i++){
                int t=0;
                for (k=2; k<n; k++) {
                    if (i % k == 0) t = t + 1;
                    if (t == 1) System.out.println(i);
                }}}
    }
    public void task7(int workingMode) throws FileNotFoundException {
        System.out.println("Задание 7");
        int n;
        int sum =0;
        try{
            if (workingMode == 1) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите n ");
                n = scanner.nextInt();
            }
            else {
                String path = "C:\\Users\\adrog\\OneDrive\\Рабочий стол\\Lab1-20220521T125944Z-001\\Lab1-2\\src\\7zadan.txt";
                Scanner scanner = new Scanner(new File(path));
                n = scanner.nextInt();
                System.out.println("Ввод n из файла, n=" + n);
                scanner.close();
            }
            for (int i = (int) Math.pow(10, n - 1); i < (int) Math.pow(10, n); i++) {
                sum += i;
            }
            System.out.println("Сумма всех n-значных чисел " + sum);
        }
        catch (Exception ex){
            System.out.println("К сожалению указанный файл не был найден, пожалуйста введите данные в ручную");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите a ");
            n = scanner.nextInt();
            for (int i = (int) Math.pow(10, n - 1); i < (int) Math.pow(10, n); i++) {
                sum += i;
            }
            System.out.println("Сумма всех n-значных чисел " + sum);
        }

    }

    public void task8(int workingMode) throws FileNotFoundException {
        System.out.println("Задание 8");
        int n;
        int a;
        int i=1;
        float res=1;
        try{
            if (workingMode == 1) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите n ");
                n = scanner.nextInt();
                System.out.println("Введите a ");
                a = scanner.nextInt();

            }
            else {
                String path = "C:\\Users\\adrog\\OneDrive\\Рабочий стол\\Lab1-20220521T125944Z-001\\Lab1-2\\src\\8zadan.txt";
                Scanner scanner = new Scanner(new File(path));
                n = scanner.nextInt();
                System.out.println("Ввод a из файла, n=" + n);
                a = scanner.nextInt();
                System.out.println("Ввод a из файла, a=" + a);
                scanner.close();
            }

            while (i<=n) {
                res *= (float) (a + n -1);
                i++;
            }
            System.out.println("результат " + res );}

        catch (Exception ex) {
            System.out.println("К сожалению указанный файл не был найден, пожалуйста введите данные в ручную");
            Scanner scanner = new Scanner(System.in);

        }}}