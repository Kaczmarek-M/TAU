package Other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OtherWorkshopCarDetailsService {

    public List<OtherWorkshopCarDetailsDTO> findCarDetailsToAnalyze() {

        //DB operations
        return new ArrayList<>(dbContent());
    }

    public List<OtherWorkshopCarDetailsDTO> dbContent() {

        return Arrays.asList(create(1, 3, 5, 10000, 120, 8, "SEAT"),
                create(2, 2, 10, 15000, 150, 9, "SKODA"));
    }

    public OtherWorkshopCarDetailsDTO create(Integer id, Integer treadThickness, Integer fuelUsage, Integer carMillage, Integer enginePower, Integer windshieldWasherFluid, String brand) {

        OtherWorkshopCarDetailsDTO result = new OtherWorkshopCarDetailsDTO();
        result.setId(id);
        result.setBrand(brand);
        result.setTreadThickness(treadThickness);
        result.setFuelUsage(fuelUsage);
        result.setCarMillage(carMillage);
        result.setEnginePower(enginePower);
        result.setWindshieldWasherFluid(windshieldWasherFluid);
        return result;
    }
}
