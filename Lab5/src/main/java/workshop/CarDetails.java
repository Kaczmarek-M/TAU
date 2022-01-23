package workshop;

public class CarDetails {

    private String id;
    private Integer treadThickness;
    private Integer fuelUsage;
    private Integer carMillage;
    private Integer enginePower;
    private Integer windshieldWasherFluid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getTreadThickness() {
        return treadThickness;
    }

    public void setTreadThickness(Integer treadThickness) {
        this.treadThickness = treadThickness;
    }

    public Integer getFuelUsage() {
        return fuelUsage;
    }

    public void setFuelUsage(Integer fuelUsage) {
        this.fuelUsage = fuelUsage;
    }

    public Integer getCarMillage() {
        return carMillage;
    }

    public void setCarMillage(Integer carMillage) {
        this.carMillage = carMillage;
    }

    public Integer getEnginePower()  {
        return enginePower;
    }
    public void setEnginePower(Integer enginePower) {
        this.enginePower = carMillage;
    }
    public Integer getWindshieldWasherFluid() {
        return windshieldWasherFluid;
    }
    public void setWindshieldWasherFluid(Integer windshieldWasherFluid) {
        this.windshieldWasherFluid = windshieldWasherFluid;
    }
}
