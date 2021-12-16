package Minitest.ngay_16_12.modul;

public class Person {
    private String name;
    private int age;

    public static int id = 1;
    private int idPerson;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        idPerson = id;
        id++;
    }

    public int getIdPerson() {
        return idPerson;
    }

    public void setId(int idPerson) {
        this.idPerson = idPerson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "ID : " + getIdPerson() + " - Person {" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
