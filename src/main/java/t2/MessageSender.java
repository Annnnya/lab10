package t2;

import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class MessageSender {
    public String send(String text, Client user, String country) {
        if(user.getCountry() == Country.Ukraine
                && ChronoUnit.HOURS.between(LocalDate.now(), user.getLastActive()) < 2){
        return "Message " + text + " sent to " + user.getEmail()+" ("+country+")";
        }
        return "Message was not sent";
    }
}
