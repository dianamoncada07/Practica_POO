import ar.com.ada.oop.overloading.instantation.Arithmetic;
import ar.com.ada.oop.overloading.instantation.Person;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Person carlos = new Person();
        Person maria = new Person("Maria");
        Person martin = new Person("Martin", "Rodriguez");

        Scanner sc = new Scanner(System.in);
        System.out.println("El nombre es " + carlos.getName() + " " + carlos.getLastName());
        System.out.println("El nombre es " + maria.getName() + " " + maria.getLastName());
        System.out.println("El nombre es " + martin.getName() + " " + martin.getLastName());

        Arithmetic sumas = new Arithmetic();
        sumas.sum(1,2);
        sumas.sum(2.2,8.2);
        Integer nombreDeTuInteger = 3;
        Double  nombreDeTuDouble = 4.5;
        sumas.sum(nombreDeTuInteger, 5);
        sumas.sum(nombreDeTuDouble, 7.5);

        System.out.println("El resultado 1 es: " +sumas.sum(1,2));
        System.out.println("El resultado 2 es: " +sumas.sum(2.2,8.2));
        System.out.println("El resultado 3 es: " +sumas.sum(nombreDeTuInteger,5));
        System.out.println("El resultado 4 es: " +sumas.sum(nombreDeTuDouble,7.5));



    }

}

