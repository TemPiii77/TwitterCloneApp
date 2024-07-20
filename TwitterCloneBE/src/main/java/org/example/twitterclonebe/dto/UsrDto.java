package org.example.twitterclonebe.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.twitterclonebe.domain.Usr;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


/**
 * DTO for {@link Usr}
 */
@Data
@NoArgsConstructor
public class UsrDto implements Serializable {
    Integer id;
    String email;
    String username;
    String password;
    Integer likes;
    Integer followers;
    Integer following;
    String created;


    public UsrDto(Integer id, String email, String username, String password, Integer likes, Integer followers, Integer following, LocalDateTime created){
        this.id = id;
        this.email = email;
        this.username = username;
        this.password = password;
        this.likes = likes;
        this.followers = followers;
        this.following = following;

        DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("yy/MM/dd, hh:mm")
                .withLocale(Locale.ENGLISH)
                .withZone( ZoneId.systemDefault() );

        this.created = created.format(formatter);
    }


}