package com.example.Appweb.serviceimpl;
import com.example.Appweb.entities.SubTeam;
import com.example.Appweb.repositories.SubTeamRepository;
import com.example.Appweb.service.SubTeamService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubTeamServiceImpl implements SubTeamService {
    private final SubTeamRepository subTeamRepository;

    public SubTeamServiceImpl(SubTeamRepository subTeamRepository) {
        this.subTeamRepository = subTeamRepository;
    }

    @Override
    public SubTeam createSubTeam(SubTeam subTeam) {
        return subTeamRepository.save(subTeam);
    }

    @Override
    public SubTeam updateSubTeam(SubTeam subTeam) {
        return subTeamRepository.save(subTeam);
    }

    @Override
    public void deleteSubTeam(Integer subTeamId) {
        subTeamRepository.deleteById(subTeamId);
    }

    @Override
    public SubTeam getSubTeamById(Integer subTeamId) {
        return subTeamRepository.findById(subTeamId).orElse(null);
    }

    @Override
    public List<SubTeam> getAllSubTeams() {
        return subTeamRepository.findAll();
    }

    @Override
    public List<SubTeam> getSubTeamsByTeam(Integer teamId) {
        return null;
    }

    @Override
    public List<SubTeam> getSubTeamsByActivity(Integer activityId) {
        return null;
    }
}
