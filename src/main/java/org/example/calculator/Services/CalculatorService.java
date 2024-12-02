package org.example.calculator.Services;

import org.example.calculator.ModelDtos.CalculationAttributes;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CalculatorService {

    public List<Character> operations(){
        List<Character> operationsList = new ArrayList<Character>();
        operationsList.add('+');
        operationsList.add('-');
        operationsList.add('*');
        operationsList.add('/');
        operationsList.add('%');
        return operationsList;
    }

public float output(CalculationAttributes attributes){
        switch (attributes.getOperation()){
            case '+': return attributes.getFirstParameter() + attributes.getSecondParameter();
            case '-': return attributes.getFirstParameter() - attributes.getSecondParameter();
            case '*': return attributes.getFirstParameter() * attributes.getSecondParameter();
            case '/': return attributes.getFirstParameter() / attributes.getSecondParameter();
            case '%': return attributes.getFirstParameter() % attributes.getSecondParameter();
            default: return 0;
        }
}

}
