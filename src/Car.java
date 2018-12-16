import java.util.Date;

public class Car extends Vehicle {

  private Feature[] feature = new Feature[10];
  private int carAxle;

  public Car() {

    super(new Date(), "Generic", "Generic", "Generic",
        new VehicleChassis("Unibody"),
        "null", "type",
        new ManufacturedEngine("Honda", new Date(), "H-series",
            "H23A1", "88 AKI", 0, "2WD: Two-Wheel Drive")
    );

    this.feature[0] = new InteriorFeature("No Interior Features");
    this.feature[1] = new ExteriorFeature("No Exterior Features");
    this.carAxle = 2;


  }

  public Car(Date vehicleManufacturedDate, String vehicleManufacturer,
      String vehicleMake, String vehicleModel, VehicleChassis vehicleChassis, String vehicleType,
      String driveTrain, ManufacturedEngine manufacturedEngine, Feature[] feature, int carAxle) {

    super(vehicleManufacturedDate, vehicleManufacturer,
        vehicleMake, vehicleModel, vehicleChassis, vehicleType,
        driveTrain, manufacturedEngine);

    this.feature = feature;
    this.carAxle = carAxle;

  }

  @Override
  public String toString() {

    return super.toString() +
        "Features\t\t: \n" +
        getInteriorFeatures() +
        getExteriorFeatures() +
        "Car Axle\t\t\t: " + this.carAxle;
  }


  public String getExteriorFeatures() {

    return this.feature[1] + "\n" +
        this.feature[3] + "\n";

  }


  public String getInteriorFeatures() {

    return this.feature[0] + "\n" +
        this.feature[2] + "\n";

  }

}
