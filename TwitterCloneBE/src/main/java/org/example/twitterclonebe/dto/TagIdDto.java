package org.example.twitterclonebe.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link org.example.twitterclonebe.domain.TagId}
 */
@Data
@NoArgsConstructor
public class TagIdDto implements Serializable {
    String name;
    Integer tweetId;
}