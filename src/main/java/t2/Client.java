package t2;

import java.time.LocalDateTime;

public interface Client {
    String getEmail();
    Country getCountry();
    LocalDateTime getLastActive();
}
