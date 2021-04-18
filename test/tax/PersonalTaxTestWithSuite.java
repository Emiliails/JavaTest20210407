package tax;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({PersonalTaxExceptionTest.class, PersonalTaxTest.class,
        PersonalTaxWithBoundaryTest.class, PersonalTaxWithPathTest.class,PersonalTaxByParamsTest.class})
public class PersonalTaxTestWithSuite {

}