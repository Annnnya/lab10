package t2;

import java.time.LocalDateTime;

public class FacebookClient implements Client {
    private final FacebookUser user;

    public FacebookClient(FacebookUser user) {
        this.user = user;
    }

    @Override
    public String getEmail() {
        return user.getEmail();
    }

    @Override
    public Country getCountry() {
        return user.getUserCountry();
    }

    @Override
    public LocalDateTime getLastActive() {
        return user.getLastActive();
    }
}
