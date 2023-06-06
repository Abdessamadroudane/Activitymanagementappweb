package com.example.Appweb.web;

import com.example.Appweb.entities.SubTeam;
import com.example.Appweb.service.SubTeamService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/subteams")
public class SubTeamController {

    private final SubTeamService subTeamService;

    public SubTeamController(SubTeamService subTeamService) {
        this.subTeamService = subTeamService;
    }

    @PostMapping
    public ResponseEntity<SubTeam> createSubTeam(@RequestBody SubTeam subTeam) {
        SubTeam createdSubTeam = subTeamService.createSubTeam(subTeam);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdSubTeam);
    }

    @PutMapping("/{subTeamId}")
    public ResponseEntity<SubTeam> updateSubTeam(@PathVariable Integer subTeamId, @RequestBody SubTeam subTeam) {
        SubTeam existingSubTeam = subTeamService.getSubTeamById(subTeamId);
        if (existingSubTeam == null) {
            return ResponseEntity.notFound().build();
        }
        subTeam.setId(subTeamId);
        SubTeam updatedSubTeam = subTeamService.updateSubTeam(subTeam);
        return ResponseEntity.ok(updatedSubTeam);
    }

    @DeleteMapping("/{subTeamId}")
    public ResponseEntity<Void> deleteSubTeam(@PathVariable Integer subTeamId) {
        SubTeam existingSubTeam = subTeamService.getSubTeamById(subTeamId);
        if (existingSubTeam == null) {
            return ResponseEntity.notFound().build();
        }
        subTeamService.deleteSubTeam(subTeamId);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{subTeamId}")
    public ResponseEntity<SubTeam> getSubTeamById(@PathVariable Integer subTeamId) {
        SubTeam subTeam = subTeamService.getSubTeamById(subTeamId);
        if (subTeam == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(subTeam);
    }

    @GetMapping
    public ResponseEntity<List<SubTeam>> getAllSubTeams() {
        List<SubTeam> subTeams = subTeamService.getAllSubTeams();
        return ResponseEntity.ok(subTeams);
    }
}
