# State

## Pattern
To change the behavior of object if it's internal state is changed.

Recognized by behavior method which is changes behavior depending on instance's state.

![](../src/main/resources/com/mquan86/pattern/behavior/state/StateDiagram.png)

## Example
A mobile alert notification alert the notification different way base on mobile's notification state it is. If it is sound mode, notification is showed with sound. If it is vibration mode, notification is showed with vibration and no sound. 

![](../src/main/resources/com/mquan86/pattern/behavior/state/example/StateDiagram.png)

## Downside
Some operations may not be available on some certain states. This could be solved by using separated role interface for state.
