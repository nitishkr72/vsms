package com.nitishkumar1.vsms.service;

import com.nitishkumar1.vsms.model.Admin;
import com.nitishkumar1.vsms.repo.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AdminService {
    private final AdminRepo adminRepo;

    @Autowired
    public AdminService(AdminRepo adminRepo) {
        this.adminRepo = adminRepo;
    }

    @Transactional
    public List<Admin> findAllAdmin() {
        return adminRepo.findAll();
    }

    // we have to add exception to it
    @Transactional
    public Admin findAdminById(int id) {
        return adminRepo.findAdminById(id);
    }

    @Transactional
    public Admin saveAdmin(Admin admin) {
        return adminRepo.save(admin);
    }

    @Transactional
    public void deleteAdmin(int id) {
        adminRepo.deleteAdminById(id);
    }
}
