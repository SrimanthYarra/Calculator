package org.example.calculator.Controllers;

import org.example.calculator.ModelDtos.CalculationAttributes;
import org.example.calculator.ModelDtos.Operations;
import org.example.calculator.Services.CalculatorService;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

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
        model.addAttribute("operations", Operations.values());
        return "home";
    }



}
