package com.example.Appweb.serviceimpl;

import com.example.Appweb.entities.Team;
import com.example.Appweb.repositories.TeamRepository;
import com.example.Appweb.service.TeamService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamServiceImpl implements TeamService {

    private TeamRepository teamRepository;

    public TeamServiceImpl(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    @Override
    public Team createTeam(Team team) {
        return teamRepository.save(team);
    }

    @Override
    public Team updateTeam(Team team) {
        return teamRepository.save(team);
    }

    @Override
    public void deleteTeam(Integer teamId) {
        teamRepository.deleteById(teamId);
    }

    @Override
    public Team getTeamById(Integer teamId) {
        return teamRepository.findById(teamId).orElse(null);
    }

    @Override
    public List<Team> getAllTeams() {
        return teamRepository.findAll();
    }

    @Override
    public List<Team> getTeamsByUser(String userName) {
        return null;
    }

    @Override
    public List<Team> getTeamsBySubTeam(String subTeamName) {
        return null;
    }


}
