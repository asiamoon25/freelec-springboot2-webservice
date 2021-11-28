package com.jojoldu.book.springboot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//앞으로 만들 프로젝트의 메인 클래스가 된다.
@SpringBootApplication
//springbootapplication으로 인해 스프링부트의 자동설정, 스프링 빈 읽기와 생성을 모두 자동으로 설정한다. @SpringBootApplication이 있는 위치부터
//설정을 읽어가기 때문에 항상 프로젝트의 최상단 디렉토리 안에 잇어야 된다.
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);//내장 WAS 실행
    }
}
