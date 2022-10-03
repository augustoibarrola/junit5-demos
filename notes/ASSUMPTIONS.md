# Assumptions

Assumptions are normally used at any time it does not make sense to continue the executiuon if a given test method without satisfying some conditions.

A failed assumption results in a test being aborted in the test report.  
These tests will be marked as passed.

All JUnit Jupiter assumptions are static methods from `org.junit.jupiter.api.Assumptions` class. 

| Methods | Descriptions |
| --- | --- |
| assumeFalse(boolean assumption) | Confirms that the given assumption is false |
| assumeTrue(boolean assumption) | Confirms that the given assumption is true |
| assumingThat(boolean assumption, Executable executable) | Performs the given executable only if the assumption provided is valid |