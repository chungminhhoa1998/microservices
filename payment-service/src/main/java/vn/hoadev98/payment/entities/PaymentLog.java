package vn.hoadev98.payment.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "payment_logs")
public class PaymentLog {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "payment_id", nullable = false)
    private Long paymentId;

    @Lob
    @Column(name = "log_message")
    private String logMessage;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "created_at")
    private Instant createdAt;

}