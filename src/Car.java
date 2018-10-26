import java.util.Date;

public class Car extends Vehicle {

  private Feature[] feature = new Feature[10];
  private int carAxle;

  public Car() {

    super();

  }

  public Car(Feature[] feature, int carAxle) {

    super();

    this.feature = feature;
    this.carAxle = carAxle;

  }

  @Override
  public String toString() {

    Date date = new Date();

    return "Manufacturer Name\t: Generic\n" +
        "Manufactured Date\t: " + date + "\n" +
        "Vehicle Make\t: Generic\n" +
        "Vehicle Model\t: Generic\n" +
        "Vehicle Type\t: None\n" +
        "Engine Manufacturer\t: Generic" +
        "Engine Manufactured\t: " + date + "\n" +
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

  public Car(String vehicleManufacturer, Date vehicleManufacturedDate, String vehicleMake,
      String vehicleModel, String vehicleType, Chassis vehicleFrame, Engine vehicleEngine,
      Feature[] feature, int carAxle) {

    this.vehicleManufacturer = vehicleManufacturer;
    this.vehicleManufacturedDate = vehicleManufacturedDate;
    this.vehicleMake = vehicleMake;
    this.vehicleModel = vehicleModel;
    this.vehicleType = vehicleType;
    this.vehicleFrame = vehicleFrame;
    this.vehicleEngine = vehicleEngine;
    this.feature = feature;
    this.carAxle = carAxle;

  }

  // 10.7: Missing no parameter constructor.


}
