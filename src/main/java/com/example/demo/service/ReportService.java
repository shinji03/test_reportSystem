package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class ReportService {

    public int countAll(int a) {

        int b = a + a;
        return b;

    }
}
