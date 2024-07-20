package org.example.twitterclonebe.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "tweet")
public class Tweet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private Usr user;

    @Column(name = "post", nullable = false, length = Integer.MAX_VALUE)
    private String post;

    @Column(name = "likes")
    private Integer likes;

    @Column(name = "replies")
    private Integer replies;

    @Column(name = "retweets")
    private Integer retweets;

    @Column(name = "created", nullable = false)
    private Instant created;

}