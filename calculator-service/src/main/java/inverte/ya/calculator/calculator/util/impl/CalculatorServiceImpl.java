package inverte.ya.calculator.calculator.util.impl;

import inverte.ya.calculator.calculator.dto.CalculatorDTO;
import inverte.ya.calculator.calculator.service.ICalculatorService;
import inverte.ya.calculator.calculator.util.Helper;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements ICalculatorService
{
    @Override
    public double calculateMortgage(CalculatorDTO dto) {
        return Helper.calculateMortgage(dto.getPrincipal(), dto.getAnnualInterest(), dto.getPeriod());
    }
}
