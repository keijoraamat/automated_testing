package lab1;

import org.junit.jupiter.api.Test;
import static com.google.common.truth.Truth.assertThat;
import static com.google.common.truth.Truth.assertWithMessage;

public class GreetingTest {

    @Test
    public void should_return_name_in_greeting(){
        // Arrenge
        String name = "Sir Horse McSoftly";
        Greeting greeting = new Greeting();
        String expectedResult = String.format("Hello, %s", name);

        // Act
        String actualResult = greeting.greet(name);

        // Assert
        assertThat(expectedResult).isEqualTo(actualResult);

    }
}