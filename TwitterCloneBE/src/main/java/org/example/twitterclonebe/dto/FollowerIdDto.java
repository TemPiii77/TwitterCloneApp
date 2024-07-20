package org.example.twitterclonebe.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link org.example.twitterclonebe.domain.FollowerId}
 */
@Data
@NoArgsConstructor
public class FollowerIdDto implements Serializable {
    Integer userId;
    Integer followerId;
}