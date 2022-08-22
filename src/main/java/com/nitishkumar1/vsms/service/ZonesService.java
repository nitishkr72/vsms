package com.nitishkumar1.vsms.service;

import com.nitishkumar1.vsms.model.Zones;
import com.nitishkumar1.vsms.repo.ZonesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ZonesService {

    private final ZonesRepo zonesRepo;

    @Autowired
    public ZonesService(ZonesRepo zonesRepo) {
        this.zonesRepo = zonesRepo;
    }

    public List<Zones> getAllZones() {
        List<Zones> zonesList = zonesRepo.findAll();
        for(int i=0; i<zonesList.size(); i++) {
            if(zonesList.get(i).getEmployeeList().size() > 0)
                System.out.println("Employee Name: " + zonesList.get(i).getEmployeeList().get(0).getName());
        }
        return zonesList;
    }

    public Zones addZones(Zones zones) {
        return zonesRepo.save(zones);
    }

    public void deleteZonesById(int version) {
        zonesRepo.deleteZonesById(version);
    }


    public Optional<Zones> getZonesById(int id) {
        return zonesRepo.findById(id);
    }

}
