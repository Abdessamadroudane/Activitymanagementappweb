package com.example.Appweb.service;
import com.example.Appweb.entities.Kpi;

import java.util.List;

public interface KpiService {
    Kpi createKpi(Kpi kpi);
    Kpi updateKpi(Kpi kpi);
    void deleteKpi(Integer kpiId);
    Kpi getKpiById(Integer kpiId);
    List<Kpi> getAllKpis();
}
