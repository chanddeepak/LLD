package DesignPatterns.StrategyPattern;

import DesignPatterns.StrategyPattern.Strategy.DriveStrategy;
import DesignPatterns.StrategyPattern.Strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle {
    PassengerVehicle() {
        super(new NormalDriveStrategy());
    }
}
