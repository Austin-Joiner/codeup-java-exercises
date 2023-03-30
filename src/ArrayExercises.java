import java.util.Arrays;

public class ArrayExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];
        people[0] = new Person("Tom");
        people[1] = new Person("Ben");
        people[2] = new Person("Mathew");

        Person[] newPeople = ArrayExercises.addPerson(people, new Person("John"));
        for (Person p : newPeople) {
            System.out.println(p.getName());
        }
    }

    public static Person[] addPerson(Person[] people, Person personToAdd) {
        Person[] newPeople = Arrays.copyOf(people, people.length + 1);
        newPeople[newPeople.length - 1] = personToAdd;
        return newPeople;
    }
}


