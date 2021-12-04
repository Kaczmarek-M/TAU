import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.ranges.Range;

public class CarServiceTest {

    @Test
    public void analyzeCarByParams_millageNull_throwsIllegalArgumentException(){

        //given
        Integer treadThickness = 4;
        Integer fuelUsage = 8;
        Integer carMillage = null;

        CarService service = new CarService();

        //when
        //then
        Assert.assertThrows(IllegalArgumentException.class, () -> service.analyzeCarByParams(treadThickness, fuelUsage, carMillage));
    }
    @Test
    public void analyzeCarByParams_millageLessThenZero_throwsIllegalArgumentException(){

        //given
        Integer treadThickness = 4;
        Integer fuelUsage = 8;
        Integer carMillage = -1;

        CarService service = new CarService();

        //when
        //then
        Assert.assertThrows(IllegalArgumentException.class, () -> service.analyzeCarByParams(treadThickness, fuelUsage, carMillage));
    }
    @Test
    public void analyzeCarByParams_fuelLessThenZero_throwsIllegalArgumentException(){

        //given
        Integer treadThickness = 4;
        Integer fuelUsage = -2;
        Integer carMillage = 2000;

        CarService service = new CarService();

        //when
        //then
        Assert.assertThrows(IllegalArgumentException.class, () -> service.analyzeCarByParams(treadThickness, fuelUsage, carMillage));
    }
    @Test
    public void analyzeCarByParams_treadThicknessLessThenZero_throwsIllegalArgumentException(){

        //given
        Integer treadThickness = -3;
        Integer fuelUsage = 8;
        Integer carMillage = 2000;

        CarService service = new CarService();

        //when
        //then
        Assert.assertThrows(IllegalArgumentException.class, () -> service.analyzeCarByParams(treadThickness, fuelUsage, carMillage));
    }
    @Test
    public void analyzeCarByParams_AllValuesOk_resultTrue(){

        //given
        Integer treadThickness = 4;
        Integer fuelUsage = 8;
        Integer carMillage = 12000;
        CarService service = new CarService();

        //when
        boolean result = service.analyzeCarByParams(treadThickness, fuelUsage, carMillage);

        //then
        Assert.assertTrue(result);
    }
    @Test
    public void analyzeCarByParams_valuesEqualToMinOrMax_resultFalse(){

        //given
        Integer treadThickness = 3;
        Integer fuelUsage = 16;
        Integer carMillage = 0;
        CarService service = new CarService();

        //when
        boolean result = service.analyzeCarByParams(treadThickness, fuelUsage, carMillage);

        //then
        Assert.assertFalse(result);
    }
    @Test
    public void analyzeCarByParams_fuelIsIncorrect_resultFalse(){

        //given
        Integer treadThickness = 3;
        Integer fuelUsage = 20;
        Integer carMillage = 12000;
        CarService service = new CarService();

        //when
        boolean result = service.analyzeCarByParams(treadThickness, fuelUsage, carMillage);

        //then
        Assert.assertFalse(result);
    }
    @Test
    public void analyzeCarByParams_carMillageIsIncorrect_resultFalse(){

        //given
        Integer treadThickness = 3;
        Integer fuelUsage = 10;
        Integer carMillage = 35000;
        CarService service = new CarService();

        //when
        boolean result = service.analyzeCarByParams(treadThickness, fuelUsage, carMillage);

        //then
        Assert.assertFalse(result);
    }
    @Test
    public void analyzeCarByParams_treadThicknessIsIncorrect_resultFalse(){

        //given
        Integer treadThickness = 0;
        Integer fuelUsage = 10;
        Integer carMillage = 10000;
        CarService service = new CarService();

        //when
        boolean result = service.analyzeCarByParams(treadThickness, fuelUsage, carMillage);

        //then
        Assert.assertFalse(result);
    }
    @Test
    public void analyzeCarByParams_valuesNotNull_resultTrue(){

        //given
        Integer treadThickness = 3;
        Integer fuelUsage = 10;
        Integer carMillage = 15;
        CarService service = new CarService();

        //when

        boolean result = service.analyzeCarByParams(treadThickness, fuelUsage, carMillage);
        //then
        Assert.assertNotNull(result);
    }
}
