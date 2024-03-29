package com.jojoldu.book.springboot.domain.posts;

import com.jojoldu.book.springboot.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.dom4j.swing.XMLTableColumnDefinition;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// 롬복은 코드를 단순화시켜주지면 필수 어노테이션은 아님 ! 그래서 주요 어노테이션을 클래스에 가깝게
@Getter // 롬복 어노테이션
@NoArgsConstructor // 롬복 어노테이션
@Entity // JPA 어노테이션
public class Posts extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    // 수정/조회 기능
    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
