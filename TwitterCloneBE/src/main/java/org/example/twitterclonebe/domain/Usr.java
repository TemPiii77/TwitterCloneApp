package org.example.twitterclonebe.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "usr")
public class Usr {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "email", nullable = false, length = Integer.MAX_VALUE)
    private String email;

    @Column(name = "username", nullable = false, length = Integer.MAX_VALUE)
    private String username;

    @Column(name = "password", nullable = false, length = Integer.MAX_VALUE)
    private String password;

    @Column(name = "likes")
    private Integer likes;

    @Column(name = "followers")
    private Integer followers;

    @Column(name = "following")
    private Integer following;

    @Column(name = "created")
    //@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")

    //@Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime created;

    public Usr(Integer id, String email, String username, String password, Integer likes, Integer followers, Integer following, String created) {
    }

    public Usr() {

    }
}