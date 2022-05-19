package com.ironhack;

public class Main {

    public static void main(String[] args) {


        Course bootcamp1 = new Course("Java", "Jaume", 19);
        Course bootcamp2 = new Course("UX", "Jaume", 19);
        Course bootcamp3 = new Course("UI", "Jaume", 19);
        Course bootcamp4 = new Course("Cyber");

        System.out.println(bootcamp4.getTeacherName());

        System.out.println(bootcamp1.getId());
        System.out.println(bootcamp2.getId());
        System.out.println(bootcamp3.getId());


        Course.getMostPopularCourses();

        for (String course : Course.getMostPopularCourses()) {
            System.out.println(course);

        }

        Coche coche = new Coche("Mercedes", "A2000", true, true);
        Moto moto = new Moto("Yamaha", "200", true, 3);
        
        Vehiculo[] vehiculo = {coche, moto};
        
        for (Vehiculo v : vehiculo) {
            if(v instanceof Coche) {
                System.out.println(((Coche) v).isCristalesTintados());
            }
        }

        System.out.println(coche.toString());
        
 

    }
}
