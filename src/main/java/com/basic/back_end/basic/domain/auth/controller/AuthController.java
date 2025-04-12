package com.basic.back_end.basic.domain.auth.controller;

import com.basic.back_end.basic.domain.auth.dto.RegisterDto;
import com.basic.back_end.basic.domain.auth.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthController {

    // private final AuthService authService;

    @Autowired
    AuthService authService;
    @GetMapping("/register")
    public String showRegisterForm() {
        return "auth/register";
    }

    @PostMapping("/register")
    public String register(RegisterDto registerDto, RedirectAttributes redirectAttributes) {
        authService.register(registerDto);
        redirectAttributes.addFlashAttribute("message", "회원가입이 완료되었습니다.");
        return "redirect:/auth/login";
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "auth/login"; // 로그인 페이지는 나중에 만들자!
    }
}
