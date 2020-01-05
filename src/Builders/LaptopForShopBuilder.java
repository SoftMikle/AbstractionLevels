package Builders;

import Computers.LaptopForShop;

public class LaptopForShopBuilder {
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
    private String laptopManufacturer;
    private String laptopType;
    private boolean hasBluetooth;
    private String bluetoothType;
    private float screenSizeInches;
    private int screenResolutionWidth;
    private int screenResolutionHeight;
    private boolean hasFingerprintScanner;
    private float CPUFrequency;
    private boolean hasCPUTurboBoost;
    private float CPUBoostedFrequency;
    private float GPUMemorySize;
    private boolean hasHDD;
    private String HDDType;
    private int HDDSize;
    private boolean hasSSD;
    private String SSDType;
    private int SSDSize;
    private boolean hasOS;
    private String OSName;
    private float laptopWeight;

    public void setLaptopManufacturer(String laptopManufacturer) {
        this.laptopManufacturer = laptopManufacturer;
    }

    public void setLaptopType(String laptopType) {
        this.laptopType = laptopType;
    }

    public void setHasBluetooth(boolean hasBluetooth) {
        this.hasBluetooth = hasBluetooth;
    }

    public void setBluetoothType(String bluetoothType) {
        this.bluetoothType = bluetoothType;
    }

    public void setScreenSizeInches(float screenSizeInches) {
        this.screenSizeInches = screenSizeInches;
    }

    public void setScreenResolutionWidth(int screenResolutionWidth) {
        this.screenResolutionWidth = screenResolutionWidth;
    }

    public void setScreenResolutionHeight(int screenResolutionHeight) {
        this.screenResolutionHeight = screenResolutionHeight;
    }

    public void setHasFingerprintScanner(boolean hasFingerprintScanner) {
        this.hasFingerprintScanner = hasFingerprintScanner;
    }

    public void setCPUFrequency(float CPUFrequency) {
        this.CPUFrequency = CPUFrequency;
    }

    public void setHasCPUTurboBoost(boolean hasCPUTurboBoost) {
        this.hasCPUTurboBoost = hasCPUTurboBoost;
    }

    public void setCPUBoostedFrequency(float CPUBoostedFrequency) {
        this.CPUBoostedFrequency = CPUBoostedFrequency;
    }

    public void setGPUMemorySize(float GPUMemorySize) {
        this.GPUMemorySize = GPUMemorySize;
    }

    public void setHasHDD(boolean hasHDD) {
        this.hasHDD = hasHDD;
    }

    public void setHDDType(String HDDType) {
        this.HDDType = HDDType;
    }

    public void setHDDSize(int HDDSize) {
        this.HDDSize = HDDSize;
    }

    public void setHasSSD(boolean hasSSD) {
        this.hasSSD = hasSSD;
    }

    public void setSSDType(String SSDType) {
        this.SSDType = SSDType;
    }

    public void setSSDSize(int SSDSize) {
        this.SSDSize = SSDSize;
    }

    public void setHasOS(boolean hasOS) {
        this.hasOS = hasOS;
    }

    public void setOSName(String OSName) {
        this.OSName = OSName;
    }

    public void setLaptopWeight(float laptopWeight) {
        this.laptopWeight = laptopWeight;
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

    public LaptopForShop buildLaptopForShop(){
        return new LaptopForShop(CPUManufacturer, CPUType, hasIntegratedGPU, integratedGPUType, hasDiscreteGPU, GPUManufacturer, GPUType, RAMType, RAMSize, motherboardManufacturer, laptopManufacturer, laptopType, hasBluetooth, bluetoothType, screenSizeInches, screenResolutionWidth, screenResolutionHeight, hasFingerprintScanner, CPUFrequency, hasCPUTurboBoost, CPUBoostedFrequency, GPUMemorySize, hasHDD, HDDType, HDDSize, hasSSD, SSDType, SSDSize, hasOS, OSName, laptopWeight);
    }
}
