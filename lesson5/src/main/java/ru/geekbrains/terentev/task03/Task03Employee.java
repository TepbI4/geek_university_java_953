package ru.geekbrains.terentev.task03;

import ru.geekbrains.terentev.task02.Task02Employee;

public class Task03Employee extends Task02Employee {

    public Task03Employee(String fio, String position, String email, String phone, Integer salary, Integer age) {
        super(fio, position, email, phone, salary, age);
    }

    public static void getInfo(Task03Employee employee) {
        System.out.println(employee.toString());
    }

    @Override
    public String toString() {
        return  "Task03Employee{" +
                "fio='" + fio + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
