package org.example.twitterclonebe.repository;

import org.example.twitterclonebe.domain.Tag;
import org.example.twitterclonebe.domain.TagId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag, TagId> {
}