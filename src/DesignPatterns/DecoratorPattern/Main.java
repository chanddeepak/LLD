package DesignPatterns.DecoratorPattern;

import DesignPatterns.DecoratorPattern.Decorator.ExtraCheese;
import DesignPatterns.DecoratorPattern.Decorator.Mushroom;

public class Main {
    public static void main(String args[]) {
        BasePizza pizza = new Mushroom(new ExtraCheese(new FarmHouse()));
        System.out.println("Total pizza cost : " + pizza.cost());
    }
}
