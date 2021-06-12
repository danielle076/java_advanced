## Associative relationships

Association is a relation of one class to another class, various forms:
- Association
- Aggregation
- Composition

### Association

Associations are relationships between classes.

Association in Java is a connection or relation between two separate classes that are set up through their objects. Association relationship indicates how objects know each other and how they are using each other's functionality. It can be one-to-one, one-to-many, many-to-one and many-to-many.

Example: <br/>
A Student takes a Course <br/>
A Course is provided by a Teacher

### Aggregation

A special kind of association (relationship). 

It represents a "part of" relationship.

Example:<br/>
A Wheel is part of a Car

Aggregation implies a relationship in which the child can exist independently of the parent. 

Example: Car (parent) and Wheel (child). Remove the car and the wheel still exists.

### Composition

A special type of aggregation where parts are destroyed when the whole is destroyed.

Example:<br/>
A Room is part of a House

Composition implies a relationship in which the child cannot exist independently of the parent.

Example: House (parent) and Room (child). A room does not exist independently of a house.