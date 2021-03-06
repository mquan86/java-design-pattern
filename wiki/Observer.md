# Observer

## Pattern
A one to many relationship between objects to notify them about state change in one object.
Usually used in event/listener handling.

Recognized by method notifies state change to another instances.

![](../src/main/resources/com/mquan86/pattern/behavior/observer/ObserverDiagram.png)

## Example
A document repository application could notify related users and admins about document state change on saving action.

![](../src/main/resources/com/mquan86/pattern/behavior/observer/example/ObserverDiagram.png)

## Downside
Could lead to memory leak with reference to observers.

## Note
Java provide a convenient built-in Observer pattern with [java.util.Observer](http://docs.oracle.com/javase/8/docs/api/java/util/Observer.html) and [java.util.Observable](http://docs.oracle.com/javase/8/docs/api/java/util/Observable.html)