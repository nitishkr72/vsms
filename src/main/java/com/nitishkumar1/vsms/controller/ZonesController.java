package com.nitishkumar1.vsms.controller;


import com.nitishkumar1.vsms.model.Zones;
import com.nitishkumar1.vsms.service.ZonesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/zones")
public class ZonesController {
    private final ZonesService zonesService;

    public ZonesController(ZonesService zonesService) {
        this.zonesService = zonesService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Zones>> getAllZones() {
        List<Zones> zones = zonesService.getAllZones();
        return new ResponseEntity<>(zones, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Zones> addZones(@RequestBody Zones zones) {
        Zones newZone = zonesService.addZones(zones);
        return new ResponseEntity<>(newZone, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteZoneById(@PathVariable("id") int id) {
        zonesService.deleteZonesById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
