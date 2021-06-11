## Static

In the Java programming language, the keyword static is used to share the same variable or method of a given class. This means that only one instance of that static member (variable or method) is created that is shared by all instances of the class.

Non-static (i.e., without the keyword static) means that there is a unique variable or method per object.

You use static to be more memory efficient. Example is the static main method.

Limit (as a beginning programmer) the use of static!

### Example

#### StaticStatement

_StaticTest.java_  <br/>
step 1: create new class StaticTest.java <br/>
step 2: variables <br/>
step 3: constructor <br/>
step 4: getters

_Main.java_ <br/>
step 5: create instances

#### StaticStatement2

_StaticTest.java_ <br/>
step 6: change into static

_Main.java_ <br/>
step 7: run first and second <br/>
step 8: create third one <br/>
step 9: thirdInstance has 'secondInstance' and it works

#### StaticStatement3

_StaticTest.java_ <br/>
step 10: change into static

_Main.java_ <br/>
step 11: change names

#### StaticStatement4

_Main.java_ <br/>
step 12: field in this class <br/>
step 13: method multiply <br/>
step 14: call the method <br/>
step 15: change into static<br/>
step 16: change into static