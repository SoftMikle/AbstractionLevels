package Builders;

public interface Builder {

    void setCPUManufacturer(String CPUManufacturer);
    void setCPUType(String CPUType);
    void setHasIntegratedGPU(boolean hasIntegratedGPU);
    void setIntegratedGPUType(String integratedGPUType);
    void setHasDiscreteGPU(boolean hasDiscreteGPU);
    void setGPUManufacturer(String GPUManufacturer);
    void setGPUType(String GPUType);
    void setRAMType(String RAMType);
    void setRAMSize(int RAMSize);
    void setMotherboardManufacturer(String motherboardManufacturer);
}
