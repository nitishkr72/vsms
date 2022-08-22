package com.nitishkumar1.vsms.repo;

import com.nitishkumar1.vsms.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepo extends JpaRepository<Admin, Integer> {
    Admin findAdminById(int id);

    void deleteAdminById(int id);
}
