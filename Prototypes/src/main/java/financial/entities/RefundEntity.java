package financial.entities;

import financial.entities.enums.RefundStatus;

import java.time.LocalDateTime;

public class RefundEntity {
    private int transactionId;
    private int userId;
    private int amount;
    private LocalDateTime createdAt;
    private RefundStatus status;

    public void setStatus(RefundStatus status) {
        this.status = status;
    }
}
