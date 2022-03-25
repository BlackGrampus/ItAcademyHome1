package by.javacourse.se.project.entity.order;

import by.javacourse.se.project.enums.*;

import java.util.Arrays;

public class OrderSedanCar extends OrderCar {

    private final TrunkEnum _trunk;

    public OrderSedanCar(
            ColorEnum color,
            ModelEnum model,
            Integer yearOfManufacture,
            WheelREnum wheelR,
            Integer engineCapacity,
            TrunkEnum trunk,
            OptionCarEnum... options) {
        super(
                color,
                model,
                yearOfManufacture,
                wheelR,
                engineCapacity,
                options
        );
        this._trunk = trunk;
    }

    public OrderSedanCar(
            ColorEnum color,
            ModelEnum model,
            Integer yearOfManufacture,
            WheelREnum wheelR,
            Integer engineCapacity,
            TrunkEnum trunk
    ) {
        super(
                color,
                model,
                yearOfManufacture,
                wheelR,
                engineCapacity
        );
        this._trunk = trunk;
    }

    public TrunkEnum get_trunk() {
        return _trunk;
    }

    @Override
    public String toString() {
        return "model "
                + super.get_model()
                + ", "
                + super.getYearOfManufacture()
                + " year, engine capacity "
                + super.getEngineCapacity()
                + ", color "
                + super.get_color()
                + ", wheel size "
                + super.get_wheelR()
                + ", trunk "
                + _trunk
                + (super.getOptions().size() == 0
                ? '.' : ", options: " + Arrays.toString(super.getOptions().toArray()) + '.');
    }
}
