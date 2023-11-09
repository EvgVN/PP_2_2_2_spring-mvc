package web.model;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Car {
    private final String brand;
    private final String model;
    private final int series;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getSeries() {
        return series;
    }
}
