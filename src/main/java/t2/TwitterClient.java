package t2;

import java.time.LocalDateTime;

public class TwitterClient implements Client {
    private final TwitterUser user;

    public TwitterClient(TwitterUser user) {
        this.user = user;
    }

    @Override
    public String getEmail() {
        return user.getUserMail();
    }

    @Override
    public Country getCountry() {
        return user.getCountry();
    }

    @Override
    public LocalDateTime getLastActive() {
        return user.getLastActive();
    }
}
