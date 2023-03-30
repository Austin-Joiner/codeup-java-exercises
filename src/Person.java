import java.net.SocketOption;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Person {

    private String name;

    public Person() {

    }
    public Person(String name) {

        this.name = name;
    }

    public String getName() {

//TODO: return the person's name
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void sayHello() {
        System.out.printf("Hello, %s!%n", this.name);
    }

    public static void main(String[] args) {

        Person nameReturn = new Person("Austin");
        System.out.println("My Name is " + nameReturn.getName());
        nameReturn.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));//true same string
//        System.out.println(person1 == person2);//false different IDs


//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);// true person 1 becomes person 2 and shares the same ID

//        Person person1 = new Person("John");
//        Person person2 = person1;//persistent
//        System.out.println(person1.getName());//john
//        System.out.println(person2.getName());//john
//        person2.setName("Jane");
//        System.out.println(person1.getName());//jane
//        System.out.println(person2.getName());//jane




    }
}












