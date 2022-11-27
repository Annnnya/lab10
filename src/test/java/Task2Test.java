import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import t2.*;

public class Task2Test {
    @Test
    public void Task2testTw() {
        MessageSender messageSender = new MessageSender();
        Login loginUser = new Login();
        Client usertwi = loginUser.login("twitter");
        Assertions.assertEquals(messageSender.send(
                "hello", usertwi, usertwi.getCountry().toString()),
                "Message hello sent to annapolova@gmail.com (Ukraine)");
    }
    @Test
    public void Task2testFb() {
        MessageSender messageSender = new MessageSender();
        Login loginUser = new Login();
        Client userfb = loginUser.login("facebook");
        Assertions.assertEquals(messageSender.send(
                        "hello", userfb, userfb.getCountry().toString()),
                "Message hello sent to annapolova@gmail.com (Ukraine)");
    }
}
