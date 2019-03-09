package pl.alx.dept.model;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Entity
public class Debt {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private LocalDateTime createdAt;
    private BigDecimal amount;

@ManyToOne
@JoinColumn(name = "lender_id")
    private User lender;

    @ManyToOne
    @JoinColumn(name = "debtor_id")
    private Debtor debtor;

    private boolean paidOff;



}
