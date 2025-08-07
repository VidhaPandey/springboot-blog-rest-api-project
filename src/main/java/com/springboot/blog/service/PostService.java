package com.springboot.blog.service;

import com.springboot.blog.payload.PostDto;
import com.springboot.blog.payload.PostResponse;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);

//    List<PostDto> getAllPosts();

//    List<PostDto> getAllPosts(int pageNo, int pageSize);

    // Paginated response for posts
    PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);

    PostDto getPostById(long id);

    void deletePostById(long id);

    PostDto updatePost(PostDto postDto, long id);

    List<PostDto> getPostsByCategoryId(long categoryId);
}
