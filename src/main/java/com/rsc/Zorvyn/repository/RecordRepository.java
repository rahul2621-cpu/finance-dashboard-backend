package com.rsc.Zorvyn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rsc.Zorvyn.model.FinancialRecord;
import com.rsc.Zorvyn.model.Type;
import java.util.List;

public interface RecordRepository extends JpaRepository<FinancialRecord, Long> {
    List<FinancialRecord> findByType(Type type);
    List<FinancialRecord> findByCategory(String category);
}
