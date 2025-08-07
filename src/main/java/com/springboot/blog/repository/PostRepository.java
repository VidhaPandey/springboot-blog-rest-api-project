package com.springboot.blog.repository;

import com.springboot.blog.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Repository interface for managing Post entities.
 * Extends JpaRepository to provide CRUD operations and additional JPA functionality.
 * //@param <Post> The entity type that this repository manages.
 * //@param <Long> The type of the entity's primary key.
 */

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findByCategoryId(Long categoryId);

}
