package com.basic.back_end.basic.domain.board.controller;

import com.basic.back_end.basic.domain.board.service.BoardService;
import com.basic.back_end.basic.domain.board.entity.Board;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/board")
public class BoardController {

    private final BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    // 게시판 리스트
    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("boardList", boardService.getAllBoards());
        return "board/list";  // board/list.html
    }

    // 게시글 상세보기
    @GetMapping("/detail/{id}")
    public String detail(@PathVariable("id") Long id, Model model) {
        model.addAttribute("board", boardService.getBoardById(id));
        return "board/detail";  // board/detail.html
    }

    // 게시글 작성 폼
    @GetMapping("/new")
    public String newBoard(Model model) {
        model.addAttribute("board", new Board());  // 새 게시글 객체를 모델에 전달
        return "board/form";  // board/form.html
    }

    // 게시글 저장
    @PostMapping("/save")
    public String save(@ModelAttribute Board board) {
        boardService.saveBoard(board);
        return "redirect:/board/list";  // 게시글 작성 후 리스트로 리다이렉트
    }
}
