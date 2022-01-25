/* - JAVA SYNTAX -

In Java, every application begins with a class name, and that class must match the filename (first letter should be
uppercase). Every line of code that runs in Java must be inside a class; */

import java.time.format.DateTimeFormatter;
import java.util.*;
import java.time.*;

public class Main {
    private String pName; // private = restricted access, see encapsulation below.
    int attributeX; //Create a class attribute. See classes and objects down below.

    public Main() // Create a class constructor for the Main class
    {
        attributeX = 5; // Set the initial value for the class attribute x
        //Note that the constructor name must match the class name, and it cannot have a return type (like void).
        //Also note that the constructor is called when the object is created.
        //All classes have constructors by default: if you do not create a class constructor yourself, Java creates
        // one for you. However, then you are not able to set initial values for object attributes.
    }

    // Everything in Java is associated with classes and objects, along with its attributes and methods.
    // The main() method is required, and you will see it in every Java program:
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        System.out.println("Hello World");

        /* Save the code in Notepad as "Main.java". Open Command Prompt, navigate to the directory where you
        saved your file, and type "javac Main.java". This will compile your code. If there are no errors in the code,
        the command prompt will take you to the next line. Now, type "java Main" to run the file. */

        /* - VARIABLES -
        byte, short, int, long, float, double, boolean and char are called primitive data types.
        variables are attributes(a.k.a. fields) within the class.*/

        String name = "John";
        // All Java variables must be identified with unique names. These unique names are called identifiers.
        String lastName = "Doe";
        String fullName = name + " " + lastName; // John Doe
        String fullName2 = name.concat(lastName); // JohnDoe
        System.out.println("Hello " + fullName);

        final boolean cantChange = true; // can't reassign another value later

        int num = 15;

        int num2;
        num2 = 16;
        num2 = 17;

        final int num3 = 18; //can't reassign new value later.

        int num4 = 19, num5 = 20;
        System.out.println(num4 < num5); // prints true
        System.out.println(num + num2 + num3 + num4 + num5); // prints sum of 15 + 17 + 18 + 19 + 20

        double num6 = 5.77d;
        int num7 = (int) num6;
        // Type casting (Narrowing casting must be done manually by placing the type in parentheses)

        int num8 = 9;
        float num9 = num8; // Type casting (Widening casting is automatic, you don't need parentheses)
        float percentage = 5.66f;

        boolean isTrue = true;

        char character = 'D';

        String sevenLetters = "ABCDEFG";
        System.out.println("length of string is: " + sevenLetters.length());
        sevenLetters = sevenLetters.toLowerCase(); // "abcdefg"
        sevenLetters = sevenLetters.toUpperCase(); // "ABCDEFG"

        String indexFinder = "Please locate where 'locate' occurs.";
        System.out.println(indexFinder.indexOf("locate")); // prints 7


        // Java string methods are here: https://www.w3schools.com/java/java_ref_string.asp

        // - If / Else -

        int num10 = 10;

        if (num10 < 5) {
            System.out.println("smaller than 5");
        } else if (num10 == 5) {
            System.out.println("equal to 5");
        } else {
            System.out.println("bigger than 5");
        }

        String ternaryVersion = (num10 < 20) ? "Smaller than 20" : "Not smaller than 20";
        System.out.println(ternaryVersion);

        // - Switch Cases -

        int digit = 5;

        switch (digit) {
            case 1, 3, 5, 7, 9:
                System.out.println("Odd");
                break;
            case 2, 4, 6, 8:
                System.out.println("Even");
                break;
            default:
                System.out.println("Out of range");
        }

        // - While Loop -

        int counter = 0;
        while (counter < 3) {
            System.out.println("Yes");
            counter++;
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(i + "\n"); // prints 0123456789 and then returns new line.
        }

        String[] cars = {"Volvo", "Mercedes", "Audi"}; // this is an array.

        for (String i : cars) { // this is called "for-each" loop. Iterates over an array.
            System.out.println(i);
        }

