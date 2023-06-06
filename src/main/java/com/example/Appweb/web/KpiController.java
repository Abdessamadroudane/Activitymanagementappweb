package com.example.Appweb.web;

import com.example.Appweb.entities.Kpi;
import com.example.Appweb.service.KpiService;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/kpis")
public class KpiController {

    private final KpiService kpiService;

    public KpiController(KpiService kpiService) {
        this.kpiService = kpiService;
    }

    @PostMapping
    public ResponseEntity<Kpi> createKpi(@RequestBody Kpi kpi) {
        Kpi createdKpi = kpiService.createKpi(kpi);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdKpi);
    }

    @PutMapping("/{kpiId}")
    public ResponseEntity<Kpi> updateKpi(@PathVariable Integer kpiId, @RequestBody Kpi kpi) {
        Kpi existingKpi = kpiService.getKpiById(kpiId);
        if (existingKpi == null) {
            return ResponseEntity.notFound().build();
        }
        kpi.setId(kpiId);
        Kpi updatedKpi = kpiService.updateKpi(kpi);
        return ResponseEntity.ok(updatedKpi);
    }

    @DeleteMapping("/{kpiId}")
    public ResponseEntity<Void> deleteKpi(@PathVariable Integer kpiId) {
        Kpi existingKpi = kpiService.getKpiById(kpiId);
        if (existingKpi == null) {
            return ResponseEntity.notFound().build();
        }
        kpiService.deleteKpi(kpiId);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{kpiId}")
    public ResponseEntity<Kpi> getKpiById(@PathVariable Integer kpiId) {
        Kpi kpi = kpiService.getKpiById(kpiId);
        if (kpi == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(kpi);
    }

    @GetMapping
    public ResponseEntity<List<Kpi>> getAllKpis() {
        List<Kpi> kpis = kpiService.getAllKpis();
        return ResponseEntity.ok(kpis);
    }
}
