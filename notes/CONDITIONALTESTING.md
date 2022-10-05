# Conditional Testing

Tests can be enabled/disabled depending on certain criteria (i.e., "conditions"). There are four conditions based on which a test class or method can be secured: 

1. Operating System Conditions
2. Java Runtime Environment Conditions
3. System Property Conditions
4. Environment Variabl Conditions

| # | Condition | | |
| ---- | ---- | ----| ---- |
| 1 | Operating System | | – Enable or disable test cases/containers/methods based on the OS on which the test is running. |
| | | `@EnabledOnOs` | | |
| | | `@DisabledOnOs` | | |
| 2 | Java Runtime Environment | | – Enable or disable test cases/containers/methods based on the JRE on which the test is running. |
| | | `@EnabledOnJre` | | |
| | | `@DisabledOnJre` | | |
| | | `@EnabledForJreRange` | | |
| | | `@DisabledForJreRange` | | |
| 3 | System Property | |  – Enable or disable test cases/containers/methods based on the configured JVM system properties on which the test is running. |
| | | `@EnabledIfSystemProperties` | | |
| | | `@DisabledIfSystemProperties` | | |
| 4 | Environment Variable | | – Enable or disable test cases/containers/methods based on the configured environment variables of the OS on which the test is running. |
| | | `@EnabledIfEnvironmentVariable` | | |
| | | `@DisabledIfEnvironmentVariable` | | |
