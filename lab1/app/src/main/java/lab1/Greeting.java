package lab1;

public class Greeting {

    public static String NAMELESS = "my friend";
    
    public String greet(String name){

        if (name == null) { 
            return String.format("Hello, %s", NAMELESS);
        }

        else if (name.length() == 0) {
            return String.format("Hello, %s", NAMELESS);
        }

        else if (name.trim().length() == 0) {
            return String.format("Hello, %s", NAMELESS);
        }

        return String.format("Hello, %s", name);
    }
}
