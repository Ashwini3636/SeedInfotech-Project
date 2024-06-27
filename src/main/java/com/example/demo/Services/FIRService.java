package com.example.demo.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.FIR;
import com.example.demo.Repositories.FIRRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class FIRService {
    @Autowired
    private FIRRepository firRepository;

    public FIR saveFIR(FIR fir) {
        fir.setDateTimeOfFIR(LocalDateTime.now());
        return firRepository.save(fir);
    }

    public List<FIR> getAllFIRs() {
        return firRepository.findAll();
    }

    public FIR getFIRById(Long id) {
        return firRepository.findById(id).orElse(null);
    }

    public void deleteFIR(Long id) {
        firRepository.deleteById(id);
    }
}




