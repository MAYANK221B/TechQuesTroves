/**
 * A final class is used so that no subclass can extend it, if any class try to extend it, it gives a compile time error
 */
public final class FinalImplementations {

    //A final variable ensures it value cant be changed once it is initialised
    private final String username;
    private final String password;

    public FinalImplementations(String username, String password){
        this.username = username;
        this.password = password;
    }

    //A final Method ensures it cannot be overridden by its subclass(in class if the parent class is not final)
    // to alter its functionality
    public final String getPassword(){
        return password;
    }

    public final String getUsername(){
        return username;
    }

}
