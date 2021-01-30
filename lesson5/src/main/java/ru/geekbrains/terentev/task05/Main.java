package ru.geekbrains.terentev.task05;

import ru.geekbrains.terentev.task03.Task03Employee;

public class Main {

    public static void main(String[] args) {
        Task03Employee[] employees = new Task03Employee[5];

        employees[0] = new Task03Employee("Ivanov Ivan",
                "Senior Software Engineer",
                "ivanovi@company.com",
                "1234567890",
                30000,
                22);

        employees[1] = new Task03Employee("Petrov Petr",
                "Junior Software Engineer",
                "petrovp@company.com",
                "1234567891",
                60000,
                23);

        employees[2] = new Task03Employee("Sidorov Artem",
                "Lead Software Engineer",
                "sidorova@company.com",
                "1234567892",
                120000,
                41);

        employees[3] = new Task03Employee("Kuznecov Ilya",
                "Team Manager",
                "kuznecovi@company.com",
                "1234567893",
                200000,
                45);

        employees[4] = new Task03Employee("Kireeva Yuliya",
                "Senior Quality Assurance Engineer",
                "kireevay@company.com",
                "1234567894",
                80000,
                24);

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].age > 40) {
                Task03Employee.getInfo(employees[i]);
            }
        }
    }
}
