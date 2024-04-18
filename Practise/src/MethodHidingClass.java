/**
 * This class illustrates how a static function cant be overridden but can be hidden
 */

class Parent{
    public static void className(){
        System.out.println("Parent Class");
    }
}

class Child extends Parent{
    //if we try to add @Override, it gives compile time error, so we can use same signature to hide the parent method,
    // known as method hiding.
    public static void className(){
        System.out.println("Child Class");
    }
}

public class MethodHidingClass {
    public static void main(String[] args) {
        //both are instance of Child class , but is of parent type and one is of child type
        //although instance is of child , it will print parent message as for static methods binding is done at the time of compiling and runtime polymorphism doesn't work for it.
        Parent parent = new Child();
        Child child = new Child();

        //though technically wrong but just to showcase, technically wrong because static method should be directly call with
        //rather than through a instance of that class.
       parent.className();
       child.className();
    }
}
