package financial.entities;

import financial.entities.enums.TransactionStatus;
import financial.entities.enums.TransactionType;

import java.time.LocalDateTime;

public class TransactionEntity {

    private int id;
    private int amount;
    private int userId;
    private TransactionType type;
    private TransactionStatus status;
    private LocalDateTime createdAt;
    private String source;
    private String destination;
    private String bankToken;

    public TransactionEntity(int amount, int userId, TransactionType type, LocalDateTime createdAt, String source, String destination) {
        this.amount = amount;
        this.userId = userId;
        this.type = type;
        this.createdAt = createdAt;
        this.source = source;
        this.destination = destination;
    }

    public String getBankToken() {
        return bankToken;
    }

    public void setBankToken(String bankToken) {
        this.bankToken = bankToken;
    }

    public TransactionStatus getStatus() {
        return status;
    }

    public void setStatus(TransactionStatus status) {
        this.status = status;
    }

    public TransactionType getType() {
        return type;
    }

    public int getUserId() {
        return userId;
    }

    public int getAmount() {
        return amount;
    }

    public int getId() {
        return id;
    }
}
