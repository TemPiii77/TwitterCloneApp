package org.example.twitterclonebe.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link org.example.twitterclonebe.domain.ReplyId}
 */
@Data
@NoArgsConstructor
public class ReplyIdDto implements Serializable {
    Integer tweetId;
    Integer replyId;
}