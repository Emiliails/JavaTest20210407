package calc;

import java.util.Arrays;

public class Calculator {

    //传入1+2+3，完成累加
    public int calculateInt(String expression) {
        //3null
        if (expression == null)
            throw new NullPointerException("expression is null.");

        String[] strArray = expression.split("\\+");
        //System.out.println(expression+"=>"+Arrays.toString(strArray));

        int sum = 0;
        for (String str : strArray) {
            //1空格
            //2长度为0的字符串
            str = str.trim();
            if (str.equals(""))
                throw new NumberFormatException("expression is Zero Length.");

            sum = sum + Integer.parseInt(str);
            //sum=sum+Integer.parseInt(str.trim());
        }

        return sum;
    }

    public double calculateDouble(String expression) {
        String[] strArray = expression.split("\\+");
        //System.out.println(expression+"=>"+Arrays.toString(strArray));

        double sum = 0;
        for (String str : strArray) {
            sum = sum + Double.parseDouble(str.trim());    //TDD思想
        }

        return sum;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Calculator calc = new Calculator();
        int sum = calc.calculateInt("1+2+3");
        System.out.println(sum);

        double dsum = calc.calculateDouble("1.1+20");
        System.out.println(dsum);
    }
}