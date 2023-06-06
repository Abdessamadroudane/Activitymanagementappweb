package com.example.Appweb.service;
import com.example.Appweb.entities.KpiValue;

import java.util.List;

public interface KpiValueService {
    KpiValue createKpiValue(KpiValue kpiValue);
    KpiValue updateKpiValue(KpiValue kpiValue);
    void deleteKpiValue(Integer kpiValueId);
    KpiValue getKpiValueById(Integer kpiValueId);
    List<KpiValue> getAllKpiValues();
}
