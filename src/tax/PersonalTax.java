package tax;

import util.Tool;
import exception.TaxException;

public class PersonalTax 
{
	//新增加字符串属性和get方法
	private String name="个人所得税计算方法";
	
	public String getName() {
		return name;
	}

	//被测方法
	public double getIncome(String sSalry)
	{
		return 0;
	}
}