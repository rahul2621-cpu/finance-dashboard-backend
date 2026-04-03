package com.rsc.Zorvyn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.rsc.Zorvyn.model.FinancialRecord;
import com.rsc.Zorvyn.service.RecordService;

import java.util.List;

@RestController
@RequestMapping("/api/records")
public class RecordController {

    @Autowired
    private RecordService service;

    @PostMapping
    public FinancialRecord create(@RequestBody FinancialRecord record) {
        return service.create(record);
    }

    @GetMapping
    public List<FinancialRecord> getAll() {
        return service.getAll();
    }
}