        for (int i = 0; i < 10; i++) {
            if (i == 3) {
                continue;
            } else if (i == 6) {
                break;
            }
            System.out.println(i);
        }

        // - Arrays -

        int[] numArray = {10, 20, 30, 40};
        System.out.println(numArray[0]); // prints first index of numArray
        numArray[1] = 25; // change an array element.
        System.out.println("numArray has " + numArray.length + " elements.");

        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}}; // multi-dimensional array.
        System.out.println(myNumbers[1][1]); // prints 6

        for (int i = 0; i < myNumbers.length; i++) {
            for (int j = 0; j < myNumbers[i].length; j++) {
                System.out.println(myNumbers[i][j]);
            }
        }

        // - Methods -

        String johnsAge = doubleVariableMethod("John", 25);
        System.out.println(johnsAge); // prints John is 25

        int totalInt = plusMethod(3, 5);
        double totalDouble = plusMethod(3.2, 3.5); //method overloading. same name, different types.
        System.out.println(totalInt);
        System.out.println(totalDouble);

        int recursiveSum = sum(10); // calls a + sum(a - 1) recursive method
        System.out.println(recursiveSum); //prints 55

        int recursiveSum2 = sum(5, 10);
        System.out.println(recursiveSum2); // prints 45

        // - Classes and Objects -

        Main myObj = new Main();
        myObj.attributeX = 25; // set the value of attributeX to 25
        System.out.println(myObj.attributeX);

        myObj.attributeX = 40; // overriding existing value.


        myMethod(); // static methods can be accessed without creating an object of the class, unlike public methods.

        Main newObj = new Main();
        newObj.myPublicMethod(); //public methods can only be accessed by objects unlike static methods.

        Main myCar = new Main(); // Create a myCar object
        myCar.fullThrottle(); // Call the fullThrottle() method
        myCar.speed(200); // Call the speed() method

        // - Encapsulation -

        Main encapObject = new Main();
        encapObject.setName("John"); // sets private pName value
        System.out.println(encapObject.getName());

        // - Arrays -

        int[][] matrix = new int[4][4];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = i * matrix[i].length + j + 1;
            }
        }

        System.out.println(Arrays.deepToString(matrix));

        System.out.println("--------------------");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("--------------------");

        int[][] arr = new int[3][];
        arr[0] = new int[1];
        arr[1] = new int[2];
        arr[2] = new int[3];
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = j + 1;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < i + 1; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println(sum);

        System.out.println("arr: " + Arrays.deepToString(arr)); //method to print array

        int[] array2 = {3,5,4,2,1,0};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2)); //prints [0, 1, 2, 3, 4, 5]

        int indexOf4 = Arrays.binarySearch(array2, 4);
        System.out.println("index of 4 is: " + indexOf4); //prints index of 4 is: 4

        int[] array3 = Arrays.copyOf(array2, 3);
        System.out.println(Arrays.toString(array3)); //prints [0, 1, 2]

        int[] array4 = Arrays.copyOfRange(array2, 2, 5);
        System.out.println(Arrays.toString(array4)); //prints [2, 3, 4]

        System.out.println(Arrays.equals(array2, array3)); //prints false

        // - For Each -

        int[] list = {1, 2, 3, 4, 5, 6};

        for (int i : list) {
            System.out.println(i);
        }

        System.out.println("--------------");

        int[][] matrix2 = new int[4][4];

        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                matrix2[i][j] = i * matrix2[i].length + j + 1;
            }
        }

        for (int[] row : matrix2) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

        System.out.println("--------------");

        // - ArrayList - (import java.util.ArrayList)

        ArrayList<String> carsArrayList = new ArrayList<String>();

        carsArrayList.add("Volvo"); //add element to array list
        carsArrayList.add("Mercedes-Benz");
        carsArrayList.add("Tesla");

        System.out.println(carsArrayList);

        int arrayListLength = carsArrayList.size();
        System.out.println(arrayListLength); //prints 3, length of the array list.

        carsArrayList.set(2, "Aston Martin"); // change index 2 element from Tesla to Aston Martin.

        System.out.println(carsArrayList.get(2)); //prints third element of array list

        carsArrayList.remove(0); //removes element in first index
        System.out.println(carsArrayList);

        Collections.sort(carsArrayList); //Another useful class in the java.util package is the Collections class,
        // which include the sort() method for sorting lists alphabetically or numerically.

        for (int i = 0; i < carsArrayList.size(); i++) {
            System.out.println(carsArrayList.get(i)); //iterates through the elements of array list
        }

        for (String i : carsArrayList) {
            System.out.println(i); //same iteration by using for-each loop style.
        }

        carsArrayList.clear(); //removes all elements

        //Elements in an ArrayList are actually objects. In the examples above, we created elements (objects) of
        // type "String". Remember that a String in Java is an object (not a primitive type). To use other types,
        // such as int, you must specify an equivalent wrapper class: Integer. For other primitive types, use: Boolean
        // for boolean, Character for char, Double for double, etc.

        System.out.println("--------------");

        // - Hashmap - import java.util.HashMap

        HashMap<String, String> capitalCities = new HashMap<String, String>();

        capitalCities.put("UK", "London"); //add new item
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Turkey", "Ankara");

        System.out.println(capitalCities);

        int howManyCapitals = capitalCities.size(); //hashmap size
        System.out.println(howManyCapitals); // prints 4

        String capitalOfTurkey = capitalCities.get("Turkey"); //access an item
        System.out.println(capitalOfTurkey); // prints "Ankara"

        System.out.print("Keys are ");
        for (String i : capitalCities.keySet()) {
            System.out.print(i + " ");
        } //iterates through the keys.
        System.out.println(); //prints "Keys are Turkey Norway UK Germany"

        System.out.print("Values are ");
        for (String i : capitalCities.values()) {
            System.out.print(i + " ");
        } //iterates through the values.
        System.out.println(); //prints "Values are Ankara Oslo London Berlin"

        capitalCities.remove("Turkey"); //remove an item

        capitalCities.clear(); //clear all items.

        System.out.println("--------------");

        // - String Builder -

        StringBuilder str1 = new StringBuilder();
        str1.append("ABC");
        str1.append('D');
        System.out.println(str1);
        System.out.println(str1.getClass().getSimpleName()); //prints type, StringBuilder

        String str2 = str1.toString();
        System.out.println(str2.getClass().getSimpleName()); // prints type, String
        System.out.println("--------------");

        // - Polymorphism -

        Animal myAnimal = new Animal();
        Animal myPig = new Pig();

        myAnimal.animalSound();
        myPig.animalSound();


        class Dog extends Animal {
            public void animalSound() {
                System.out.println("Dog says woof woof.");
            }
        }

        Animal myDog = new Dog();
        myDog.animalSound();
        System.out.println("--------------");

        // - Inner Class - The purpose of nested classes is to group classes that belong together,
        // which makes your code more readable and maintainable.

        class OuterClass {
            int x = 10;
            class InnerClass {
                int y = 5;
            }
        }

        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();

        System.out.println(myOuter.x + myInner.y); //prints 15
        System.out.println("--------------");

        // - Abstract Class and Methods -  Abstract class: is a restricted class that cannot be used to create
        // objects (to access it, it must be inherited from another class). Abstract method: can only be used in an
        // abstract class, and it does not have a body. The body is provided by the subclass (inherited from).

        abstract class Car {
            abstract void carMake();
            void startEngine() {
                System.out.println("Wrooom Wroom!");
            }
        }

        class Volvo extends Car {
            void carMake() {
                System.out.println("This is a Volvo!");
            }
        }

        Volvo volvo = new Volvo();
        volvo.carMake();
        volvo.startEngine();

        System.out.println("--------------");

        LocalDate dateObject = LocalDate.now();
        System.out.println(dateObject);

        LocalTime timeObject = LocalTime.now();
        System.out.println(timeObject);

        LocalDateTime dateAndTime = LocalDateTime.now();
        System.out.println("Before formatting: " + dateAndTime);

        DateTimeFormatter formatterObject = DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm:ss");
        String formattedDate = dateAndTime.format(formatterObject);
        System.out.println("After formatting: " + formattedDate);

        System.out.println("--------------");

        // - HashSet - (No Duplicate İtems)
        HashSet<String> carsHashSet = new HashSet<String>();
        carsHashSet.add("Volvo");
        carsHashSet.add("Mazda");
        carsHashSet.add("Mazda"); // can't be added, elements must be unique.
        System.out.println(carsHashSet.size()); //prints 2

        String carToCheck = "Volvo";

        if (carsHashSet.contains(carToCheck)) {
            System.out.println(carToCheck + " is in this HashSet.");
        }
        System.out.println("Hashset: " + carsHashSet); // prints [Volvo, Mazda]

        for (String i : carsHashSet) {
            System.out.println(i);
        }

        carsHashSet.remove("Mazda");
        System.out.println(carsHashSet); // prints [Volvo]

        carsHashSet.clear(); // removes everthing in hashset
        System.out.println(carsHashSet); // prints []

        System.out.println("--------------");

        // - Java Iterator -

        ArrayList numbersArrayList = new ArrayList();
        numbersArrayList.add(5);
        numbersArrayList.add(11);
        numbersArrayList.add(-1);
        numbersArrayList.add(17);

        System.out.println("numberArrayList: " + numbersArrayList);

        Iterator<Integer> iterator = numbersArrayList.iterator();

        while (iterator.hasNext()) {
            Integer i = iterator.next();
             if (i < 10) {
                 iterator.remove();
             }
        }
        
        System.out.println("After iteration: " + numbersArrayList);

        System.out.println("--------------");

        // - Interface -

        interface IAnimal {
            public void makesSound();
            public void sleep();
        }

        class PinkPig implements IAnimal{
            public void makesSound() {
                System.out.println("Hoink Hoink!");
            }
            public void sleep() {
                System.out.println("ZzZz");
            }
        }

        PinkPig pinky = new PinkPig();
        pinky.makesSound();
        pinky.sleep();

        long endTime = System.nanoTime();
        System.out.println("Total execution time is " + ((endTime - startTime)/1000000) + " ms.");

    } // ***** outside of main method *****



    static class Animal {
        public void animalSound() {
            System.out.println("The animal makes a sound.");
        }
    }
    static class Pig extends Animal {
        public void animalSound() {
            System.out.println("The pig says wee wee");
        }
    }

    // In the example below, we created a static method, which means that it can be accessed without
    // creating an object of the class, unlike public methods which can only be accessed by objects:

    static void myMethod()
    // static means that the method belongs to the Main class and not an object of the Main class.
    {
        System.out.println("Static methods can be accessed without creating an object of the class, unlike public");
    }

    public void myPublicMethod() {
        System.out.println("Public methods can only be accessed by objects.");
    }

    // - Method Parameters and Return -

    static String doubleVariableMethod(String fname, int age) {
        return fname + " is " + age;
    }

    // - Method Overloading -

    static int plusMethod(int a, int b) {
        return a + b;
    }

    static double plusMethod(double a, double b) {
        return a + b;
    }

    // - Recursion -

    static int sum(int a) {
        if (a > 0) //halting condition to prevent infinite recursion
        {
            return a + sum(a - 1);
        } else {
            return 0;
        }
    }

    static int sum(int a, int b) {
        if (b > a) //halting condition to prevent infinite recursion
        {
            return b + sum(a, b - 1);
        } else {
            return b;
        }
    }

    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }

    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }

    public String getName() //getter (see encapsulation above)
    {
        return this.pName;
    }

    public void setName(String newName) //setter (see encapsulation above)
    {
        this.pName = newName;
    }

}
