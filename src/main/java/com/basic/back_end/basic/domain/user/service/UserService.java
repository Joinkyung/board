package com.basic.back_end.basic.domain.user.service;

import com.basic.back_end.basic.domain.user.dto.UserJoinRequest;
import com.basic.back_end.basic.domain.user.dto.UserLoginRequest;
import com.basic.back_end.basic.domain.user.entity.User;
import com.basic.back_end.basic.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public String join(UserJoinRequest request) {
        User user = User.builder()
                .userId(request.getUserId())
                .password(request.getPassword()) // 비밀번호 암호화는 나중에!
                .name(request.getName())
                .build();
        userRepository.save(user);
        return "회원가입 성공!";
    }

    public String login(UserLoginRequest request) {
        return "로그인 성공!";
    }
}
