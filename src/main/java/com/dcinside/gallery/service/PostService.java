package com.dcinside.gallery.service;

import com.dcinside.gallery.domain.Post;
import com.dcinside.gallery.domain.dto.PostDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PostService {
    /**
     * 1. post 게시
     * 2. 일반글 조회
     * 3. 개념글 조회
     * 4. 수정 and 삭제
     */
    void write(String minorId, PostDto postDto);

    Page<Post> findNormalPost(String minorId, Pageable pageable);

    Post viewPost(String minorId, Long postNumber);

    Page<Post> findRecommendPost(String minorId, Pageable pageable);

    void update(String minorId, Long postNumber, PostDto postDto);

    void delete(String minorId, Long postNumber);
}
