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
public class TagId implements Serializable {
    private static final long serialVersionUID = 3927675280716049321L;
    @Column(name = "name", nullable = false, length = Integer.MAX_VALUE)
    private String name;

    @Column(name = "tweet_id", nullable = false)
    private Integer tweetId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        TagId entity = (TagId) o;
        return Objects.equals(this.name, entity.name) &&
                Objects.equals(this.tweetId, entity.tweetId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, tweetId);
    }

}