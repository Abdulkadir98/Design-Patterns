# Decorator

Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.

## Design Principles
Classes should be open for extension but closed for modification.

### Notes
1. Decorators wrap and are the same type as the components they want to extend. This is achieved by extending/implementing the class/interface the component also implements
2. It shows that there is another way to extend classes besides subclassing/inheritance
3. Uses composition and delegation to extend classes
4. Java.io classes use the Decorator heavily
