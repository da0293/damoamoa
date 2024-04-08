package com.moada.domain;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TransactionEnum {
    WITHDRAW("출금"), DEPOSIT("입금"), TRANSFER("이체"), ALL("입출금내역");

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private String value;
    // 추가 필드 및 게터/세터 메서드는 필요에 따라 추가할 수 있습니다.
}
