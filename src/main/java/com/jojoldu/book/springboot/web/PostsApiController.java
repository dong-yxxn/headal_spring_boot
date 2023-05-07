package com.jojoldu.book.springboot.web;

import com.jojoldu.book.springboot.service.posts.PostsService;
import com.jojoldu.book.springboot.web.dto.PostsResponseDto;
import com.jojoldu.book.springboot.web.dto.PostsSaveRequestDto;
import com.jojoldu.book.springboot.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor//생성자로 Bean 주입받게 해주는 메소드 -> final 선언된 모든 필드 생성자 자동생성
@RestController//@Controller + @ResponseBody -> @ResponseBody는 따로 생성안해도 됨
//@ResponseBody: Java객체 -> HttpResponse의 responseBody로 JSON or XML형식으로 전달
public class PostsApiController {
    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto){
        return postsService.save(requestDto);
    }
    //requestBody: 요청하는 본문
    //클라이언트 -> 요청데이터(JSON 파일) -> @RequestBody -> (JSON -> Java Object 변환) -> 서버

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto){
        return postsService.update(id, requestDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById(@PathVariable Long id){
        return postsService.findById(id);
    }
}

