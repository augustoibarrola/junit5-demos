# Test Suite

Runs multiple test cases spread over multiple classes and packages at the same time so that one does not have to execute each one of those test cases manually. 

A Test Suite is a collection of multiple packages or classes that allows for execution of test cases in multiple packages and classes.

Test Suites are created primarily with annotations `@SelectPackages` (along with `@IncludePackages` and `@ExcludePackages`) and `@SelectClasses` (along with `@IncludeClassNamePatterns` and `@ExcludeClassNamePatterns`). 

When using the annotation `@RunWith(JUnitPlatform.class)` to run a Test Suite, the classes that are annotated with same cannot be executed directly as a JUnit 5 test suite; they use JUnit 4 architecture.

By default, classes that end with 'Test'/'Tests' in a package included inside `@SelectedPackages` annotation will be considered for execution unless otherwise specified. 


`@SelectPackages`
---

```java
@Runwith(JUnitPlatform.class)

@SelectedPackages(com.ger.additionTest)

public class SuiteTest{

}
```

```java
/* Specify multiple package names in the form of 
*  an array of strings inside curly braces.
*/
@Runwith(JUnitPlatform.class)

@SelectedPackages({"com.ger.additionTest", "com.ger.multiplicationTest", "com.ger.divisionTest"})

public class SuiteTest{
    
}
```

`@SelectClasses`
---

```java
@Runwith(JUnitPlatform.class)

@SelectClasses(CalculatorMultiplicationTest.class)

public class ClassTest{

}
```

```java
@Runwith(JUnitPlatform.class)

@SelectClasses({CalculatorMultiplicationTest.class, CalculatorAdditionTest.class})

public class ClassTest{
    
}
```