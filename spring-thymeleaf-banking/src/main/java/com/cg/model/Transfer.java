package com.cg.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Transfer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "sender_id", referencedColumnName = "id", nullable = false)
    private Customer sender;
    @ManyToOne
    @JoinColumn(name = "recipient_id", referencedColumnName = "id", nullable = false)
    private Customer recipient;
    @Column(name = "transfer_amount", precision = 10, scale = 2, columnDefinition = "decimal(10,2)")
    private BigDecimal transferAmount;
    @Column(columnDefinition = "bigint default 10")
    private Long fees;
    @Column(name = "fees_amount", precision = 10, scale = 2, columnDefinition = "decimal(10,2)")
    private BigDecimal feesAmount;
    @Column(name = "transaction_amount", precision = 10, scale = 2, columnDefinition = "decimal(10,2)")
    private BigDecimal transactionAmount;
    @Column(columnDefinition = "boolean default false")
    private Boolean deleted;
    @Column(name = "create_at", columnDefinition = "DATETIME")
    private LocalDateTime createAt;

    public Transfer() {
    }

    public Transfer(Long id, Customer sender, Customer recipient, BigDecimal transferAmount, Long fees, BigDecimal feesAmount, BigDecimal transactionAmount, Boolean deleted) {
        this.id = id;
        this.sender = sender;
        this.recipient = recipient;
        this.transferAmount = transferAmount;
        this.fees = fees;
        this.feesAmount = feesAmount;
        this.transactionAmount = transactionAmount;
        this.deleted = deleted;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getSender() {
        return sender;
    }

    public void setSender(Customer sender) {
        this.sender = sender;
    }

    public Customer getRecipient() {
        return recipient;
    }

    public void setRecipient(Customer recipient) {
        this.recipient = recipient;
    }

    public BigDecimal getTransferAmount() {
        return transferAmount;
    }

    public void setTransferAmount(BigDecimal transferAmount) {
        this.transferAmount = transferAmount;
    }

    public Long getFees() {
        return fees;
    }

    public void setFees(Long fees) {
        this.fees = fees;
    }

    public BigDecimal getFeesAmount() {
        return feesAmount;
    }

    public void setFeesAmount(BigDecimal feesAmount) {
        this.feesAmount = feesAmount;
    }

    public BigDecimal getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(BigDecimal transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}
