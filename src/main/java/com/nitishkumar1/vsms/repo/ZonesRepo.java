package com.nitishkumar1.vsms.repo;

import com.nitishkumar1.vsms.model.Zones;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ZonesRepo extends JpaRepository<Zones, Integer> {

    void deleteZonesById(int version);
}
