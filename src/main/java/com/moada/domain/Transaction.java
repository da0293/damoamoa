package com.moada.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import lombok.AccessLevel;
import java.time.LocalDateTime;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@EntityListeners(AuditingEntityListener.class)
@Table(name = "account_tb")
@Entity
public class Transaction {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Account withdrawAccount;
    @ManyToOne(fetch = FetchType.LAZY)
    private Account depositAccount;

    @Column(nullable = false)
    private Long amount; // 입금금액

    // 그때그때 잔액이 남겨짐
    private Long withdrawAccountBalance;
    private Long depositAccountBalance;

    private TransactionEnum status; // 계좌 잔액의 입출금 과정

    @CreatedDate // Insert
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(nullable = false)
    private LocalDateTime updatedAt;

    // 계좌사라져도 로그 기록
    private String sender;
    private String receiver;
    private String tel;

    public Transaction(Long id, Account withdrawAccount, Account depositAccount, Long amount,
                       Long withdrawAccountBalance, Long depositAccountBalance, TransactionEnum status,
                       LocalDateTime createdAt, LocalDateTime updatedAt, String sender, String receiver, String tel) {
        this.id = id;
        this.withdrawAccount = withdrawAccount;
        this.depositAccount = depositAccount;
        this.amount = amount;
        this.withdrawAccountBalance = withdrawAccountBalance;
        this.depositAccountBalance = depositAccountBalance;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.sender = sender;
        this.receiver = receiver;
        this.tel = tel;
    }
}
