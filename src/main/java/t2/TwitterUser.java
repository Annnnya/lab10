package t2;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class TwitterUser {
    private String userMail;
    private Country country;
    private LocalDateTime lastActive;
}
