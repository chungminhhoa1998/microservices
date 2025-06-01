package vn.hoadev98.payment.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "payments")
public class Payment {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "order_id", nullable = false)
    private Long orderId;

    @Column(name = "amount", nullable = false, precision = 15, scale = 2)
    private BigDecimal amount;

    @ColumnDefault("VND")
    @Column(name = "currency", length = 10)
    private String currency;

    @Column(name = "payment_method", length = 50)
    private String paymentMethod;

    @ColumnDefault("PENDING")
    @Column(name = "status", length = 20)
    private String status;

    @Column(name = "transaction_reference", length = 100)
    private String transactionReference;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "created_at")
    private Instant createdAt;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "updated_at")
    private Instant updatedAt;

}