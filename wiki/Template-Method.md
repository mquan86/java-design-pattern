# Pattern
Define a skeleton on abstraction,  then some steps will be defined or overrided in subclass without changing it's structure.

![](../src/main/resources/com/mquan86/pattern/behavior/template/TemplateDiagram.png)
# Example
Word and Excel document have the same way to get the name of document, so it has the common method in Document abstract class. But save and load action are different, hence they are implemented later by it's type. 

![](../src/main/resources/com/mquan86/pattern/behavior/template/example/TemplateDiagram.png)
