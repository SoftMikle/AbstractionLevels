package Computers;

public class LaptopForProduction extends Computer {
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

    public LaptopForProduction(String CPUManufacturer, String CPUType, boolean hasIntegratedGPU, String integratedGPUType, boolean hasDiscreteGPU, String GPUManufacturer, String GPUType, String RAMType, int RAMSize, String motherboardManufacturer, String laptopID, String laptopFamily, String laptopBodyMaterial, String keyboardType, int supplyBlockMaxPower, int CPUPowerConsumption, int CPUCoresQuantity, int GPUPowerConsumption, int GPUFrequency, int maxSATABusFrequency, int screenPowerConsumption, int RAMSlotsQuantity, int RAMFrequency, int batteryLifetime, String shippingDimensionsClass, boolean isCertifiedInUSA, double internalBenchmarkScore) {
        super(CPUManufacturer, CPUType, hasIntegratedGPU, integratedGPUType, hasDiscreteGPU, GPUManufacturer, GPUType, RAMType, RAMSize, motherboardManufacturer);
        this.laptopID = laptopID;
        this.laptopFamily = laptopFamily;
        this.laptopBodyMaterial = laptopBodyMaterial;
        this.keyboardType = keyboardType;
        this.supplyBlockMaxPower = supplyBlockMaxPower;
        this.CPUPowerConsumption = CPUPowerConsumption;
        this.CPUCoresQuantity = CPUCoresQuantity;
        this.GPUPowerConsumption = GPUPowerConsumption;
        this.GPUFrequency = GPUFrequency;
        this.maxSATABusFrequency = maxSATABusFrequency;
        this.screenPowerConsumption = screenPowerConsumption;
        this.RAMSlotsQuantity = RAMSlotsQuantity;
        this.RAMFrequency = RAMFrequency;
        this.batteryLifetime = batteryLifetime;
        this.shippingDimensionsClass = shippingDimensionsClass;
        this.isCertifiedInUSA = isCertifiedInUSA;
        this.internalBenchmarkScore = internalBenchmarkScore;
    }

    public void showLaptopParameters(){
        System.out.println("Laptop ID " + getLaptopID() + "of " + getLaptopFamily() + " family has such parameters:");
        System.out.println("Body material is " + getLaptopBodyMaterial());
        System.out.println("Supply block provides " + getSupplyBlockMaxPower() + " W");
        System.out.println("CPU: " + getCPUType() + " Maximal consumption = " + getCPUPowerConsumption() + " W" + (getCPUCoresQuantity() > 1 ? " Quantity of cores: " + getCPUCoresQuantity() : " Has 1 core"));
        System.out.println("GPU: " + (isHasDiscreteGPU() == true ? getGPUType() + " Maximal consumption " + getGPUPowerConsumption() + " W" + " GPU frequency - " + getGPUFrequency() + " MHz" : getIntegratedGPUType() + " Power consumption and Frequency depends of CPU") );
        System.out.println("SATA maximal data transmittion is " + getMaxSATABusFrequency() + " Mb/s");
        System.out.println("Screen power consumption " + getScreenPowerConsumption() + " W");
        System.out.println("RAM: frequency - " + getRAMFrequency() + " MHz, RAM slots quantity " + getRAMSlotsQuantity());
        System.out.println("Shipping dimensions class (with package) - " + getShippingDimensionsClass());
        if(isCertifiedInUSA()){
            System.out.println("The laptop is certified in USA");
        }
        System.out.println("Laptop internal benchmark score is " + getInternalBenchmarkScore());
    }

    public String getLaptopID() {
        return laptopID;
    }

    public String getLaptopFamily() {
        return laptopFamily;
    }

    public String getLaptopBodyMaterial() {
        return laptopBodyMaterial;
    }

    public String getKeyboardType() {
        return keyboardType;
    }

    public int getSupplyBlockMaxPower() {
        return supplyBlockMaxPower;
    }

    public int getCPUPowerConsumption() {
        return CPUPowerConsumption;
    }

    public int getCPUCoresQuantity() {
        return CPUCoresQuantity;
    }

    public int getGPUPowerConsumption() {
        return GPUPowerConsumption;
    }

    public int getGPUFrequency() {
        return GPUFrequency;
    }

    public int getMaxSATABusFrequency() {
        return maxSATABusFrequency;
    }

    public int getScreenPowerConsumption() {
        return screenPowerConsumption;
    }

    public int getRAMSlotsQuantity() {
        return RAMSlotsQuantity;
    }

    public int getRAMFrequency() {
        return RAMFrequency;
    }

    public int getBatteryLifetime() {
        return batteryLifetime;
    }

    public String getShippingDimensionsClass() {
        return shippingDimensionsClass;
    }

    public boolean isCertifiedInUSA() {
        return isCertifiedInUSA;
    }

    public double getInternalBenchmarkScore() {
        return internalBenchmarkScore;
    }
}
