package com.moada.domain;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum UserEnum {
    ADMIN("관리자"),CUSTOMER("고객");

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private String value; // WITHDRAW, DEPOSIT, TRANSFER, ALL
}
