package com.rsc.Zorvyn.model;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;
@Entity
@Data
public class FinancialRecord {
            @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
            private Long id;

            private Double amount;

            @Enumerated(EnumType.STRING)
            private Type type;

            private String category;

            private LocalDate date;

            private String notes;

            @ManyToOne
            private User createdBy;
     public Type getType() {
        return type;
    }
    public Double getAmount() {
        return amount;
    }
        }

