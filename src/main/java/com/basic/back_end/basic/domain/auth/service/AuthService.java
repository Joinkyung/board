package com.basic.back_end.basic.domain.auth.service;

import com.basic.back_end.basic.domain.auth.dto.RegisterDto;
import com.basic.back_end.basic.domain.user.entity.User;
import com.basic.back_end.basic.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public void register(RegisterDto dto) {
        User user = new User();
        user.setUserId(dto.getUserId());
        user.setName(dto.getName());
        user.setPassword(passwordEncoder.encode(dto.getPassword()));

        userRepository.save(user);
    }
}
