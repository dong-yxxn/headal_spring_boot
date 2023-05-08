package com.jojoldu.book.springboot.web.dto;

import com.jojoldu.book.springboot.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
//lombok 어노테이션
//필드의 생성자 자동 생성
//final 적용된 필드는 에러 -> @RequiredArgsConstructor 적용
public class PostsSaveRequestDto {
    private String title;
    private String content;
    private String author;
    @Builder
    public PostsSaveRequestDto(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public Posts toEntity(){
        return Posts.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();
        //1.각 필드의 이름으로 함수 적용
        //2.가독성 좋음
        //3.변수 순서에서 자유로움
    }
}
