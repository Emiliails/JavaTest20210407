/**
 * 参数化测试
 * 1. 为测试类指定特殊运行器org.junit,runner.Parameterized
 * 在测试类上做标注@RunWith(Parameterized.class)
 * 2. 测试类里声明成员变量保存测试数据和期望值
 * 3. 声明一个公有静态方法，返回类型必须是Collection，初始化要测试的数据
 * 4. 声明构造方法，参数为2中定义的成员变量，参数赋值顺序为3中初始化的参数
 * 5. 编写测试用例，用当前初始化的参数进行测试
 */
package calc;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ComplexityByParamsTest {
    Complexity complexity = null;

    //    定义成员变量
    private int expert;
    private int input1;
    private int input2;

    /**
     * 1. 方法有注解Parameters
     * 2. 方法必须是public static
     * 3. 方法返回值类型是Collection
     * 4. 方法名任意
     * 5. 方法无参
     */

    @Parameterized.Parameters
    public static Collection prepareData() {
        Object[][] obj = {{0, -1, 10}, {2, 1, 0}, {5, 2, 1}, {10, 3, 2}};
        return Arrays.asList(obj);
    }

    //    有参构造方法
    public ComplexityByParamsTest(int expert, int input1, int input2) {
        this.expert = expert;
        this.input1 = input1;
        this.input2 = input2;
    }

    @AfterClass
    public static void afterClass() throws Exception {

    }

    @BeforeClass
    public static void beforeClass() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
        complexity = null;
    }

    @Before
    public void setUp() throws Exception {
        complexity = new Complexity();
    }

    @Test
    public void testSort() {
        int num = complexity.sort(input1, input2);
        assertEquals(expert, num);
    }
}
