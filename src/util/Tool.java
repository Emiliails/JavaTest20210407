package util;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Tool 
{
	//4种方法，都是四舍五入
    public static double m1(double f) 
    {
        BigDecimal bg = new BigDecimal(f);
        double d1 = bg.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        //System.out.println(f1);
        return d1;
    }
    
    /**
     * DecimalFormat转换最简便
     */
    public static double m2(double f) 
    {
        DecimalFormat df = new DecimalFormat("#.00");
        double d1=Double.parseDouble(df.format(f));
        //System.out.println(df.format(f));
        return d1;
    }
    
    /**
     * String.format打印最简便
     */
    public static double m3(double f) 
    {
    	double d1=Double.parseDouble(String.format("%.2f", f));
    	//System.out.println(String.format("%.2f", f));
    	return d1;
    }
    
    public static double m4(double f) 
    {
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(2);
        double d1=Double.parseDouble(nf.format(f));
        //System.out.println(nf.format(f));
        return d1;
    }

	/** Default constructor */
	public Tool() {
	}
}