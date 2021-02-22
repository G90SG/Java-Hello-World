// Creating a new Class Main
public class Main {

  public static void main(String[] args){
    System.out.println("Hello, World");
// Primitive types of storing data in Java 
// Creating integer / character / long and double variables and storing data within them
    int a = 5;
    char b = 'i';
    long c = 400;
    double d = 3.2;
// Non-primitive types e.g. a string 
    String name = "susan";
// Using 'System.out.println' to print the parenthesis at the end hold the daya to be printed. Whether this is a 'string' as above with 'hello world' or by entering the 'name' variable followed by.toUpperCase() method to  convert the data within the name variable to uppercase 
    System.out.println(name.toUpperCase());
// Calling the addExclamation method
    addExclamationPoint("Gemma Loves Pizza");
  }
// Creating a new method to be used on an object, this new method is to add an ! to the string presented in the parenthesis when the method is called.  
    public static void addExclamation(String s){
    System.out.println(s + "!");


  }
}
