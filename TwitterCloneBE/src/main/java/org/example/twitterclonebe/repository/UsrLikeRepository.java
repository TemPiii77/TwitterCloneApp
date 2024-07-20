package org.example.twitterclonebe.repository;

import org.example.twitterclonebe.domain.UsrLike;
import org.example.twitterclonebe.domain.UsrLikeId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsrLikeRepository extends JpaRepository<UsrLike, UsrLikeId> {
}