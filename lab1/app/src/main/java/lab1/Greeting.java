package lab1;

import org.apache.commons.lang3.StringUtils;

public class Greeting {

    public static String NAMELESS = "my friend";
    
    public String greet(String name){

        if (name == null) { 
            return String.format("Hello, %s", NAMELESS);
        }

        else if (name.trim().length() == 0) {
            return String.format("Hello, %s", NAMELESS);
        }

        else if (StringUtils.isAllUpperCase(name)) {
            return String.format("HELLO, %s", name);
        }

        return String.format("Hello, %s", name);
    }
}
