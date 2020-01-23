package runner;

import Builders.*;
import Computers.LaptopForProduction;
import Computers.LaptopForShop;


public class Main {
    public static void main(String[] args) {

        Manager manager = new Manager();

        LaptopForProductionBuilder laptopForProductionBuilder = new LaptopForProductionBuilder();
        LaptopForShopBuilder laptopForShopBuilder = new LaptopForShopBuilder();
        manager.constructLaptopForProduction(laptopForProductionBuilder);
        LaptopForProduction laptopForProduction = laptopForProductionBuilder.buildLaptopForProduction();

        System.out.println();
        laptopForProduction.showLaptopParameters();

        manager.constructLaptopForShop(laptopForShopBuilder);
        LaptopForShop laptopForShop = laptopForShopBuilder.buildLaptopForShop();

        System.out.println();
        laptopForShop.showLaptopParameters();
    }
}
