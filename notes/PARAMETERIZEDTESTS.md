# Parameterized Tests

Parameterized tests provide multiple inputs, as well as from various sources. These tests help to automate thge process of providing different arguments and running the test multiple times. They help to reduce the number of test cases involved for specific funtionality. 

At least one source from which all arguments are provided to the parameterized test must be provided.

Parameterized tests replace the ~~`@Test`~~ annotation with `@ParameterizedTest`.

| Annotations | Descriptions |
| --- | --- |
| `@CsvSource()` | Used when the input data is expressed as comma-seperated values (i.e., String literals) |
| `@CsvFileSource` | Used when the input data is read from a CSV file relative to the classpath's location. The parameterized test is invoked for each line in that CSV file.|
| `@ValueSource` | |
| `@EnumSource` | |
| `@MethodSource` | |
| `@ArgumentsSource` | | 