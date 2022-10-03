# Test Fixtures

Test fixtures can contain a common set of statements to be executed and can be used by several tests. Test fixtures can handle common resources required by tests.

Examples of test fixutres are

- To prepare input data or creatre a mock object
- To load the database with some specific values
- To copy some set of files
  
Test Fixtures are supported by annotations from the `org.junit.jupiter.api` package: `@BeforeAll`, `@AfterAll`, `@BeforeEach`, `@AfterEach`. 

| Annotations | Descriptions |
| --- | --- |
| @BeforeAll | Annotated methods **run only once**. <br><br> Annotated methods **are always `static` methods**. <br><br> It is expected to execute before all test methods of the test class is executed. |
| @AfterAll | Annotated methods **run only once**. <br><br> Annotated methods **are always `static` methods**. <br><br> It is expected to execute after all test methods of the test class is executed. |
| @BeforeEach | Annotated methods **run before each test**. <br><br> Helpful for initialization of variables and resources. |
| @AfterEach | Annotated methods **run after each test**. <br><br> Helpful for releasing variables and resources initialized with `@BeforeEach`. |


`TestInfo`
---
`TestInfo` is an interface in `org.junit.juputer.api` used to inject information about the current test or container into `@BeforeAll`, `@AfterAll`, `@BeforeEach`, `@AfterEach`, and `@Test` annotated methods. These methods can take arhuments as `TestInfo` which is used to get the information about the test.