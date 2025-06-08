package com.web.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.model.CandidateStatus;
import com.web.model.MyModel;
import com.web.repo.MyRepo;

@RestController
@RequestMapping("/api/candidates")
@CrossOrigin("*")
public class MyController {

    @Autowired
    private MyRepo repo;

    @PostMapping
    public ResponseEntity<MyModel> addCandidate(@RequestBody MyModel candidate) {
        candidate.setStatus(CandidateStatus.PENDING);
        return ResponseEntity.ok(repo.save(candidate));
    }

    @GetMapping
    public List<MyModel> getAll() {
        return repo.findAll();
    }

    @PutMapping("/{id}/status")
    public ResponseEntity<MyModel> updateStatus(
            @PathVariable String id,
            @RequestBody Map<String, String> body) {

        Optional<MyModel> optional = repo.findById(id);
        if (optional.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        MyModel c = optional.get();
        try {
            CandidateStatus newStatus = CandidateStatus.valueOf(body.get("status").toUpperCase());
            c.setStatus(newStatus);
            return ResponseEntity.ok(repo.save(c));
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        repo.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}