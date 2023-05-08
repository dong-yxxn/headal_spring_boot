package com.jojoldu.book.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

//JpaRepository<Entity클래스, PK타입> 상속하면 기본적인 CRUD 메소드 자동생성
//JpaRepository를 통해 Entity 데이터 이용 가능
//@Repository 표시 안해도 되지만, Entity 클래스와 함께 위치해야됨
public interface PostsRepository extends JpaRepository<Posts, Long> {
}
