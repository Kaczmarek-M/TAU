package workshop;

import java.util.List;
import java.util.stream.Collectors;

import Other.OtherWorkshopCarDetailsDTO;
import Other.OtherWorkshopCarDetailsService;

public class CarDetailsConverter {

    private final OtherWorkshopCarDetailsService otherWorkshopCarDetailsService;

    public CarDetailsConverter(OtherWorkshopCarDetailsService otherWorkshopCarDetailsService) {

        this.otherWorkshopCarDetailsService = otherWorkshopCarDetailsService;
    }

    public List<CarDetails> convertAll() {

        List<OtherWorkshopCarDetailsDTO> toConvert = otherWorkshopCarDetailsService.findCarDetailsToAnalyze();
        return toConvert.stream() //
                .map(this::convert) //
                .collect(Collectors.toList());
    }

    CarDetails convert(OtherWorkshopCarDetailsDTO dto) {

        CarDetails details = new CarDetails();
        details.setId(String.valueOf(dto.getId()));
        details.setCarMillage(dto.getCarMillage());
        details.setFuelUsage(dto.getFuelUsage());
        details.setTreadThickness(dto.getTreadThickness());
        details.setWindshieldWasherFluid(dto.getWindshieldWasherFluid());
        details.setEnginePower(dto.getEnginePower());
        return details;
    }
}