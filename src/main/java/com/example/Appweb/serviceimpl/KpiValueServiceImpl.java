package com.example.Appweb.serviceimpl;
import com.example.Appweb.entities.KpiValue;
import com.example.Appweb.repositories.KpiValueRepository;
import com.example.Appweb.service.KpiValueService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KpiValueServiceImpl implements KpiValueService {
    private final KpiValueRepository kpiValueRepository;

    public KpiValueServiceImpl(KpiValueRepository kpiValueRepository) {
        this.kpiValueRepository = kpiValueRepository;
    }

    @Override
    public KpiValue createKpiValue(KpiValue kpiValue) {
        return kpiValueRepository.save(kpiValue);
    }

    @Override
    public KpiValue updateKpiValue(KpiValue kpiValue) {
        return kpiValueRepository.save(kpiValue);
    }

    @Override
    public void deleteKpiValue(Integer kpiValueId) {
        kpiValueRepository.deleteById(kpiValueId);
    }

    @Override
    public KpiValue getKpiValueById(Integer kpiValueId) {
        return kpiValueRepository.findById(kpiValueId).orElse(null);
    }

    @Override
    public List<KpiValue> getAllKpiValues() {
        return kpiValueRepository.findAll();
    }
}
