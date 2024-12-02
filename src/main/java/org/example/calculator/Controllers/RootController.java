package org.example.calculator.Controllers;

import org.example.calculator.ModelDtos.CalculationAttributes;
import org.example.calculator.Services.CalculatorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class RootController {

    private  CalculatorService calculatorService;

    public RootController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
    @GetMapping
    public String homePage(Model model) {
        model.addAttribute("calculationattributes", new CalculationAttributes());
        model.addAttribute("operations", calculatorService.operations());
        return "home";
    }

}
