package workshop;

import Other.OtherWorkshopCarDetailsDTO;
import Other.OtherWorkshopCarDetailsService;
import org.mockito.Mockito;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class CarDetailsConverterTest {

    private CarDetailsConverter toTest;

    @Test
    public void convertAll_simpleCase_convertSuccess() {

        //given
        OtherWorkshopCarDetailsService service = createServiceMock();
        toTest = new CarDetailsConverter(service);

        //then
        List<CarDetails> result = toTest.convertAll();

        //then
        assertEquals(result.size(), 2);
    }

    public OtherWorkshopCarDetailsService createServiceMock() {

        OtherWorkshopCarDetailsService service = Mockito.mock(OtherWorkshopCarDetailsService.class);
        List<OtherWorkshopCarDetailsDTO> content = dbContent();
        Mockito.when(service.findCarDetailsToAnalyze()).thenReturn(content);
        return service;
    }

    public List<OtherWorkshopCarDetailsDTO> dbContent() {

        return Arrays.asList(createMock(1,2,3,4, 120, 9));
    }

    @Test
    public void convert_simpleCase_convertSuccess() {

        //given
        toTest = new CarDetailsConverter(null);
        OtherWorkshopCarDetailsDTO itemToTest = createMock(1, 10, 6, 3, 130, 10);

        //when
        CarDetails details = toTest.convert(itemToTest);

        //then
        assertEquals(details.getId(), "1");
        assertEquals(details.getCarMillage(), Integer.valueOf(10));
        assertEquals(details.getFuelUsage(), Integer.valueOf(6));
        assertEquals(details.getTreadThickness(), Integer.valueOf(3));
        assertEquals(details.getEnginePower(), Integer.valueOf(120));
        assertEquals(details.getWindshieldWasherFluid(), Integer.valueOf(9));
    }

    public OtherWorkshopCarDetailsDTO createMock(Integer id, Integer treadThickness, Integer fuelUsage, Integer carMillage, Integer enginePower, Integer windshieldWasherFluid) {

        OtherWorkshopCarDetailsDTO mock = Mockito.mock(OtherWorkshopCarDetailsDTO.class);
        Mockito.when(mock.getId()).thenReturn(id);
        Mockito.when(mock.getCarMillage()).thenReturn(treadThickness);
        Mockito.when(mock.getFuelUsage()).thenReturn(fuelUsage);
        Mockito.when(mock.getTreadThickness()).thenReturn(carMillage);
        Mockito.when(mock.getEnginePower()).thenReturn(enginePower);
        Mockito.when(mock.getWindshieldWasherFluid()).thenReturn(windshieldWasherFluid);
        return mock;
    }
}
