import java.util.Date;

public class ManufacturedEngine implements Engine {

  private String engineManufacturer;
  private Date engineManufacturedDate;
  private String engineMake;
  private String engineModel;
  private int engineCylinders;
  private String engineType;
  private String driveTrain;

  ManufacturedEngine() {

    this.engineManufacturer = "Generic";
    this.engineManufacturedDate = new Date();
    this.engineMake = "Generic";
    this.engineModel = "Generic";
    this.engineCylinders = 4;
    this.engineType = "85 AKI";
    this.driveTrain = "2WD: Two-Wheel Drive";

  }

  ManufacturedEngine(String engineManufacturer, Date engineManufacturedDate,
      String engineMake, String engineModel, String engineType, int engineCylinders,
      String driveTrain) {

    this.engineManufacturer = engineManufacturer;
    this.engineManufacturedDate = engineManufacturedDate;
    this.engineMake = engineMake;
    this.engineModel = engineModel;
    this.engineCylinders = engineCylinders;
    this.engineType = engineType;
    this.driveTrain = driveTrain;

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

  public void printGenericStrings() {

    System.out.println("Engine Manufacturer : " + "Generic" + "\n" +
        "Engine Manufactured : " + this.engineManufacturedDate + "\n" +
        "Engine Make\t : " + "Generic" + "\n" +
        "Engine Model\t : " + "Generic" + "\n" +
        "Engine Type\t : " + "85 AKI" + "\n" +
        "Engine Cylinders\t : " + 0 + "\n" +
        "Drive Train\t : " + "2WD: Two-Wheel Drive");


  }

  public void printStringsWithParameters() {

    System.out.println("Engine Manufacturer : " + this.engineManufacturer + "\n" +
        "Engine Manufactured : " + this.engineManufacturedDate + "\n" +
        "Engine Make\t : " + this.engineMake + "\n" +
        "Engine Model\t : " + this.engineModel + "\n" +
        "Engine Type\t : " + this.engineType + "\n" +
        "Engine Cylinders\t : " + this.engineCylinders + "\n" +
        "Drive Train\t : " + this.driveTrain);

  }


}
