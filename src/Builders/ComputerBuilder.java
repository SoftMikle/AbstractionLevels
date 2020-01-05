package Builders;

import Computers.Computer;

public class ComputerBuilder implements Builder{
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

    public Computer buildComputer(){
        return new Computer(CPUManufacturer, CPUType, hasIntegratedGPU, integratedGPUType, hasDiscreteGPU, GPUManufacturer, GPUType, RAMType, RAMSize, motherboardManufacturer);
    }
}
