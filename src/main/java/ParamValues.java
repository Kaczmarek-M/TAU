public enum ParamValues {

    CAR_MILLAGE(0, 30000),
    FUEL_USAGE(0, 16),
    TREAD_THICKNESS(3, 100);


    private Integer minValue;
    private Integer maxValue;

    ParamValues(Integer minValue, Integer maxValue){
        this.minValue = minValue;
        this.maxValue = maxValue;
    }
    public Integer getMinValue() {
        return minValue;
    }
    public Integer getMaxValue() {
        return maxValue;
    }
}
