package com.basic.back_end.basic.domain.user.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserJoinRequest {
    private String userId;
    private String password;
    private String name;
}
