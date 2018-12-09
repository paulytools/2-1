import java.util.Date;

public class Car extends Vehicle {

  private Feature[] feature = new Feature[10];
  private int carAxle;

//  public Car() {
//
//    super(new Date(), "Honda", "Prelude", "Coupe",
//        new VehicleChassis("Unibody"),
//        "null", "type",
//        new ManufacturedEngine("Honda", new Date(), "H-series",
//            "H23A1", "88 AKI", 4, "2WD: Two-Wheel Drive")
//        );
//
//    this.feature =
//    this.carAxle = carAxle;
//
//
//  }

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

    return "Manufacturer Name\t: Generic\n" +
        "Manufactured Date\t: " + Vehicle. + "\n" +
        "Vehicle Make\t: Generic\n" +
        "Vehicle Model\t: Generic\n" +
        "Vehicle Type\t: None\n" +
        "Engine Manufacturer\t: Generic" +
        "Engine Manufactured\t: " + this + "\n" +
        "Engine Make\t: H-Series\n" +
        "Engine Model\t: H23A1\n" +
        "Engine Type\t: 88 AKI\n" +
        "Engine Cylinders\t: 4\n" +
        "Drive Train\t: 2WD: Two-Wheel Drive\n" +
        "Features\t\t: Interior [AM/FM Radio]\n" +
        "\t\t\t: Exterior [Wood Panels]\n" +
        "\t\t\t: Interior [Air Conditioning]\n" +
        "\t\t\t: Exterior [Moonroof]\n" +
        "Car Axle\t\t\t: " + 2;
  }


  public String getExteriorFeatures() {

    return "Exterior Features\t: Exterior [Wood Panels]\n" +
        "\t\t\t: Exterior [Moonroof]\n";

  }


  public String getInteriorFeatures() {

    return "Interior Features\t: Interior [AM/FM Radio]\n" +
        "\t\t\t: Interior [Air Conditioning]";

  }

}
