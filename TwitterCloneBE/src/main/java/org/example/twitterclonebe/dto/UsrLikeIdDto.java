package org.example.twitterclonebe.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link org.example.twitterclonebe.domain.UsrLikeId}
 */
@Data
@NoArgsConstructor
public class UsrLikeIdDto implements Serializable {
    Integer userId;
    Integer tweetId;
}