package com.example.demo.Controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.Entity.FIR;
import com.example.demo.Services.FIRService;

@Controller
public class ReportController {
    @Autowired
    private FIRService firService;

    @GetMapping("/report")
    public String showReport(Model model) {
        model.addAttribute("firs", firService.getAllFIRs());
        return "report";
    }

    @GetMapping("/report/edit/{id}")
    public String editFIR(@PathVariable Long id, Model model) {
        FIR fir = firService.getFIRById(id);
        model.addAttribute("fir", fir);
        return "fir-form";
    }

    @PostMapping("/report/delete/{id}")
    public String deleteFIR(@PathVariable Long id) {
        firService.deleteFIR(id);
        return "redirect:/report";
    }

    // Export to Excel functionality can be implemented here.
}



