package com.tenco.blog.board;

import com.tenco.blog.utils.MyDateUtil;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

// 기본 생성자 - JPA에서 엔티티는 기본 생성자가 필요
@NoArgsConstructor
@Data
// @Table : 실제 데이터베이스 테이블 명을 지정할 때 사용
@Table(name = "board_tb")
// @Entity : JPA가 이 클래스를 데이터베이스 테이블과 매핑하는 객체(엔티티)로 인식
// 즉, @Entity 어노테이션이 있어야 JPA가 이 객체를 관리 한다.
@Entity
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String content;
    private String username;

    @CreationTimestamp
    private Timestamp createdAt;

    // 생성자 만들어 주기
    public Board(String title, String content, String username) {
        this.title = title;
        this.content = content;
        this.username = username;
    }

    public String getTime() {
        return MyDateUtil.timstampformat(createdAt);
    }


}
