package Builders;

import Builders.Builder;
import Builders.LaptopForProductionBuilder;
import Builders.LaptopForShopBuilder;

public class Manager {
    public void constructComputer(Builder builder){
        builder.setCPUManufacturer("AMD");
        builder.setCPUType("Ryzen 7 3700U ");
        builder.setGPUManufacturer("Radeon");
        builder.setGPUType("AMD Radeon RX Vega 10 Graphics");
        builder.setHasDiscreteGPU(false);
        builder.setHasIntegratedGPU(true);
        builder.setIntegratedGPUType("AMD Radeon RX Vega 10 Graphics");
        builder.setMotherboardManufacturer("Zotac");
        builder.setRAMSize(32);
        builder.setRAMType("DDR4");
    }
    //will be equal to    public void constructComputer(ComputerBuilder builder)
    public void constructLaptopForProduction(Builder builder){
        builder.setCPUManufacturer("AMD");
        builder.setCPUType("Ryzen 7 3700U ");
        builder.setGPUManufacturer("Radeon");
        builder.setGPUType("AMD Radeon RX Vega 10 Graphics");
        builder.setHasDiscreteGPU(false);
        builder.setHasIntegratedGPU(true);
        builder.setIntegratedGPUType("AMD Radeon RX Vega 10 Graphics");
        builder.setMotherboardManufacturer("Zotac");
        builder.setRAMSize(32);
        builder.setRAMType("DDR4");
    }

    public void constructLaptopForProduction(LaptopForProductionBuilder builder){
        builder.setCPUManufacturer("AMD");
        builder.setCPUType("Ryzen 7 3700U ");
        builder.setGPUManufacturer("Radeon");
        builder.setGPUType("AMD Radeon RX Vega 10 Graphics");
        builder.setHasDiscreteGPU(false);
        builder.setHasIntegratedGPU(true);
        builder.setIntegratedGPUType("AMD Radeon RX Vega 10 Graphics");
        builder.setMotherboardManufacturer("Zotac");
        builder.setRAMSize(32);
        builder.setRAMType("DDR4");
        builder.setBatteryLifetime(7);
        builder.setCertifiedInUSA(true);
        builder.setCPUCoresQuantity(4);
        builder.setCPUPowerConsumption(45);
        builder.setGPUFrequency(1400);
        builder.setGPUPowerConsumption(15);
        builder.setInternalBenchmarkScore(8.769);
        builder.setKeyboardType("Membrane");
        builder.setLaptopBodyMaterial("Aluminium");
        builder.setLaptopFamily("ThinkPad");
        builder.setLaptopID("20NE000CRT");
        builder.setMaxSATABusFrequency(6000);
        builder.setRAMFrequency(2400);
        builder.setRAMSlotsQuantity(4);
        builder.setScreenPowerConsumption(20);
        builder.setShippingDimensionsClass("C");
        builder.setSupplyBlockMaxPower(90);
    }

    public void constructLaptopForShop(Builder builder){
        builder.setCPUManufacturer("AMD");
        builder.setCPUType("Ryzen 7 3700U ");
        builder.setGPUManufacturer("Radeon");
        builder.setGPUType("AMD Radeon RX Vega 10 Graphics");
        builder.setHasDiscreteGPU(false);
        builder.setHasIntegratedGPU(true);
        builder.setIntegratedGPUType("AMD Radeon RX Vega 10 Graphics");
        builder.setMotherboardManufacturer("Zotac");
        builder.setRAMSize(32);
        builder.setRAMType("DDR4");
    }

    public void constructLaptopForShop(LaptopForShopBuilder builder){
        builder.setCPUManufacturer("AMD");
        builder.setCPUType("Ryzen 7 3700U ");
        builder.setGPUManufacturer("Radeon");
        builder.setGPUType("AMD Radeon RX Vega 10 Graphics");
        builder.setHasDiscreteGPU(false);
        builder.setHasIntegratedGPU(true);
        builder.setIntegratedGPUType("AMD Radeon RX Vega 10 Graphics");
        builder.setMotherboardManufacturer("Zotac");
        builder.setRAMSize(32);
        builder.setRAMType("DDR4");
        builder.setBluetoothType("5.0");
        builder.setCPUBoostedFrequency(3.9f);
        builder.setCPUFrequency(1.6f);
        builder.setGPUMemorySize(0);
        builder.setHasBluetooth(true);
        builder.setHasCPUTurboBoost(true);
        builder.setHasFingerprintScanner(true);
        builder.setHasHDD(true);
        builder.setHasOS(true);
        builder.setHasSSD(true);
        builder.setHDDSize(1);
        builder.setHDDType("Western Digital Black 1TB 7200rpm 32MB WD10JPLX 2.5 SATA III");
        builder.setLaptopManufacturer("Lenovo");
        builder.setLaptopType("Z570");
        builder.setLaptopWeight(1.46f);
        builder.setOSName("Windows 10 Pro 64bit");
        builder.setScreenResolutionHeight(1080);
        builder.setScreenResolutionWidth(1920);
        builder.setScreenSizeInches(14);
        builder.setSSDSize(256);
        builder.setSSDType("M2");
    }

}
