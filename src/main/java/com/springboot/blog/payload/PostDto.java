package com.springboot.blog.payload;

import lombok.Data;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import java.util.Set;

@Data
public class PostDto {
    private long id;
    @NotEmpty
    @Size(min=2, message = "Title should have at least 2 characters")
    private String title;
    @NotEmpty
    @Size(min=10, message = "Description should have at least 10 characters")
    private String description;
    @NotEmpty
    private String content;
    private Set<CommentDto> comments; // Assuming CommentDto is another DTO class for comments

    private CategoryDto category; // Assuming CategoryDto is another DTO class for categories
}
