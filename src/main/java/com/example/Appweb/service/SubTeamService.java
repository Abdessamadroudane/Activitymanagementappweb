package com.example.Appweb.service;
import com.example.Appweb.entities.SubTeam;

import java.util.List;

public interface SubTeamService {
    SubTeam createSubTeam(SubTeam subTeam);
    SubTeam updateSubTeam(SubTeam subTeam);
    void deleteSubTeam(Integer subTeamId);
    SubTeam getSubTeamById(Integer subTeamId);
    List<SubTeam> getAllSubTeams();
    List<SubTeam> getSubTeamsByTeam(Integer teamId);
    List<SubTeam> getSubTeamsByActivity(Integer activityId);
}