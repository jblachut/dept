package pl.alx.dept.model;

import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Debt {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private BigDecimal amount;
@ManyToOne
@JoinColumn(name = "lender_id")
    private User lender;

    @ManyToOne
    @JoinColumn(name = "debtor_id")
    private Debtor debtor;

}
