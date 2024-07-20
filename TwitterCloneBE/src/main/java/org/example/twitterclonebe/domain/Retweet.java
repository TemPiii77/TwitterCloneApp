package org.example.twitterclonebe.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "retweet")
public class Retweet {
    @EmbeddedId
    private RetweetId id;

    @MapsId("tweetId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tweet_id", nullable = false)
    private Tweet tweet;

    @MapsId("retweetId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "retweet_id", nullable = false)
    private Tweet retweet;

}