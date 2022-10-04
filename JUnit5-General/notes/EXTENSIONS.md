# Extensions

JUnit principles prefer extensions over features. Extensions provide additional functionality to all test methods of a test class while being defined outside the test class. 

In Java, extension points are callback interfaces and extensions are their implementations. An extension can be created by implementing any callback interface.

`ExtensionContext` class is used to fetch various details of test methods. 

Extensions can be registered in three ways: 

| # | Implementation | Description |
| --- | --- | --- |
| 1 |  `@ExtendWith` | – Declarative <br> – Can be used to extend multiple classes <br> – Can be used at the class or method level |
| 2 | `@RegisterExtension` | – Programmatic <br> – Can be used on the fields of the test class |
| 3 | Service Loader| – Automatic | 