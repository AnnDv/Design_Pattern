#TMPS - laboratory 1
## Creational Design Patterns

### Tasks:
1. Choose an OO programming language and a suitable IDE or Editor (No frameworks/libs/engines allowed);

2. Select a domain area for the sample project;

3. Define the main involved classes and think about what instantiation mechanisms are needed;

4. Based on the previous point, implement atleast 3 creational design patterns in your project;

### Implementation:

For this laboratory I used 3 creational design patterns: 
- abstract factory;
- builder;
- prototype.

#### Abstract Factory

Abstract Factory patterns work around a super-factory which creates other factories. This factory is also called as factory of factories. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object. 
In my case I created objects from the inherited from *Car* parent class.

```java
public class Creator {
    public static Car createFactory(String type) {
        if (type.equalsIgnoreCase("sport car")) {
            return new SportCar();
        } else if (type.equalsIgnoreCase("simple car")) {
            return new SimpleCar();
        } else {
            System.out.println("Please specify a valid type");
            return null;
        }
    }
}
```


#### Builder

Builder pattern builds a complex object using simple objects and using a step by step approach. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.

```java
Car car = new CarBuilder().setColor("black").setBrand("Toyota").setNumberOfDoors(2).setIsConvertible(true).createCar();
```

#### Prototype
Prototype pattern refers to creating duplicate object while keeping performance in mind. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.

```java
    @Override
    public Brand clone() {
        try {
            return(Brand) super.clone();
        } catch (CloneNotSupportedException ex) {
            throw new AssertionError();
        }
    }
```

