package com.basic.back_end.basic.domain.board.service;

import com.basic.back_end.basic.domain.board.entity.Board;
import com.basic.back_end.basic.domain.board.mapper.BoardMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    private final BoardMapper boardMapper;

    public BoardService(BoardMapper boardMapper) {
        this.boardMapper = boardMapper;
    }

    // 모든 게시판 목록 조회
    public List<Board> getAllBoards() {
        return boardMapper.getAllBoards();
    }

    // 특정 게시판 조회
    public Board getBoardById(Long id) {
        return boardMapper.getBoardById(id);
    }

    // 게시글 저장
    public void saveBoard(Board board) {
        boardMapper.saveBoard(board);
    }
}
