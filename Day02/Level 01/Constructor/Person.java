//import scanner object
import java.util.Scanner;

class Person{
    //Attribute
    private String name;
    private int age;

    //parameterized constructors
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //copyt constructor
    public Person(Person person){
        this.name = person.name;
        this.age = person.age;
    }
    //method to display person details
    public void displayDetails(){
        System.out.println("Person name - "+this.name + "\nPerson age - "+ this.age);
    }
}
class PersonMain{
    public static void main(String[] args) {
        //create object of scanner class
        Scanner input = new Scanner(System.in);
        //input person name and age
        System.out.println("enter a person name and age");
        String name = input.nextLine();
        int age = input.nextInt();

        //create object of scanner class
        Person person = new Person(name, age);
        System.out.println("Person details via parameterized constructors");
        person.displayDetails();

        Person person1 = new Person(person);
        System.out.println("Person details via Copy constructors");
        person1.displayDetails();
    }
}