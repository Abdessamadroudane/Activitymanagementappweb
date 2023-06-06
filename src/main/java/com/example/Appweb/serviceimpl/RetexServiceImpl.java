package com.example.Appweb.serviceimpl;
import com.example.Appweb.entities.Retex;
import com.example.Appweb.repositories.RetexRepository;
import com.example.Appweb.service.RetexService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RetexServiceImpl implements RetexService {
    private final RetexRepository retexRepository;

    public RetexServiceImpl(RetexRepository retexRepository) {
        this.retexRepository = retexRepository;
    }

    @Override
    public Retex createRetex(Retex retex) {
        return retexRepository.save(retex);
    }

    @Override
    public Retex updateRetex(Retex retex) {
        return retexRepository.save(retex);
    }

    @Override
    public void deleteRetex(Integer retexId) {
        retexRepository.deleteById(retexId);
    }

    @Override
    public Retex getRetexById(Integer retexId) {
        return retexRepository.findById(retexId).orElse(null);
    }

    @Override
    public List<Retex> getAllRetexes() {
        return null;
    }

    @Override
    public List<Retex> getRetexesByUser(Integer userId) {
        return null;
    }

    @Override
    public List<Retex> getRetexesByProject(Integer projectId) {
        return null;
    }

    @Override
    public List<Retex> getAllRetex() {
        return retexRepository.findAll();
    }
}
