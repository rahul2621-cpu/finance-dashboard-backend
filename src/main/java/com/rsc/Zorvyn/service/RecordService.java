package com.rsc.Zorvyn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rsc.Zorvyn.model.FinancialRecord;
import com.rsc.Zorvyn.repository.RecordRepository;

import java.util.List;

@Service
public class RecordService {

    @Autowired
    private RecordRepository repo;

    public FinancialRecord create(FinancialRecord record) {
        return repo.save(record);
    }

    public List<FinancialRecord> getAll() {
        return repo.findAll();
    }

    public Double getTotalIncome() {
        return repo.findAll().stream()
                .filter(r -> r.getType().name().equals("INCOME"))
                .mapToDouble(FinancialRecord::getAmount)
                .sum();
    }

    public Double getTotalExpense() {
        return repo.findAll().stream()
                .filter(r -> r.getType().name().equals("EXPENSE"))
                .mapToDouble(FinancialRecord::getAmount)
                .sum();
    }

    public Double getNetBalance() {
        return getTotalIncome() - getTotalExpense();
    }
}
