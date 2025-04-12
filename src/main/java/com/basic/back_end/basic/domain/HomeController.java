package com.basic.back_end.basic.domain;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "redirect:/board/list"; // 첫 화면을 게시판 리스트로 이동
    }
}
