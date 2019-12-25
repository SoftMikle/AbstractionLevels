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

    public Computer(){

    }

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

    public void setCPUManufacturer(String CPUManufacturer) {
        this.CPUManufacturer = CPUManufacturer;
    }

    public String getCPUType() {
        return CPUType;
    }

    public void setCPUType(String CPUType) {
        this.CPUType = CPUType;
    }

    public boolean isHasIntegratedGPU() {
        return hasIntegratedGPU;
    }

    public void setHasIntegratedGPU(boolean hasIntegratedGPU) {
        this.hasIntegratedGPU = hasIntegratedGPU;
    }

    public String getIntegratedGPUType() {
        return integratedGPUType;
    }

    public void setIntegratedGPUType(String integratedGPUType) {
        this.integratedGPUType = integratedGPUType;
    }

    public boolean isHasDiscreteGPU() {
        return hasDiscreteGPU;
    }

    public void setHasDiscreteGPU(boolean hasDiscreteGPU) {
        this.hasDiscreteGPU = hasDiscreteGPU;
    }

    public String getGPUManufacturer() {
        return GPUManufacturer;
    }

    public void setGPUManufacturer(String GPUManufacturer) {
        this.GPUManufacturer = GPUManufacturer;
    }

    public String getGPUType() {
        return GPUType;
    }

    public void setGPUType(String GPUType) {
        this.GPUType = GPUType;
    }

    public String getRAMType() {
        return RAMType;
    }

    public void setRAMType(String RAMType) {
        this.RAMType = RAMType;
    }

    public int getRAMSize() {
        return RAMSize;
    }

    public void setRAMSize(int RAMSize) {
        this.RAMSize = RAMSize;
    }

    public String getMotherboardManufacturer() {
        return motherboardManufacturer;
    }

    public void setMotherboardManufacturer(String motherboardManufacturer) {
        this.motherboardManufacturer = motherboardManufacturer;
    }
}
