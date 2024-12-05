package org.example.calculator.Controllers;

import jakarta.mail.MessagingException;
import org.example.calculator.ModelDtos.CalculationAttributes;
import org.example.calculator.Services.CalculatorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/calculate")
public class CalculationController {

    private CalculatorService calculatorService;

    public CalculationController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String EndResult(@ModelAttribute("calculationattributes") CalculationAttributes
                                        calculationattributes, Model model) throws MessagingException {
        model.addAttribute("output",""+calculatorService.generateOutput(calculationattributes));
        return "success";
    }
}
