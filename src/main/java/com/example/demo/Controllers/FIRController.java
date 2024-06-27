package com.example.demo.Controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.Entity.FIR;
import com.example.demo.Services.FIRService;

import javax.validation.Valid;

@Controller
public class FIRController {
    @Autowired
    private FIRService firService;

    @GetMapping("/fir-form")
    public String showFIRForm(Model model) {
        model.addAttribute("fir", new FIR());
        return "fir-form";
    }

    @PostMapping("/fir-form")
    public String submitFIR(@Valid @ModelAttribute("fir") FIR fir, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "fir-form";
        }
        firService.saveFIR(fir);
        return "redirect:/report";
    }
}




