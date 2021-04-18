package tax;

import util.Tool;
import exception.TaxException;

public class PersonalTax {
    //新增加字符串属性和get方法
    private String name = "个人所得税计算方法";

    public String getName() {
        return name;
    }

    //被测方法
    public double getIncome(String salary) {
        // 税前工资金额 sal
        double sal = 0;
        try {
            sal = Double.parseDouble(salary);
            if (sal < 0) {
                throw new TaxException(TaxException.CAN_NOT_LESS_THAN_ZERO);
            } else if (sal > 1000000) {
                throw new TaxException(TaxException.CAN_NOT_MORE_THAN_ONE_MILLION);
            }
        } catch (NumberFormatException numberFormatException) {
            throw new TaxException(TaxException.MUST_BE_NUMBER);
        }

        // 应纳税所得额 incomeForTax
        double incomeForTax = sal - 5000;

        // 实际工资收入 actualIncome
        double actualIncome = 0;

        // 应缴税额 tax
        double tax = 0;
        if (incomeForTax <= 0) {
            tax = 0;
        } else if (incomeForTax > 0 && incomeForTax <= 3000) {
            tax = incomeForTax * 0.03 - 0;


        } else if (incomeForTax > 3000 && incomeForTax <= 12000) {
            tax = incomeForTax * 0.1 - 210;


        } else if (incomeForTax > 12000 && incomeForTax <= 25000) {
            tax = incomeForTax * 0.2 - 1410;


        } else if (incomeForTax > 25000 && incomeForTax <= 35000) {
            tax = incomeForTax * 0.25 - 2660;


        } else if (incomeForTax > 35000 && incomeForTax <= 55000) {
            tax = incomeForTax * 0.3 - 4410;


        } else if (incomeForTax > 55000 && incomeForTax <= 80000) {
            tax = incomeForTax * 0.35 - 7160;


        } else if (incomeForTax > 80000 && incomeForTax <= 1000000) {
            tax = incomeForTax * 0.45 - 15160;

        }
        actualIncome = sal - tax;
        return actualIncome;
    }
}