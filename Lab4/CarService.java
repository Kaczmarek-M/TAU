
public class CarService {
    public boolean analyzeCarByParams(Integer treadThickness, Integer fuelUsage, Integer carMillage, Integer enginePower, Integer windshieldWasherFluid) {

        boolean WasherFluidNull = null == windshieldWasherFluid;
        boolean PowerNull = null == enginePower;
        boolean millageNull = null == carMillage;
        boolean fuelUsageNull = null == fuelUsage;
        boolean treadThicknessNull = null == treadThickness;
        if (millageNull || fuelUsageNull || treadThicknessNull || PowerNull || WasherFluidNull) {
            throw new IllegalArgumentException("Car details can not be null");
        }

        boolean isWasherFluidCorrect = isCorrect(windshieldWasherFluid, ParamValues.WASHER_FLUID);
        boolean isPowerCorrect = isCorrect(enginePower, ParamValues.ENGINE_POWER);
        boolean isMillageCorrect = isCorrect (carMillage, ParamValues.CAR_MILLAGE);
        boolean isFuelUsageCorrect = isCorrect (fuelUsage, ParamValues.FUEL_USAGE);
        boolean isTreadThicknessCorrect = isCorrect (treadThickness, ParamValues.TREAD_THICKNESS);
        if(isMillageCorrect && isFuelUsageCorrect && isTreadThicknessCorrect && isPowerCorrect && isWasherFluidCorrect){
            return true;
        }
        return false;
    }
    private boolean isCorrect(Integer value, ParamValues validValues){
        if (value < 0) {
            throw new IllegalArgumentException("Incorrect value");
        }
        Integer maxValue = validValues.getMaxValue();
        Integer minValue = validValues.getMinValue();
        if (value > minValue && value < maxValue) {
            return true;
        }
        return false;
    }
}
