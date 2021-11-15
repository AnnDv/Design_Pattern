# TMPS-laboratory 2

## Structural Design Patterns

### Tasks:
1. Implement at least 3 structural design patterns;
2. Keep files grouped (into packages/directories) by their responsibilities;
3. Document the work in a separate markdown file according to the requirements.

### Implementation:
For this laboratory work I used 3 structural design patterns:
- bridge;
- facade;
- proxy.
---
#### Bridge
The client has a Car class with two subclasses: Simple car and Sport car. The client wants to extend this class hierarchy to integrate different combustible types. Bridge is used to switch from inheritance to the object composition. I extract combustible related code into its own class with 3 subclasses: electricity, petrol and diesel. The car class then gets a reference field pointing to one of the combustible object. That reference is acting as a bridge between car and combustible type.

```java
class BridgePattern {
   public static void main(String[] args)
   {
       Car SimpleCar1 = new SimpleCar(new Battery());
       SimpleCar1.getType();
       Car SimpleCar2 = new SimpleCar(new Diesel());
       SimpleCar2.getType();
       Car SportCar = new SportCar(new Petrol());
       SportCar.getType();
   }
}
```
---
#### Facade
Facade is used to hide framework's complexity behind a simple interface, wrapping a set of interfaces: CarBody, CarEngine and CarAccessories

```java
public class FacadeCarApp {
    public static void main(String[] args) {
        CarFacade facade = new CarFacade();
        facade.createCar();
    }
}
```
---

#### Proxy
Proxy is used to secure car movement. If you do not have the rights to start car engine, proxy will not allow you to do that by verifying your identity and check if the name is in the list of allowed people or not

```java 
Car car = new ProxySportCar();
try {
    car.connectTo("Mihaela Botezat");
}
catch (Exception e) {
    System.out.println(e.getMessage());
}
```
