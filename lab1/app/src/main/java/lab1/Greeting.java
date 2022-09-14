package lab1;

import org.apache.commons.lang3.StringUtils;

public class Greeting {

    public static String NAMELESS = "my friend";
    public static String GREETING = "Hello";
    
    public String greet(String name){

        if (name == null) { 
            return String.format("%s, %s", GREETING, NAMELESS);
        }

        else if (name.trim().length() == 0) {
            return String.format("%s, %s", GREETING, NAMELESS);
        }

        else if (StringUtils.isAllUpperCase(name)) {
            return String.format("%s, %s", GREETING.toUpperCase(), name);
        }

        return String.format("%s, %s", GREETING, name);
    }
}
