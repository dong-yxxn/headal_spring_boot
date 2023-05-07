package com.jojoldu.book.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

//JpaRepository<Entity클래스, PK타입> 상속하면 기본적인 CRUD 메소드 자동생성
public interface PostsRepository extends JpaRepository<Posts, Long> {
}
