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

    public String greet(String[] names) {
        if (names.length == 2) {
            return String.format("%s, %s and %s", GREETING, names[0], names[1]);
        }
        return "Didn't get so many names as hoped for";
    }
}
