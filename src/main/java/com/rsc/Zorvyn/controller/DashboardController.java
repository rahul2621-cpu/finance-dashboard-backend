package com.rsc.Zorvyn.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.rsc.Zorvyn.service.RecordService;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/dashboard")
public class DashboardController {

    @Autowired
    private RecordService service;

    @GetMapping("/summary")
    public Map<String, Object> summary() {

        Map<String, Object> data = new HashMap<>();
        data.put("income", service.getTotalIncome());
        data.put("expense", service.getTotalExpense());
        data.put("balance", service.getNetBalance());

        return data;
    }
}
