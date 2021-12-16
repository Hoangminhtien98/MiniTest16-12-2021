package Minitest.ngay_16_12.manager;

import Minitest.ngay_16_12.modul.ComparatorManager;
import Minitest.ngay_16_12.modul.Person;
import Minitest.ngay_16_12.modul.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ManagerPerson implements Manager {
    ArrayList<Person> personList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public ManagerPerson() {
    }

    @Override
    public void display() {
        for (Person person : personList) {
            System.out.println(person);
        }
    }

    public Person create() {
        System.out.println("Person or Student");
        System.out.println("1. Person");
        System.out.println("2. Student");
        int choice = scanner.nextInt();
        String name;
        int age;
        double averagePoint;
        Person personSample = null;
        scanner.nextLine();
        switch (choice) {
            case 1:
                System.out.print("Person name: ");
                name = scanner.nextLine();
                System.out.print("Person age: ");
                age = scanner.nextInt();
                personSample = new Person(name, age);
                break;
            case 2:
                System.out.print("Student name: ");
                name = scanner.nextLine();
                System.out.print("Student age: ");
                age = scanner.nextInt();
                System.out.print("Average Score: ");
                averagePoint = scanner.nextDouble();
                personSample = new Student(name, age, averagePoint);
                break;
        }
        return personSample;
    }

    @Override
    public void add() {
        personList.add(create());
    }

    @Override
    public void findPerson(int id) {
        boolean check = false;
        for (Person person : personList) {
            if (person.getIdPerson() == id) {
                System.out.println(person);
                check = true;
            }
        }
        if (!check) {
            System.out.println("Student not on this list");
        }
    }

    @Override
    public void deletePerson(int id) {
        boolean check = false;
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getIdPerson() == id) {
                personList.remove(i);
                check = true;
            }
        }
        if (!check) {
            System.out.println("Student not on this list");
        }
        display();
    }

    @Override
    public void editPersonByID(int id) {
        boolean check = false;
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getIdPerson() == id) {
                personList.set(i, create());
                personList.get(i).setId(id);
                check = true;
                Person.id--;
                break;
            }
        }
        if (!check) {
            System.out.println("Student not on this list");
        }
        display(); // Hoặc không cần tùy
    }

//    @Override
//    public void arrangeListByAverageScore() {
//        Human[] newHumanList = new Human[humanList.size()];
//        for (int i = 0; i < humanList.size(); i++) {
//            newHumanList[i] = humanList.get(i);
//        }
//        Comparator<Human> comparator = new ComparatorManage();
//        Arrays.sort(newHumanList,comparator);
//
//        for (Human human : newHumanList) {
//            System.out.println(human);
//        }
//    }

    @Override
    public void arrangeListByAveragePoint() {
        Person[] newHumanList = new Person[personList.size()];
        for (int i = 0; i < personList.size(); i++) {
            newHumanList[i] = personList.get(i);
        }
        Comparator<Person> comparator = new ComparatorManager();
        Arrays.sort(newHumanList,comparator);

        for (int i = 0; i < newHumanList.length; i++) {
            personList.set(i,newHumanList[i]);
            System.out.println(newHumanList[i]);
        }
    }

    @Override
    public double sumOfPoint() {
        double sum = 0;
        for (Person person : personList) {
            if (person instanceof Student) {
                sum += ((Student) person).getAveragePoint();
            }
        }
        return sum;
    }

    public void display2(){

    }

}
