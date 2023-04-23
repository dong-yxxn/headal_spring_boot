package com.jojoldu.book.springboot.domain.posts;

import com.jojoldu.book.springboot.domain.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor//기본 생성자
@Entity
public class Posts extends BaseTimeEntity {

    @Id//primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Auto Increment
    private Long id;

    @Column(length=500, nullable=false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author){
        this.title=title;
        this.content=content;
        this.author=author;
    }

    public void update(String title, String content){
        this.title = title;
        this.content = content;
    }

}
