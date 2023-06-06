package com.example.Appweb.web;


import com.example.Appweb.entities.KpiValue;
import com.example.Appweb.service.KpiValueService;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/kpi_values")
public class KpiValueController {

    private final KpiValueService kpiValueService;

    public KpiValueController(KpiValueService kpiValueService) {
        this.kpiValueService = kpiValueService;
    }

    @PostMapping
    public ResponseEntity<KpiValue> createKpiValue(@RequestBody KpiValue kpiValue) {
        KpiValue createdKpiValue = kpiValueService.createKpiValue(kpiValue);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdKpiValue);
    }

    @PutMapping("/{kpiValueId}")
    public ResponseEntity<KpiValue> updateKpiValue(@PathVariable Integer kpiValueId, @RequestBody KpiValue kpiValue) {
        KpiValue existingKpiValue = kpiValueService.getKpiValueById(kpiValueId);
        if (existingKpiValue == null) {
            return ResponseEntity.notFound().build();
        }
        kpiValue.setId(kpiValueId);
        KpiValue updatedKpiValue = kpiValueService.updateKpiValue(kpiValue);
        return ResponseEntity.ok(updatedKpiValue);
    }

    @DeleteMapping("/{kpiValueId}")
    public ResponseEntity<Void> deleteKpiValue(@PathVariable Integer kpiValueId) {
        KpiValue existingKpiValue = kpiValueService.getKpiValueById(kpiValueId);
        if (existingKpiValue == null) {
            return ResponseEntity.notFound().build();
        }
        kpiValueService.deleteKpiValue(kpiValueId);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{kpiValueId}")
    public ResponseEntity<KpiValue> getKpiValueById(@PathVariable Integer kpiValueId) {
        KpiValue kpiValue = kpiValueService.getKpiValueById(kpiValueId);
        if (kpiValue == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(kpiValue);
    }

    @GetMapping
    public ResponseEntity<List<KpiValue>> getAllKpiValues() {
        List<KpiValue> kpiValues = kpiValueService.getAllKpiValues();
        return ResponseEntity.ok(kpiValues);
    }
}
