package org.example.twitterclonebe.repository;

import org.example.twitterclonebe.domain.Follower;
import org.example.twitterclonebe.domain.FollowerId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FollowerRepository extends JpaRepository<Follower, FollowerId> {
}