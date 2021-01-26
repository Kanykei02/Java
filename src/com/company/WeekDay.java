package com.company;

public enum WeekDay {
    Monday("Понедельник"),
    Tuesday("Вторник"),
    Wednesday("Среда"),
    Thursday("Четверг"),
    Friday("Пятница"),
    Saturday("Суббота"),
    Sunday("Воскресенье");

    private String rusName;

    WeekDay(String rusName) {
        this.rusName = rusName;
    }

    public String getRusName() {
        return rusName;
    }
}
