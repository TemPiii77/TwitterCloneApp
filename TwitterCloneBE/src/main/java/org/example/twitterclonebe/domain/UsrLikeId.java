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
public class UsrLikeId implements Serializable {
    private static final long serialVersionUID = 4618826754482001741L;
    @Column(name = "user_id", nullable = false)
    private Integer userId;

    @Column(name = "tweet_id", nullable = false)
    private Integer tweetId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        UsrLikeId entity = (UsrLikeId) o;
        return Objects.equals(this.userId, entity.userId) &&
                Objects.equals(this.tweetId, entity.tweetId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, tweetId);
    }

}