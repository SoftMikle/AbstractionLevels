package Computers;

public class Computer {
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

//    public Computer(ComputerBuilder builder){
//        this.CPUManufacturer = builder.CPUManufacturer;
//        this.CPUType = builder.CPUType;
//        this.GPUManufacturer = builder.GPUManufacturer;
//        this.GPUType = builder.GPUType;
//        this.hasDiscreteGPU = builder.hasDiscreteGPU;
//        this.hasIntegratedGPU = builder.hasIntegratedGPU;
//        this.integratedGPUType = builder.integratedGPUType;
//        this.motherboardManufacturer = builder.motherboardManufacturer;
//        this.RAMSize = builder.RAMSize;
//        this.RAMType = builder.RAMType;
//    }

    public Computer(String CPUManufacturer, String CPUType, boolean hasIntegratedGPU, String integratedGPUType, boolean hasDiscreteGPU, String GPUManufacturer, String GPUType, String RAMType, int RAMSize, String motherboardManufacturer) {
        this.CPUManufacturer = CPUManufacturer;
        this.CPUType = CPUType;
        this.hasIntegratedGPU = hasIntegratedGPU;
        this.integratedGPUType = integratedGPUType;
        this.hasDiscreteGPU = hasDiscreteGPU;
        this.GPUManufacturer = GPUManufacturer;
        this.GPUType = GPUType;
        this.RAMType = RAMType;
        this.RAMSize = RAMSize;
        this.motherboardManufacturer = motherboardManufacturer;
    }

    public String getCPUManufacturer() {
        return CPUManufacturer;
    }

    public String getCPUType() {
        return CPUType;
    }

    public boolean isHasIntegratedGPU() {
        return hasIntegratedGPU;
    }

    public String getIntegratedGPUType() {
        return integratedGPUType;
    }

    public boolean isHasDiscreteGPU() {
        return hasDiscreteGPU;
    }

    public String getGPUManufacturer() {
        return GPUManufacturer;
    }

    public String getGPUType() {
        return GPUType;
    }

    public String getRAMType() {
        return RAMType;
    }

    public int getRAMSize() {
        return RAMSize;
    }

    public String getMotherboardManufacturer() {
        return motherboardManufacturer;
    }
}
