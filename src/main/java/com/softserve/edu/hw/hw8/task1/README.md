# Java Core

**Homework-8 Nested Inner Classes**

## Task-1 :
- Develop a FullName class with the firstName and lastName fields of type String, which would correspond to the principle of encapsulation.
- Create an abstract Person class with fullName field of type FullName and age of type int.
- In the Person class, create:
  - constructor: public Person(FullName fullName, int age)
  - method: info(), which will return a string in the format "First name: <firstName>, Last name: <lastName>, Age: <age>"
  - method: abstract public activity() with a String return type.
- Develop a Student class with an int field that matches the course the student is taking.
- In the Student class, create a constructor with parameters to initialize all fields in the class, 
and override the info()method (which would also add course information to the previous line), 
and the activity() method from the Person class. 
The activity() method should return a string value that is the type of activity 
for the corresponding Person subtype, for example for a student - this could be the value "I study at university".
- In the main(...) method, create two instances of the Student class and 
output information about them by calling the appropriate methods info() and activity().

Main.java Output :
![ScreenShot](output.png)

Class Diagram :
![ScreenShot](student_uml.png)