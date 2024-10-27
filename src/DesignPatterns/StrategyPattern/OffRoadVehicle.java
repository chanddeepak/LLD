package DesignPatterns.StrategyPattern;

import DesignPatterns.StrategyPattern.Strategy.DriveStrategy;
import DesignPatterns.StrategyPattern.Strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle {
    OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }
}
