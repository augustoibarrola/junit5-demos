# Assertions

- All JUnit Jupiter assertions are static methods from `org.junit.jupiter.api.Assertions` class. 

| Methods | Descriptions |
| --- | --- |
| fail() | To make the test case as failed without any failure message |
| assertTrue(boolean condition) | Checks that the provided condition is true |
| assertFalse(boolean condition) | checks that the provided condition is false |
| assertEquals(Object expectedObject, Object actualObject) | Checks that the expectedObject and the actualObject are equal | 
| assertNotEquals(Object unexpectedObject, Object, actualObject) | Checks if the expected and actual object are not equal |
| assertNull(Object actualObject) | Checks if an object is null |
| asserNotNull(Object actualObject) | Checks if an object is not null | 
| assertSame(Object expecteObject, Object actualObject) | Checks if two object refrences are pointing to the same object | 
| assertNotSame(Object unexpectedObject, Object actualObject) | Checks if two object refrences are not pointing to the same object |
| assertArrayEquals(Object[] expectedObjects, Object[] actualObjects) | Checks if expected array and actual array are equal to each other.
