package pt.uma.tpsi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        Address ad1 = new Address("Rua da Palha",13,"8423-930","Funchal","Portugal");
        Address ad2 = new Address("Caminho do poço do Rodrigo",22,"9050-196","Funchal","Portugal");
        Address ad3 = new Address("Caminho do Funchal",16,"9000-050","Funchal","Portugal");

        Student s1 = new Student("Gabriel Sousa",2046820,19,Gender.MALE,ad2);
        Student s2 = new Student("Raul Rodrigues",2046821,23,Gender.MALE,ad3);
        Student s3 = new Student("Mariana Silva",2046832,18,Gender.FEMALE,new Address("Caminho da Ribeira brava",14,"9100-200","Ribeira Brava","Portugal"));
        Student s4 = new Student("Manel Gouveia",2046870,24,Gender.MALE,ad1);

        /**
         * ARRAYLIST FOR STUDENTS
         */

        ArrayList<Student> students = new ArrayList<Student>();

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

        for (Student s: students) {
            System.out.println(s.toString());
            System.out.println();
        }

        Collections.sort(students);

        System.out.println("ORDENADO!");

        for (Student s: students) {
            System.out.println(s.toString());
            System.out.println();
        }

        /**
         * ARRAYLIST FOR ADDRESSES
         */

        ArrayList<Address> addresses = new ArrayList<Address>();
        addresses.add(ad1);
        addresses.add(ad2);
        addresses.add(ad3);

        for (Address ad: addresses) {
            System.out.println(ad.toString());
            System.out.println();
        }

        Collections.sort(addresses);

        System.out.println("ORDENADO!");

        for (Address ad: addresses) {
            System.out.println(ad.toString());
            System.out.println();
        }

        Collections.sort(students, new StudentComparator());

        System.out.println("ORDENADO POR NOME!");
        for (Student s: students) {
            System.out.println(s.toString());
            System.out.println();
        }

        Iterator<Student> iterator = students.iterator();

        while(iterator.hasNext()){
            Student s = iterator.next();
            if(s.getNumber() == 2046820){
                iterator.remove();
            }
        }
    }
}
