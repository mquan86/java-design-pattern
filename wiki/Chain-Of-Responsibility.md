# Pattern
Build a chain of processing unit. Every unit will process the request and then pass to next processing unit.

Recognized by the behavior method invoke the same method in another same type instance.

![](../src/main/resources/com/mquan86/pattern/behavior/chain/ChainDiagram.png)
# Example
A document converter will work independently on every type of format. Whenever a converter is done, it will pass to next converter.

![](../src/main/resources/com/mquan86/pattern/behavior/chain/example/ChainDiagram.png)
