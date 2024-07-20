package org.example.twitterclonebe.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link org.example.twitterclonebe.domain.Follower}
 */
@Data
@NoArgsConstructor
public class FollowerDto implements Serializable {
    FollowerIdDto id;
    UsrDto user;
    UsrDto follower;
}