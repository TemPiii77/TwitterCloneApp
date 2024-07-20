package org.example.twitterclonebe.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link org.example.twitterclonebe.domain.RetweetId}
 */
@Data
@NoArgsConstructor
public class RetweetIdDto implements Serializable {
    Integer tweetId;
    Integer retweetId;
}