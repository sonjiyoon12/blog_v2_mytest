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

    // 게시글 삭제하기 (영속성 컨텍스트를 활용)
    @Transactional
    public void deleteById(Long id) {


    }
}
