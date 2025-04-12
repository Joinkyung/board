package com.basic.back_end.basic.domain.board.mapper;

import com.basic.back_end.basic.domain.board.entity.Board;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BoardMapper {

    // 모든 게시판 목록 조회
    List<Board> getAllBoards();

    // 게시글 상세 조회
    Board getBoardById(@Param("id") Long id);

    // 게시글 저장
    void saveBoard(Board board);
}
