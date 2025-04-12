package com.basic.back_end.basic.domain.auth.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterDto {
    private String userId;
    private String password;
    private String name;
}
