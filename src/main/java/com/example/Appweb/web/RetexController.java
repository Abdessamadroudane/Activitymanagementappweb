package com.example.Appweb.web;

import com.example.Appweb.entities.Retex;
import com.example.Appweb.service.RetexService;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/retex")
public class RetexController {

    private final RetexService retexService;

    public RetexController(RetexService retexService) {
        this.retexService = retexService;
    }

    @PostMapping
    public ResponseEntity<Retex> createRetex(@RequestBody Retex retex) {
        Retex createdRetex = retexService.createRetex(retex);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdRetex);
    }

    @PutMapping("/{retexId}")
    public ResponseEntity<Retex> updateRetex(@PathVariable Integer retexId, @RequestBody Retex retex) {
        Retex existingRetex = retexService.getRetexById(retexId);
        if (existingRetex == null) {
            return ResponseEntity.notFound().build();
        }
        retex.setId(retexId);
        Retex updatedRetex = retexService.updateRetex(retex);
        return ResponseEntity.ok(updatedRetex);
    }

    @DeleteMapping("/{retexId}")
    public ResponseEntity<Void> deleteRetex(@PathVariable Integer retexId) {
        Retex existingRetex = retexService.getRetexById(retexId);
        if (existingRetex == null) {
            return ResponseEntity.notFound().build();
        }
        retexService.deleteRetex(retexId);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{retexId}")
    public ResponseEntity<Retex> getRetexById(@PathVariable Integer retexId) {
        Retex retex = retexService.getRetexById(retexId);
        if (retex == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(retex);
    }

    @GetMapping
    public ResponseEntity<List<Retex>> getAllRetexes() {
        List<Retex> retexes = retexService.getAllRetexes();
        return ResponseEntity.ok(retexes);
    }
}
