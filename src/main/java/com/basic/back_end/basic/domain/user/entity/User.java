package com.basic.back_end.basic.domain.user.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "user")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id", nullable = false, unique = true, columnDefinition = "VARCHAR(50) COMMENT '사용자 ID'")
    private String userId;

    @Column(name = "password", nullable = false, columnDefinition = "VARCHAR(100) COMMENT '비밀번호'")
    private String password;

    @Column(name = "name", nullable = false, columnDefinition = "VARCHAR(50) COMMENT '이름'")
    private String name;

    @Column(name = "register_datetime", nullable = false, columnDefinition = "DATETIME COMMENT '생성일'")
    private java.time.LocalDateTime registerDatetime;

    @Column(name = "register_id", nullable = false, columnDefinition = "VARCHAR(50) COMMENT '생성자'")
    private String registerId;

    @Column(name = "modify_datetime", nullable = false, columnDefinition = "DATETIME COMMENT '수정일'")
    private java.time.LocalDateTime modifyDatetime;

    @Column(name = "modify_id", nullable = false, columnDefinition = "VARCHAR(50) COMMENT '수정자'")
    private String modifyId;
}
