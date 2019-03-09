package pl.alx.dept.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
@Setter
@Getter
@Entity
@NoArgsConstructor
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

    public String getLenderName(){
        return lender.getFirstName() + " " + lender.getLastName();
    }

    public String getDebtorName(){
        return  debtor.getFirstName()+ " " + debtor.getLastName();

    }
    public Debt (User lender, Debtor debtor, BigDecimal amount){
        this.lender=lender;
        this.debtor=debtor;
        this.amount=amount;
        this.createdAt=LocalDateTime.now();
        this.paidOff=false;

    }




}
