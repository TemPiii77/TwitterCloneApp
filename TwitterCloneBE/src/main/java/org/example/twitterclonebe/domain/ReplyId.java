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
public class ReplyId implements Serializable {
    private static final long serialVersionUID = -1711414985222320887L;
    @Column(name = "tweet_id", nullable = false)
    private Integer tweetId;

    @Column(name = "reply_id", nullable = false)
    private Integer replyId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ReplyId entity = (ReplyId) o;
        return Objects.equals(this.replyId, entity.replyId) &&
                Objects.equals(this.tweetId, entity.tweetId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(replyId, tweetId);
    }

}