package com.tenco.blog.board;

import lombok.Data;

/**
 * 클라이언트에서 넘어온 데이터를
 * Object로 변환해서 전달하는 DTO 역할을 담당한다
 */
public class BoardRequest {

    // 정적 내부 클래스로 기능별로 DTO 관리
    // 게시글 저장 요청 데이터
    // BoardRequest.SaveDTO 변수명
    @Data
    public static class SaveDTO {

    }

}
