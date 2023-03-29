import java.net.SocketOption;
import java.util.Random;
import java.util.Scanner;

public class Person {

    private String name;
    public String getName() {

//TODO: return the person's name
        return this.name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }


    public Person(String myName) {

        this.name = myName;
    }

    public void sayHello() {
        System.out.printf("Hello, %s!%n", this.name);
    }
    public static void main(String[] args) {
        Person nameReturn = new Person("Austin");
        System.out.println("My Name is " + nameReturn.getName());
        nameReturn.sayHello();

    }
}







//        public void sayHello(){
////TODO: print a message to the console using the person's name









