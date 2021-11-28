package com.jojoldu.book.springboot.domain.posts;
//단순히 인터페이스를 생성 후 JpaRepository<Entity 클래스, Pk타입>을 상속하면 기본적인 CRUD 메소드가 자동으로 생성된다.
//@Repository를 추가할 필요도 없다. 주의 점은 엔티티 클래스와 엔티티 레포지토리는 함께 위치해야함.


import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts,Long> {
}
