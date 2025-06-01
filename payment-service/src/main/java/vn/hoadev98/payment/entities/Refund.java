package vn.hoadev98.payment.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "refunds")
public class Refund {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "payment_id", nullable = false)
    private Long paymentId;

    @Column(name = "refund_amount", nullable = false, precision = 15, scale = 2)
    private BigDecimal refundAmount;

    @Lob
    @Column(name = "reason")
    private String reason;

    @ColumnDefault("PENDING")
    @Column(name = "status", length = 20)
    private String status;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "created_at")
    private Instant createdAt;

}