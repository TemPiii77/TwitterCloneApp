package org.example.twitterclonebe.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link org.example.twitterclonebe.domain.Tag}
 */
@Data
@NoArgsConstructor
public class TagDto implements Serializable {
    TagIdDto id;
    TweetDto tweet;
}