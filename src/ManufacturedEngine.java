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

  public String getEngineManufacturer() {
    return this.engineManufacturer;
  }

  public Date getEngineManufacturedDate() {
    return this.engineManufacturedDate;
  }

  public String getEngineMake() {
    return this.engineMake;
  }

  public String getEngineModel() {
    return this.engineModel;
  }

  public int getEngineCylinders() {
    return this.engineCylinders;
  }

  public String getEngineType() {
    return this.engineType;
  }

  public String getDriveTrain() {
    return this.driveTrain;
  }

  @Override
  public String toString() {

    return "Engine Manufacturer : " + this.engineManufacturer + "\n" +
        "Engine Manufactured : " + this.engineManufacturedDate + "\n" +
        "Engine Make\t : " + this.engineMake + "\n" +
        "Engine Model\t : " + this.engineModel + "\n" +
        "Engine Type\t : " + this.engineType + "\n" +
        "Engine Cylinders\t : " + this.engineCylinders + "\n" +
        "Drive Train\t : " + this.driveTrain + "\n";

  }

}
