package pl.alx.dept.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Repayment {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private LocalDateTime createdAt;
    private BigDecimal installment;

    @ManyToOne
    @JoinColumn(name = "debt_id")
    private Debt debt;

}
