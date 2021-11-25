package pt.uma.tpsi;

enum Gender{
    MALE,FEMALE;
}

public class Student implements Comparable<Student>{
    private String name;
    private int number;
    private int age;
    private Gender gender;
    private Address address;

    public Student(){
        this.name = "";
        this.number = 0;
        this.age = 0;
        this.gender = null;
        this.address = new Address();
    }

    public Student(String name, int number, int age, Gender gender, Address address){
        this.name = name;
        this.number = number;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", age=" + age +
                ", gender=" + gender +
                ", address=" + address +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.number - o.number;
    }

    public int getNumber() {
        return this.number;
    }
}
