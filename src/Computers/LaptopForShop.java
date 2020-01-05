package Computers;

public class LaptopForShop extends Computer {
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

    //public Computers.LaptopForShop(){

    //}

    public LaptopForShop(String CPUManufacturer, String CPUType, boolean hasIntegratedGPU, String integratedGPUType, boolean hasDiscreteGPU,
                         String GPUManufacturer, String GPUType, String RAMType, int RAMSize, String motherboardManufacturer, String laptopManufacturer,
                         String laptopType, boolean hasBluetooth, String bluetoothType, float screenSizeInches, int screenResolutionWidth,
                         int screenResolutionHeight, boolean hasFingerprintScanner, float CPUFrequency, boolean hasCPUTurboBoost, float CPUBoostedFrequency,
                         float GPUMemorySize, boolean hasHDD, String HDDType, int HDDSize, boolean hasSSD, String SSDType, int SSDSize, boolean hasOS, String OSName, float laptopWeight) {
        super(CPUManufacturer, CPUType, hasIntegratedGPU, integratedGPUType, hasDiscreteGPU, GPUManufacturer, GPUType, RAMType, RAMSize, motherboardManufacturer);
        this.laptopManufacturer = laptopManufacturer;
        this.laptopType = laptopType;
        this.hasBluetooth = hasBluetooth;
        this.bluetoothType = bluetoothType;
        this.screenSizeInches = screenSizeInches;
        this.screenResolutionWidth = screenResolutionWidth;
        this.screenResolutionHeight = screenResolutionHeight;
        this.hasFingerprintScanner = hasFingerprintScanner;
        this.CPUFrequency = CPUFrequency;
        this.hasCPUTurboBoost = hasCPUTurboBoost;
        this.CPUBoostedFrequency = CPUBoostedFrequency;
        this.GPUMemorySize = GPUMemorySize;
        this.hasHDD = hasHDD;
        this.HDDType = HDDType;
        this.HDDSize = HDDSize;
        this.hasSSD = hasSSD;
        this.SSDType = SSDType;
        this.SSDSize = SSDSize;
        this.hasOS = hasOS;
        this.OSName = OSName;
        this.laptopWeight = laptopWeight;
    }

    public void showLaptopParameters(){
        System.out.println("Laptop " + getLaptopManufacturer() + " " + getLaptopType() + " has such parameters:");
        System.out.println("CPU " + getCPUManufacturer() + " " + getCPUType() + " " + getCPUFrequency() + (isHasCPUTurboBoost() == true ? " - " + getCPUBoostedFrequency() : "") + " GHz" + (isHasIntegratedGPU() == true ? "(" + getIntegratedGPUType() + (getIntegratedGPUType().contains("Graphics") ? ")" : " Graphics)") : ""));
        if(isHasDiscreteGPU()){
            System.out.println("GPU " + getGPUManufacturer() + " " + getGPUManufacturer() + " " + getGPUMemorySize() + (getGPUMemorySize() > 100 ? " Mb" : " GB"));
        }
        System.out.println("RAM " + getRAMType() + " " + getRAMSize() + (getRAMSize() > 128 ? " Mb" : " GB"));
        System.out.println("Motherboard " + getMotherboardManufacturer());
        if(isHasBluetooth()){
            System.out.println("Bluetooth " + getBluetoothType());
        }
        System.out.println("Screen " + getScreenSizeInches() + "\"" + " (" + getScreenResolutionWidth() + "*" + getScreenResolutionHeight() + ")");
        if(isHasFingerprintScanner()){
            System.out.println("Fingerprint Scanner");
        }
        if(isHasHDD()){
            System.out.println("HDD " + getHDDSize() + (getHDDSize() > 128 ? " GB" : " TB"));
        }
        if(isHasSSD()){
            System.out.println("SSD " + (getSSDType().equals("SSD") ? "" : getSSDType()) + " " + getSSDSize() + (getSSDSize() > 64 ? " GB" : " TB"));
        }
        if(isHasOS()){
            System.out.println("OS " + getOSName());
        }
        else {
            System.out.println("No OS");
        }
        System.out.println("Laptop weight " + getLaptopWeight());
    }

