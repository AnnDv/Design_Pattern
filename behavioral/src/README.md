# TMPS - laboratory 3
## Behavioral Design Patterns
### Tasks:
1. Implement as many behavioral patterns in the project;
2. Keep files grouped (into packages/directories) by their responsibilities;
3. Document the work in a separate markdown file.

### Implementation:
In my project, each brake system algorithm can be extracted to its own class with a single brake() method. AntiLockBrakeSystem and DiscBrakeSystem implement the algorithm while following the base strategy interface. The interface makes them interchangeable in the context. The context (Car) defines the interface of interest to clients. The context Car accepts a strategy setBrakeBehavior

```java
    public void setBrakeBehavior(BrakeSystem brakeSystem) {
        this.brakeSystem = brakeSystem;
    }
```

and delegate work to the strategy object instead of implementing multiple versions of the algorithm on its own:

```java
    public void applyBrake() {
        System.out.println("The car " + type + " has ");
        brakeSystem.brake();
    }
```

The client code picks a concrete strategy and passes it to the context. The client should be aware of the differences between strategies in order to make the right choice.

```java
public class SedanCar extends Car {
    public SedanCar() {
        super(new DiscBrakeSystem(), "Sedan");
    }
}
```