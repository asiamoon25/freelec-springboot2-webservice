package com.jojoldu.book.springboot.domain.posts;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Getter
@NoArgsConstructor // 기본생성자 자동추가 public Posts(){}과 같ㅇ은 효과
@Entity //=> 테이블과 링크될 클래스임을 나타냄. 기본값으로 클래스의 카멜케이스 이름을 언더스코어 네이밍(_)으로 테이블 이름을 매칭함. ex) SalesManager.java -> sales_manager table
public class Posts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Pk의 생성 규칙을 나타냄, 스프링부트에서는 제너레이션타입.아이덴티티 옵션을 추가해야지만 auto_increment가 된다.
    private Long id;

    @Column(length = 500, nullable = false)//@Colum 테이블의 칼럼을 나타내며 굳이 선언하지 않더라도 해당 클래스의 필드는 모두 칼럼이 된다. 사용하는 이유는 기본값 외에 추가로 변경이 필요한 옵션이 있으면 사용한다.
    //문자열의 경우 varchar(255)가 기본값인데, 사이즈를 500으로 늘리고 싶거나 타입을 text로 변경하고 싶거나 등의 경우에 사용한다.
    private String title;

    @Column(columnDefinition = "TEXT",nullable = false)
    private String content;

    private String author;

    @Builder// 해당 클래스의 빌더 패턴 클래스 생성, 생성자 상단에 선언시 생성자에 포함된 필드만 빌더에 포함
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }
}
//기본 구조는 생성자에서 setting을 하고 db에 삽입하는 과정임. 그래서 setter를 쓰지 않기를 권장이라기 보다 하면 않됨. 생성자 대신 빌더를 쓰는데 역할은 똑같지만 생성자는 지금 채워야 할 필드가 무엇인지 명확이 지정할 수 없다.