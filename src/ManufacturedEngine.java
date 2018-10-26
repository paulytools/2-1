import java.util.Date;

public class ManufacturedEngine implements Engine {

  String engineManufacturer;

  Date engineManufacturedDate;

  String engineMake;

  String engineModel;
  int engineCylinders;
  String engineType;
  String driveTrain;


  public static void main(String[] args) {

    // So we can display the current time within the methods since we cannot
    // reference non-static variables here.
    Date date = new Date();

    // Calling the methods.
    printGenericStrings(date);
    printStringsWithParameters("Honda", date, "H-Series", "H23A1",
        "88 AKI", 4, "2WD: Two-Wheel Drive");

  }

  ManufacturedEngine() {

    engineManufacturer = "Generic";
    engineManufacturedDate = new Date();
    engineMake = "Generic";
    engineModel = "Generic";
    engineCylinders = 0;
    engineType = "85 AKI";
    driveTrain = "2WD: Two-Wheel Drive";

  }

  // 5.3 ?
  // A public overloaded constructor with values for all of the variables defined above.

  ManufacturedEngine(String engineManufacturer, Date engineManufacturedDate,
      String engineMake, String engineModel, String engineType, int engineCylinders,
      String driveTrain) {

    this.engineManufacturer = "Generic";
    this.engineManufacturedDate = new Date();
    this.engineMake = "Generic";
    this.engineModel = "Generic";
    this.engineCylinders = 0;
    this.engineType = "85 AKI";
    this.driveTrain = "2WD: Two-Wheel Drive";

  }

  public void setEngineCylinders(int engineCylinders) {

    this.engineCylinders = engineCylinders;

  }

  public void setEngineManufacturedDate(Date date) {

    this.engineManufacturedDate = date;

  }

  public void setEngineManufacturer(String manufacturer) {

    this.engineManufacturer = manufacturer;

  }

  public void setEngineMake(String engineMake) {

    this.engineMake = engineMake;

  }

  public void setEngineModel(String engineModel) {

    this.engineModel = engineModel;

  }

  public void setDriveTrain(String driveTrain) {

    this.driveTrain = driveTrain;

  }

  public void setEngineType(String fuel) {

    this.engineType = fuel;

  }

  @Override
  public String toString() {

    return "Engine Manufacturer : " + engineManufacturer + "\n" +
        "Engine Manufactured : " + engineManufacturedDate + "\n" +
        "Engine Make\t : " + engineMake + "\n" +
        "Engine Model\t : " + engineModel + "\n" +
        "Engine Type\t : " + engineType + "\n" +
        "Engine Cylinders\t : " + engineCylinders + "\n" +
        "Drive Train\t : " + driveTrain;

  }

  public static void printGenericStrings(Date engineManufacturedDate) {

    System.out.printf("Engine Manufacturer : " + "Generic" + "\n" +
        "Engine Manufactured : " + engineManufacturedDate + "\n" +
        "Engine Make\t : " + "Generic" + "\n" +
        "Engine Model\t : " + "Generic" + "\n" +
        "Engine Type\t : " + "85 AKI" + "\n" +
        "Engine Cylinders\t : " + 0 + "\n" +
        "Drive Train\t : " + "2WD: Two-Wheel Drive");


  }

  public static void printStringsWithParameters(String engineManufacturer,
      Date engineManufacturedDate,
      String engineMake, String engineModel, String engineType, int engineCylinders,
      String driveTrain) {

    System.out.printf("Engine Manufacturer : " + engineManufacturer + "\n" +
        "Engine Manufactured : " + engineManufacturedDate + "\n" +
        "Engine Make\t : " + engineMake + "\n" +
        "Engine Model\t : " + engineModel + "\n" +
        "Engine Type\t : " + engineType + "\n" +
        "Engine Cylinders\t : " + engineCylinders + "\n" +
        "Drive Train\t : " + driveTrain);

  }


}
