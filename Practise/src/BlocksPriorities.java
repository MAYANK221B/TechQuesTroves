class A{
    A(){
        System.out.println("I am Constructor of A");
    }

    {
        System.out.println("Instance Initializer Block of A ");
    }

    static
    {
        System.out.println("Static Block of A");
    }
}

class B extends A{
    B(){
        System.out.println("I am Constructor of B");
    }

    {
        System.out.println("Instance Initializer Block of B");
    }

    static
    {
        System.out.println("Static Block of B");
    }
}

//priority: static > instance initializer > constructor

public class BlocksPriorities {
    public static void main(String[] args){
        B b = new B();
    }
}
