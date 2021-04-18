package exception;

public class TaxException extends RuntimeException {

    public static String CAN_NOT_LESS_THAN_ZERO = "税前工资金额不能小于0";
    public static String CAN_NOT_MORE_THAN_ONE_MILLION = "税前工资金额不能大于100万";
    public static String MUST_BE_NUMBER = "税前工资金额必须输入数字";

    public TaxException() {
        super();
    }

    public TaxException(String message) {
        super(message);
    }
}