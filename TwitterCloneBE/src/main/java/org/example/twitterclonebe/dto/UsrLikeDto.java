package org.example.twitterclonebe.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link org.example.twitterclonebe.domain.UsrLike}
 */
@Data
@NoArgsConstructor
public class UsrLikeDto implements Serializable {
    UsrLikeIdDto id;
    UsrDto user;
    TweetDto tweet;
}