package lab1;

import org.junit.jupiter.api.Test;
import static com.google.common.truth.Truth.assertThat;
import static com.google.common.truth.Truth.assertWithMessage;

public class GreetingTest {

    public static String NAMELESS = "my friend";

    @Test
    public void should_return_name_in_greeting(){
        // Arrenge
        String name = "Sir Horse McSoftly";
        Greeting greeting = new Greeting();
        String expectedResult = String.format("Hello, %s", name);

        // Act
        String actualResult = greeting.greet(name);

        // Assert
        assertThat(actualResult).isEqualTo(expectedResult);

    }


    @Test
    public void should_return_stand_in_when_empty_string_is_given(){
        // Arrange
        String name = "";
        Greeting greeting = new Greeting();
        String expectedResult = String.format("Hello, %s", NAMELESS);

        // Act
        String actualResult = greeting.greet(name);

        // Assert
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    public void should_return_stand_in_when_name_is_null(){
        // Arrange
        String name = null;
        Greeting greeting = new Greeting();
        String expectedResult = String.format("Hello, %s", NAMELESS);

        // Act
        String actualResult = greeting.greet(name);

        // Assert
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    public void should_return_stand_in_when_name_is_whitespaces(){
        // Arrange
        String name = "            ";
        Greeting greeting = new Greeting();
        String expectedResult = String.format("Hello, %s", NAMELESS);

        // Act
        String actualResult = greeting.greet(name);

        // Assert
        assertThat(actualResult).isEqualTo(expectedResult);
    }
}