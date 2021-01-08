**Method overloading challenge**

Create a method called calcFeetAndInchesToCentimeters. <br/>
It needs to have two parameters: feet and inches.

You should validate that the first parameter feet is >= 0.<br/>
You should validate that the 2nd parameter inches is >=0 and <=12.<br/>
Return -1 from the method if either of the above is not true.

If the parameters are valid, then calculate how many centimetres  comprise the feet and inches passed to this method
and return that value.

Create a second method with the same name but with only one parameter. <br/>
Inches is the parameter validate that its >=0. <br/>
Return -1 if it is not true.<br/>
But if its valid, then calculate how many feet are in the inches.<br/>

And then here is the tricky part, call the other overloaded method passing the correct feet and inches calculated so
that it can calculate correctly.

Hints: <br/>
Use double for your number datatypes is probably a good ideo. <br/>
1 inch = 2.54 cm  and one foot = 12 inches.<br/>
Calling another overloaded method just requires you to use the right number of parameters. 