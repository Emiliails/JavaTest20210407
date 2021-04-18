package calc;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({CalculatorExceptionTest.class, ComplexityByParamsTest.class,
        ComplexityWithBoundaryTest.class, ComplexityWithPathTest.class})
public class AllTestSuite {
}
