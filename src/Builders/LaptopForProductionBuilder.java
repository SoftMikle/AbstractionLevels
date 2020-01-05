package Builders;

import Computers.LaptopForProduction;

public class LaptopForProductionBuilder implements Builder {
    private String CPUManufacturer;
    private String CPUType;
    private boolean hasIntegratedGPU;
    private String integratedGPUType;
    private boolean hasDiscreteGPU;
    private String GPUManufacturer;
    private String GPUType;
    private String RAMType;
    private int RAMSize;
    private String motherboardManufacturer;
    private String laptopID;
    private String laptopFamily;
    private String laptopBodyMaterial;
    private String keyboardType;
    private int supplyBlockMaxPower;
    private int CPUPowerConsumption;
    private int CPUCoresQuantity;
    private int GPUPowerConsumption;
    private int GPUFrequency;
    private int maxSATABusFrequency;
    private int screenPowerConsumption;
    private int RAMSlotsQuantity;
    private int RAMFrequency;
    private int batteryLifetime;
    private String shippingDimensionsClass;
    private boolean isCertifiedInUSA;
    private double internalBenchmarkScore;

    public void setLaptopID(String laptopID) {
        this.laptopID = laptopID;
    }

    public void setLaptopFamily(String laptopFamily) {
        this.laptopFamily = laptopFamily;
    }

    public void setLaptopBodyMaterial(String laptopBodyMaterial) {
        this.laptopBodyMaterial = laptopBodyMaterial;
    }

    public void setKeyboardType(String keyboardType) {
        this.keyboardType = keyboardType;
    }

    public void setSupplyBlockMaxPower(int supplyBlockMaxPower) {
        this.supplyBlockMaxPower = supplyBlockMaxPower;
    }

    public void setCPUPowerConsumption(int CPUPowerConsumption) {
        this.CPUPowerConsumption = CPUPowerConsumption;
    }

    public void setCPUCoresQuantity(int CPUCoresQuantity) {
        this.CPUCoresQuantity = CPUCoresQuantity;
    }

    public void setGPUPowerConsumption(int GPUPowerConsumption) {
        this.GPUPowerConsumption = GPUPowerConsumption;
    }

    public void setGPUFrequency(int GPUFrequency) {
        this.GPUFrequency = GPUFrequency;
    }

    public void setMaxSATABusFrequency(int maxSATABusFrequency) {
        this.maxSATABusFrequency = maxSATABusFrequency;
    }

    public void setScreenPowerConsumption(int screenPowerConsumption) {
        this.screenPowerConsumption = screenPowerConsumption;
    }

    public void setRAMSlotsQuantity(int RAMSlotsQuantity) {
        this.RAMSlotsQuantity = RAMSlotsQuantity;
    }

    public void setRAMFrequency(int RAMFrequency) {
        this.RAMFrequency = RAMFrequency;
    }

    public void setBatteryLifetime(int batteryLifetime) {
        this.batteryLifetime = batteryLifetime;
    }

    public void setShippingDimensionsClass(String shippingDimensionsClass) {
        this.shippingDimensionsClass = shippingDimensionsClass;
    }

    public void setCertifiedInUSA(boolean certifiedInUSA) {
        isCertifiedInUSA = certifiedInUSA;
    }

    public void setInternalBenchmarkScore(double internalBenchmarkScore) {
        this.internalBenchmarkScore = internalBenchmarkScore;
    }

    public void setCPUManufacturer(String CPUManufacturer) {
        this.CPUManufacturer = CPUManufacturer;
    }

    public void setCPUType(String CPUType) {
        this.CPUType = CPUType;
    }

    public void setHasIntegratedGPU(boolean hasIntegratedGPU) {
        this.hasIntegratedGPU = hasIntegratedGPU;
    }

    public void setIntegratedGPUType(String integratedGPUType) {
        this.integratedGPUType = integratedGPUType;
    }

    public void setHasDiscreteGPU(boolean hasDiscreteGPU) {
        this.hasDiscreteGPU = hasDiscreteGPU;
    }

    public void setGPUManufacturer(String GPUManufacturer) {
        this.GPUManufacturer = GPUManufacturer;
    }

    public void setGPUType(String GPUType) {
        this.GPUType = GPUType;
    }

    public void setRAMType(String RAMType) {
        this.RAMType = RAMType;
    }

    public void setRAMSize(int RAMSize) {
        this.RAMSize = RAMSize;
    }

    public void setMotherboardManufacturer(String motherboardManufacturer) {
        this.motherboardManufacturer = motherboardManufacturer;
    }

    public LaptopForProduction buildLaptopForProduction(){
        return new LaptopForProduction(CPUManufacturer, CPUType, hasIntegratedGPU, integratedGPUType, hasDiscreteGPU, GPUManufacturer, GPUType, RAMType, RAMSize, motherboardManufacturer, laptopID, laptopFamily, laptopBodyMaterial, keyboardType, supplyBlockMaxPower, CPUPowerConsumption, CPUCoresQuantity, GPUPowerConsumption, GPUFrequency, maxSATABusFrequency, screenPowerConsumption, RAMSlotsQuantity, RAMFrequency, batteryLifetime, shippingDimensionsClass, isCertifiedInUSA, internalBenchmarkScore);
    }
}
