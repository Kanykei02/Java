package com.company;

public class Person {
    private String surname;
    private String name;
    private String patronymic;

    public Person(String surname, String name, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj instanceof Person)
            return ((Person) obj).getSurname().equals(this.getSurname()) &&
                    ((Person) obj).getName().equals(this.getName()) &&
                    ((Person) obj).getPatronymic().equals(this.getPatronymic());
        return false;
    }


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    @Override
    public String toString(){
        return "Surname: " + getName() + ", name: " + getName() + ", patronymic: " + getPatronymic();
    }
}
