package com.example.fastcampusmysql.domain.member.entity;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

//@AllArgsConstructor
@Getter
public class Member {

    private final Long id;
    private String nickname;
    private final String email;
    private final LocalDate birthDate;
    private final LocalDateTime createdAt;

    @Builder
    public Member(Long id, String nickname, String email, LocalDate birthDate, LocalDateTime createdAt) {
        this.id = id;
        this.nickname = Objects.requireNonNull(nickname);
        this.email = Objects.requireNonNull(email);
        this.birthDate = Objects.requireNonNull(birthDate);
        this.createdAt = createdAt;
    }
}
