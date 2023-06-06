package com.example.Appweb.serviceimpl;

import com.example.Appweb.entities.Kpi;
import com.example.Appweb.repositories.KpiRepository;
import com.example.Appweb.service.KpiService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KpiServiceImpl implements KpiService {
    private final KpiRepository kpiRepository;

    public KpiServiceImpl(KpiRepository kpiRepository) {
        this.kpiRepository = kpiRepository;
    }

    @Override
    public Kpi createKpi(Kpi kpi) {
        return kpiRepository.save(kpi);
    }

    @Override
    public Kpi updateKpi(Kpi kpi) {
        return kpiRepository.save(kpi);
    }

    @Override
    public void deleteKpi(Integer kpiId) {
        kpiRepository.deleteById(kpiId);
    }

    @Override
    public Kpi getKpiById(Integer kpiId) {
        return kpiRepository.findById(kpiId).orElse(null);
    }

    @Override
    public List<Kpi> getAllKpis() {
        return kpiRepository.findAll();
    }
}
