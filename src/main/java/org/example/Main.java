package org.example;
public class Main {
    public static void main(String[] args) {
         Student s1 = new Student();
         s1.id = 10;
        s1.age = 21;
        s1.marks = 90;
        s1.name = "Ashok";

        System.out.println(s1.age);
        System.out.println(s1.id);
        System.out.println(s1.marks);
        System.out.println(s1.name);

        Student s2 = new Student();
        s2.id = 1;
        s2.age = 22;
        s2.marks = 100;
        s2.name = "Srikesh";
        System.out.println(s2.name);
        System.out.println(s1.age);
        System.out.println(s1.id);
        System.out.println(s1.marks);




    }
}

