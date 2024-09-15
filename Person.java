// A public class is accessible from anywhere in the program,
// regardless of the package it belongs to

// Get and setter 
// public class **Person** -> change Person to whatever your java file's name
public class Person{
    // Set all the private variables up here
    private String name;
    private int age;

    // To get the private name value and return it back
    public String getName() { return name; }

    // Set name to private string name
    public void setName(String name) { this.name = name; }
    
    // To get the private age value and return it back
    public int getAge() { return age; }

    // Set age to private integer age
    public void setAge(int age) { this.age = age; }
}