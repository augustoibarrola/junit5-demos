# Quiz 

## 1
Identiy the correct sequence for Testing

## 2

Which of the follwing components is used to provide backward compatibility in JUnit5
- [ ] JUnit Platform
- [ ] JUnit Vintage
- [ ] JUnit Jupiter
- [ ] API JAR

## 3
Which of the following is the correct way of including Suite classes in JUnit 5? 
- [ ] `@SuiteClasses({TestClass1.class, TestClass1.class})`
- [ ] `@SuiteClasses({"TestClass1", "TestClass2"})`
- [ ] `@SelectClasses({TestClass1.class, TestClass1.class})`
- [ ] `@SelectClasses({"TestClass1", "TestClass2"})`

## 4
Which of the following Rules from JUnit 4 are supported by JUnit Jupiter? 
- [ ] `org.junit.rules.ExternalResource`
- [ ] `org.junit.rule.TemporaryFolder`
- [ ] `org.junit.rules.ExpectedException`
- [ ] `org.junit.rule.ErrorCollector`

## 5
What is the output of the below code in the output console? 

```java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

class Sample {
    String completed = "completed";

    @AfterAll
    public static void before(){
        System.out.print("completed");
    }

    @Test
    public void test1(){
        System.out.print("test1");
        assertEquals(1, 1);
    }

    @Test
    public void test2(){
        System.out.print("test2");
        assertEquals(2, 1);
    }
}
```

## 6
How many test cases will pass for the below code? 

```java
import static org.junit.jupiter.api.Assertions.*;
import java.math.BigDecimal;
import org.junit.jupiter.api.Test;

class TestDemo {
    BigDecimal b1 = new BigDecimal("1.0");
    BigDecimal b2 = new BigDecimal("1.0");
    BigDecimal b3 = b1;

    @Test
    public void BigDecimaltest1() throws Exception {
        assertSame(b1, b2);
    }

    @Test
    public void BigDecimaltest2() throws Exception{
        assertEquals(b1, b2);
    }

    @Test
    public void BigDecimaltest3() throws Exception {
        assertEquals(b1, b3);
    }

    @Test
    public void BigDecimaltest4() throws Exception {
        assertEquals(b1, b3);
    }
}
```

## 7
Which of the following cannot be returned by a method annotated with `@TestFactory` for DynamicTest instances?
- [ ] Array
- [ ] Stream
- [ ] Collection
- [ ] Iterator

## 8 
Assume there is on test case in each `com.ger.*` classes. How many test cases will run upon executing the below code? 

```java
@RunWith(JUnitPlatform.class)
@SelectPackages({"com.ger.TestClass1", "com.ger.TestClass2"})
public class SuiteTest {
    
    @Test
    void additionValidTest(){
        assertTrue(true);
    }
}
```

## 9 
What will be the output of the below code?

```java
@RunWith(Parameterized.class)
class ParameterizedTest{

    private int a;
    private int b;
    
    public ParameterizedTest(int a, int b) {
        this.a = a;
        this.b = b;
    }

    private static Collection testData(){
        return Arrays.asList(new Object[][] {{1, 2}, {5}, {3, 3}});
    }

    @Test
    public void test1(){
        assertTrue(a == b)'
    }
}
```

## 10
Choose the correct option(s) based on the replacements of JUnit 4 annotations with JUnit Jupiter annotations

i. `@Category` -> `@Tag`, `@RunWith` -> `@ExtendWith`, `@ClassRule` -> `@RegisterExtension`, `@Rule` -> `@ExtendWith`  
ii. `@Before` -> `@BeforeEach`, `@After` -> `@AfterEach`, `@Rule` -> `@RegisterExtension`, `@ClassRule` -> `@RegisterExtension`
iii. `@BeforeClass` -> `@BeforeAll` , `@Category` -> `@Tagged`, `@Rule` -> `@ExtendWith`, `@Ignore` -> `@Disabled`

## 11
Which of the following component is used to provide APIs to run test cases in JUnit5? 
- [ ] JUnit Platform
- [ ] JUnit Vintage
- [ ] JUnit Jupiter
- [ ] API JAR

## 12
Which package provides the `@Disabled` annotation? 

## 13
What is the output of the below code? 

```java
class DemoTest {
    static String a;

    @BeforeAll
    public static void init(){
        a = "one";
    }

    @Test
    public void test1(){
        assertEquals("one", a);
    }
}