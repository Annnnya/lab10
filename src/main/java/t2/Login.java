package t2;

import java.time.LocalDateTime;

public class Login {
    public Client login(String loginMethod) {
        if (loginMethod.equals("twitter")) {
            return new TwitterClient(new TwitterUser("annapolova@gmail.com", Country.Ukraine, LocalDateTime.now()));
        } else if (loginMethod.equals("facebook")) {
            return new FacebookClient(new FacebookUser("annapolova@gmail.com", Country.Ukraine, LocalDateTime.now()));
        }
        throw new IllegalArgumentException("Error: no such login method");
    }
}
