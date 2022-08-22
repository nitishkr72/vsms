package com.nitishkumar1.vsms.service;

import com.nitishkumar1.vsms.repo.CommissionModelRepo;
import org.springframework.stereotype.Service;

@Service
public class CommissionModelService {

    private CommissionModelRepo commissionModelRepo;

    public CommissionModelService(CommissionModelRepo commissionModelRepo) {
        this.commissionModelRepo = commissionModelRepo;
    }
}
