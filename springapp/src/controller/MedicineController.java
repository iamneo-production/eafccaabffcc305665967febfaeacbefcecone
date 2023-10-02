package com.example.demo.controller;

import com.example.demo.model.Medicine;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/medicines")
public class MedicineController {

    private Map<Integer, Medicine> medicineMap = new HashMap<>();
    private int nextMedicineId = 1;

    @PostMapping
    public boolean addMedicine(@RequestBody Medicine medicine) {
        // Generate a unique ID for the medicine
        medicine.setMedicineld(nextMedicineId);
        nextMedicineId++;

        // Add the medicine to the map
        medicineMap.put(medicine.getMedicineld(), medicine);

        return true;
    }

    @PutMapping("/{medicineld}")
    public Medicine updateMedicine(@PathVariable int medicineld, @RequestBody Medicine updatedMedicine) {
        // Check if the medicine with the given ID exists
        if (medicineMap.containsKey(medicineld)) {
            // Update the medicine with the new details
            Medicine medicine = medicineMap.get(medicineld);
            medicine.setMedicineName(updatedMedicine.getMedicineName());
            medicine.setPrice(updatedMedicine.getPrice());
            medicine.setQuantity(updatedMedicine.getQuantity());
            medicine.setDescription(updatedMedicine.getDescription());

            return medicine;
        } else {
            // Medicine not found, return null or handle the error as needed
            return null;
        }
    }
}
