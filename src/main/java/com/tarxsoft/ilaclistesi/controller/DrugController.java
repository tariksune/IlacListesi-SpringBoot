package com.tarxsoft.ilaclistesi.controller;

import com.tarxsoft.ilaclistesi.entity.Drug;
import com.tarxsoft.ilaclistesi.exception.ResourceNotFoundException;
import com.tarxsoft.ilaclistesi.repository.DrugRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/drugs")
public class DrugController {

    @Autowired
    private DrugRepository drugRepository;

    @GetMapping
    public List<Drug> getAllQuotes(){
        return drugRepository.findAll();
    }

    @GetMapping("/{id}")
    public Drug getDrugById(@PathVariable(value = "id") long drugId) {
        return this.drugRepository.findById(drugId).orElseThrow(() -> new ResourceNotFoundException("İlaç bulunamadı: "+drugId));
    }

    @PostMapping
    public Drug addDrug(@RequestBody Drug drug) {
        return this.drugRepository.save(drug);
    }

    @PutMapping("/{id}")
    public Drug updateDrug(@RequestBody Drug drug, @PathVariable ("id") long drugId){
        Drug existingDrug = this.drugRepository.findById(drugId).orElseThrow(() -> new ResourceNotFoundException("İlaç bulunamadı: "+drugId));
        existingDrug.setDrugName(drug.getDrugName());
        existingDrug.setDrugActiveSubstance(drug.getDrugActiveSubstance());
        existingDrug.setDrugCompany(drug.getDrugCompany());
        existingDrug.setDrugBarcode(drug.getDrugBarcode());
        existingDrug.setDrugImage(drug.getDrugImage());
        return this.drugRepository.save(existingDrug);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Drug> deleteQuote(@PathVariable ("id") long drugId){
        Drug existingDrug = this.drugRepository.findById(drugId).orElseThrow(() -> new ResourceNotFoundException("İlaç bulunamadı: "+drugId));
        this.drugRepository.delete(existingDrug);
        return ResponseEntity.ok().build();
    }
}
