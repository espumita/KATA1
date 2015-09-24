package prac1is2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Prac1Is2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola");
        // Date f = new Date(64,7,3);
        Calendar f1;
        f1 = GregorianCalendar.getInstance();
        f1.set(1964, 7, 3);
        Person p1 = new Person("Enrique", "Ramon", f1);
        System.out.println(p1.getFullName());
        System.out.println(p1.getBirth().getTime());
        System.out.println(p1.getAge());
        System.out.println("....");
        System.out.println("");
        System.out.println("Adios");
    }
}
