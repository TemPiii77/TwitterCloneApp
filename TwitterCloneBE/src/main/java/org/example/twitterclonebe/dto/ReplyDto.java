package org.example.twitterclonebe.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link org.example.twitterclonebe.domain.Reply}
 */
@Data
@NoArgsConstructor
public class ReplyDto implements Serializable {
    ReplyIdDto id;
    TweetDto tweet;
    TweetDto reply;
}