package com.company;

import java.io.FileNotFoundException;
import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger log = LoggerFactory.getLogger(Tasks.class);

    public Main() {
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("введите 1 для режима работы ввода параметров задач с клавиатуры или 2 для ввода параметров с файла");
        Scanner scanner = new Scanner(System.in);
        int workingMode = scanner.nextInt();
        if (workingMode != 1 && workingMode != 2) {
            System.out.println("Нет такого режима работы программы");
        } else {
            Tasks tasks = new Tasks();
            tasks.task1(workingMode);
            log.debug("1 задание выполнено");
            tasks.task2(workingMode);
            log.debug("2 задание выполнено");
            tasks.task3(workingMode);
            log.debug("3 задание выполнено");
            tasks.task4(workingMode);
            log.debug("4 задание выполнено");
            tasks.task5(workingMode);
            log.debug("5 задание выполнено");
            tasks.task6(workingMode);
            log.debug("6 задание выполнено");
            tasks.task7(workingMode);
            log.debug("7 задание выполнено");
            tasks.task8(workingMode);
            log.debug("8 задание выполнено");
        }

    }
}