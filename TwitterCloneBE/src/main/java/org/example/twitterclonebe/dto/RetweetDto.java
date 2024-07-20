package org.example.twitterclonebe.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link org.example.twitterclonebe.domain.Retweet}
 */
@Data
@NoArgsConstructor
public class RetweetDto implements Serializable {
    RetweetIdDto id;
    TweetDto tweet;
    TweetDto retweet;
}