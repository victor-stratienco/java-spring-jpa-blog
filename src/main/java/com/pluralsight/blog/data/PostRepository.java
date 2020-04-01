package com.pluralsight.blog.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pluralsight.blog.model.Category;
import com.pluralsight.blog.model.Post;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findByCategory(Category category);
}
