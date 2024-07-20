package org.example.twitterclonebe.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class RetweetId implements Serializable {
    private static final long serialVersionUID = -371264001687834290L;
    @Column(name = "tweet_id", nullable = false)
    private Integer tweetId;

    @Column(name = "retweet_id", nullable = false)
    private Integer retweetId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        RetweetId entity = (RetweetId) o;
        return Objects.equals(this.retweetId, entity.retweetId) &&
                Objects.equals(this.tweetId, entity.tweetId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(retweetId, tweetId);
    }

}