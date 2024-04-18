import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Container<T>{

    void classType( T t){
        System.out.println(t.getClass());
    }
}

class GenericMethod{
    public <E> void printAnonymous(E anonymous){
        System.out.println(anonymous);
    }

    public void unknownList(List<?> unknownList){
        for(Object obj: unknownList)
            System.out.println(obj);
    }
}

public class Generics {

    public static void main(String[] args) {
        Container<String> stringContainer = new Container<>();
        Container<Integer> integerContainer = new Container<>();
        stringContainer.classType("Mavericks");
        integerContainer.classType(89786756);

        GenericMethod genericMethod = new GenericMethod();
        genericMethod.printAnonymous(21436587);
        genericMethod.printAnonymous("Breaking Bad");

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        genericMethod.unknownList(integerList);

        List<String> stringList = new ArrayList<>();
        stringList.add("Batman Begins");
        stringList.add("Dark Knight");
        stringList.add("Dark Knight Rises");
        genericMethod.unknownList(stringList);


    }



}
