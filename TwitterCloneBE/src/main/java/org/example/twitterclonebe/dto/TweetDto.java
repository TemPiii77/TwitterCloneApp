package org.example.twitterclonebe.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.io.Serializable;
import java.time.Instant;

/**
 * DTO for {@link org.example.twitterclonebe.domain.Tweet}
 */
@Data
@NoArgsConstructor
public class TweetDto implements Serializable {
    Integer id;
    String post;
    Integer likes;
    Integer replies;
    Integer retweets;
    Instant created;
}