    public String getLaptopManufacturer() {
        return laptopManufacturer;
    }

    public String getLaptopType() {
        return laptopType;
    }

    public void setLaptopType(String laptopType) {
        this.laptopType = laptopType;
    }

    public void setLaptopManufacturer(String laptopManufacturer) {
        this.laptopManufacturer = laptopManufacturer;
    }

    public boolean isHasBluetooth() {
        return hasBluetooth;
    }

    public void setHasBluetooth(boolean hasBluetooth) {
        this.hasBluetooth = hasBluetooth;
    }

    public String getBluetoothType() {
        return bluetoothType;
    }

    public void setBluetoothType(String bluetoothType) {
        this.bluetoothType = bluetoothType;
    }

    public float getScreenSizeInches() {
        return screenSizeInches;
    }

    public void setScreenSizeInches(float screenSizeInches) {
        this.screenSizeInches = screenSizeInches;
    }

    public int getScreenResolutionWidth() {
        return screenResolutionWidth;
    }

    public void setScreenResolutionWidth(int screenResolutionWidth) {
        this.screenResolutionWidth = screenResolutionWidth;
    }

    public int getScreenResolutionHeight() {
        return screenResolutionHeight;
    }

    public void setScreenResolutionHeight(int screenResolutionHeight) {
        this.screenResolutionHeight = screenResolutionHeight;
    }

    public boolean isHasFingerprintScanner() {
        return hasFingerprintScanner;
    }

    public void setHasFingerprintScanner(boolean hasFingerprintScanner) {
        this.hasFingerprintScanner = hasFingerprintScanner;
    }

    public float getCPUFrequency() {
        return CPUFrequency;
    }

    public void setCPUFrequency(float CPUFrequency) {
        this.CPUFrequency = CPUFrequency;
    }

    public boolean isHasCPUTurboBoost() {
        return hasCPUTurboBoost;
    }

    public void setHasCPUTurboBoost(boolean hasCPUTurboBoost) {
        this.hasCPUTurboBoost = hasCPUTurboBoost;
    }

    public float getCPUBoostedFrequency() {
        return CPUBoostedFrequency;
    }

    public void setCPUBoostedFrequency(float CPUBoostedFrequency) {
        this.CPUBoostedFrequency = CPUBoostedFrequency;
    }

    public float getGPUMemorySize() {
        return GPUMemorySize;
    }

    public void setGPUMemorySize(float GPUMemorySize) {
        this.GPUMemorySize = GPUMemorySize;
    }

    public boolean isHasHDD() {
        return hasHDD;
    }

    public void setHasHDD(boolean hasHDD) {
        this.hasHDD = hasHDD;
    }

    public String getHDDType() {
        return HDDType;
    }

    public void setHDDType(String HDDType) {
        this.HDDType = HDDType;
    }

    public int getHDDSize() {
        return HDDSize;
    }

    public void setHDDSize(int HDDSize) {
        this.HDDSize = HDDSize;
    }

    public boolean isHasSSD() {
        return hasSSD;
    }

    public void setHasSSD(boolean hasSSD) {
        this.hasSSD = hasSSD;
    }

    public String getSSDType() {
        return SSDType;
    }

    public void setSSDType(String SSDType) {
        this.SSDType = SSDType;
    }

    public int getSSDSize() {
        return SSDSize;
    }

    public void setSSDSize(int SSDSize) {
        this.SSDSize = SSDSize;
    }

    public boolean isHasOS() {
        return hasOS;
    }

    public void setHasOS(boolean hasOS) {
        this.hasOS = hasOS;
    }

    public String getOSName() {
        return OSName;
    }

    public void setOSName(String OSName) {
        this.OSName = OSName;
    }

    public float getLaptopWeight() {
        return laptopWeight;
    }

    public void setLaptopWeight(float laptopWeight) {
        this.laptopWeight = laptopWeight;
    }
}
