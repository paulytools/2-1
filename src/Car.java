import java.util.Date;

public class Car extends Vehicle {

  private Feature[] feature = new Feature[10];
  private int carAxle;

  public Car() {

    super(new Date(), "Honda", "Prelude", "Coupe",
        new VehicleChassis("Unibody"),
        "null", "type",
        new ManufacturedEngine("Honda", new Date(), "H-series",
            "H23A1", "88 AKI", 4, "2WD: Two-Wheel Drive")
        );

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

    return "Manufacturer Name\t: " + super.getVehicleManufacturer() +"\n" +
        "Manufactured Date\t: " + super.getVehicleManufacturedDate() + "\n" +
        "Vehicle Make\t: " + super.getVehicleMake() +"\n" +
        "Vehicle Model\t: " + super.getVehicleModel() + "\n" +
        "Vehicle Type\t: " + super.getVehicleType() + "\n" +
        super.getVehicleEngine() +
        "\nFeatures\t\t: Interior [" + feature[1] + "]\n" +
        "\t\t\t: Exterior [" + feature[2] + "]\n" +
        "\t\t\t: Interior [" + feature[3] + "]\n" +
        "\t\t\t: Exterior [" + feature[4] + "]\n" +
        "Car Axle\t\t\t: " + this.carAxle;
  }


  public String getExteriorFeatures() {

    return "Exterior Features\t: Exterior ["+ this.feature[2] + "]\n" +
        "\t\t\t: Exterior [" + this.feature[4] + "]\n";

  }


  public String getInteriorFeatures() {

    return "Interior Features\t: Interior [" + this.feature[1] + "]\n" +
        "\t\t\t: Interior [" + this.feature[3]  + "]";

  }

}
