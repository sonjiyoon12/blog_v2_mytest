package com.tenco.blog.board;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor // 필수 멤버변수를 확인해서 생성자에 등록해줌
@Repository // IoC 대상이 된다 - 싱글톤 패턴으로 관리 됨
public class BoardPersistRepository {

    // JPA 핵심 인터페이스
    // @Autowired - DI 처리 (final를 사용 시 사용 불가)
    private final EntityManager em;

    // 게시글 저장 기능 - 영속성 컨텍스트 활용
    @Transactional
    public Board save(Board board) {

        // 1. 매개변수로 받은 board 현재 비영속성 상태이다.
        // 아직 영속성 컨텍스트에 관리가 되지 않은 상태
        // 데이터베이스와 아직은 연관 없는 순수 java 객체 상태

        // 2. em.persist(board); 이 엔티티를 영속성 컨텍스트에 저장하는 개념
        //                  - 영속성 컨텍스트가 board 객체를 관리하게 된다
        em.persist(board);

        // 3. 트랜잭션 커밋 시점에 insert 쿼리 실행

        // 4. 영속 상태로 board 객체를 반환
        return board;
    }


}
