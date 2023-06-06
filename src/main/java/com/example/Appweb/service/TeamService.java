package com.example.Appweb.service;
import com.example.Appweb.entities.Team;

import java.util.List;

public interface TeamService {
    Team createTeam(Team team);
    Team updateTeam(Team team);
    void deleteTeam(Integer teamId);
    Team getTeamById(Integer teamId);
    List<Team> getAllTeams();
    List<Team> getTeamsByUser(String userName);
    List<Team> getTeamsBySubTeam(String subTeamName);
}
