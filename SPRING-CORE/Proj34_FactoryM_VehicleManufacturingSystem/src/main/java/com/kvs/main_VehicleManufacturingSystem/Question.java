package com.kvs.main_VehicleManufacturingSystem;

public class Question {
	/*Q1)
Vehicle Manufacturing System
You are tasked with developing a Spring Core application for a vehicle manufacturing system that produces different types of vehicles (Car, Truck, Motorcycle) based on user specifications. The system should implement the Factory Design Pattern to manage vehicle creation, including various features like electric or diesel engines, and different types of tires.

Requirements:
Vehicle Interface:
Create a Vehicle interface with the following methods:
String getDescription(): Returns a description of the vehicle.

Car Class:
Implements the Vehicle interface and has attributes for engine type and number of doors.
Truck Class:
Implements the Vehicle interface and has attributes for engine type and payload capacity.
Motorcycle Class:
Implements the Vehicle interface and has attributes for engine type and whether it has a sidecar.

Engine Interface:
Define an Engine interface with the method:
String getEngineType(): Returns the type of engine (e.g., Electric, Diesel).

ElectricEngine Class:
Implements the Engine interface and returns "Electric" for getEngineType().
DieselEngine Class:
Implements the Engine interface and returns "Diesel" for getEngineType().

VehicleFactory Interface:
Define a VehicleFactory interface with the method:
Vehicle createVehicle(String type, String engineType): This method should return a Vehicle object based on the provided type and engine type.

ConcreteVehicleFactory Class:
Implements the VehicleFactory interface. It should create instances of Car, Truck, and Motorcycle based on the provided type and engine type.

VehicleService Class:
Create a VehicleService class that uses the VehicleFactory to create and describe vehicles.
Attributes:
VehicleFactory vehicleFactory: Injected using @Autowired.
Methods:
createVehicle(String type, String engineType): Uses the factory to create a vehicle and returns its description.

AppConfig Class:

Create a configuration class annotated with @Configuration to enable component scanning for the vehicle and engine classes, and the factory.

Main Class:
Create a main class that:
Loads the Spring application context.
Uses the VehicleService to create a vehicle based on user input and prints its description.*/

}
