import java.util.Date;

public class Vehicle implements Engine, Chassis {

  private Date vehicleManufacturedDate;
  private String vehicleManufacturer;
  private String vehicleMake;
  private String vehicleModel;
  private Chassis vehicleFrame;
  private String vehicleType;
  private String driveTrain;
  private Engine vehicleEngine;
  private String vehicleChassis;


  public Vehicle() {

    Date date = new Date();

    this.vehicleManufacturedDate = date;
    this.vehicleManufacturer = "Generic";
    this.vehicleMake = "Generic";
    this.vehicleModel = "Generic";
    this.vehicleFrame = new Vehicle();
    this.vehicleType = "Generic";
    this.driveTrain = "Generic";
    this.vehicleEngine = new Vehicle();


  }

  public Vehicle(Date vehicleManufacturedDate, String vehicleManufacturer,
      String vehicleMake, String vehicleModel, Chassis vehicleFrame, String vehicleType,
      String driveTrain, Engine vehicleEngine) {

    this.vehicleManufacturedDate = vehicleManufacturedDate;
    this.vehicleManufacturer = vehicleManufacturer;
    this.vehicleMake = vehicleMake;
    this.vehicleModel = vehicleModel;
    this.vehicleFrame = vehicleFrame;
    this.vehicleType = vehicleType;
    this.driveTrain = driveTrain;
    this.vehicleEngine = vehicleEngine;


  }

  public void setEngineCylinders(int engineCylinders) {

    this.setEngineCylinders(engineCylinders);

  }


  public void setEngineManufacturedDate(Date date) {

    this.setEngineManufacturedDate(date);

  }

  public void setEngineManufacturer(String manufacturer) {

    this.setEngineManufacturedDate(vehicleManufacturedDate);

  }

  public Chassis getChassisType() {



  }

  public void setEngineMake(String engineMake) {
    this.setEngineMake(engineMake);

  }


  public void setEngineModel(String engineModel) {

    this.setEngineModel(engineModel);

  }

  public void setDriveTrain(String driveTrain) {

    this.setDriveTrain(driveTrain);

  }


  public void setEngineType(String fuel) {

    this.setEngineType(fuel);

  }

  public void setChassisType(String vehicleChassis) {

    this.vehicleChassis = vehicleChassis;

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
        "Drive Train\t: 2WD: Two-Wheel Drive";

  }

  public static void printGenericStrings() {

    Date date = new Date();

    System.out.printf("Manufacturer Name\t: Honda\n" +
        "Manufactured Date\t: " + date + "\n" +
        "Vehicle Make\t: Honda\n" +
        "Vehicle Model\t: Prelude\n" +
        "Vehicle Type\t: null\n" +
        "Engine Manufacturer\t: Honda" +
        "Engine Manufactured\t: " + date + "\n" +
        "Engine Make\t: Generic\n" +
        "Engine Model\t: Generic\n" +
        "Engine Type\t: 88 AKI\n" +
        "Engine Cylinders\t: 0\n" +
        "Drive Train\t: 2WD: Two-Wheel Drive");

  }

  public static String printSpecificStrings(String vehicleManufacturer,
      Date vehicleManufacturedDate,
      String vehicleMake, String vehicleModel, String vehicleType,
      String engineManufacturer, Date engineManufactured,
      String engineModel, String engineType, int engineCylinders, String driveTrain) {

    return "Manufacturer Name\t: " + vehicleManufacturer + "\n" +
        "Manufactured Date\t: " + vehicleManufacturedDate + "\n" +
        "Vehicle Make\t: " + vehicleMake + "\n" +
        "Vehicle Model\t: " + vehicleModel + "\n" +
        "Vehicle Type\t: " + vehicleType + "\n" +
        "Engine Manufacturer\t: " + engineManufacturer + "\n" +
        "Engine Manufactured\t: " + vehicleManufacturedDate + "\n" +
        "Engine Make\t: " + vehicleManufacturer + "\n" +
        "Engine Model\t: " + engineModel + "\n" +
        "Engine Type\t: " + engineType + "\n" +
        "Engine Cylinders\t: " + engineCylinders +"\n" +
        "Drive Train\t: " + driveTrain;


  }

  public Date getVehicleManufacturedDate() {
    return vehicleManufacturedDate;
  }

  public String getVehicleManufacturer() {
    return vehicleManufacturer;
  }

  public String getVehicleMake() {
    return vehicleMake;
  }

  public String getVehicleModel() {
    return vehicleModel;
  }

  public Chassis getVehicleFrame() {
    return vehicleFrame;
  }

  public String getVehicleType() {
    return vehicleType;
  }

  public String getDriveTrain() {
    return driveTrain;
  }

  public Engine getVehicleEngine() {
    return vehicleEngine;
  }

  public String getVehicleChassis() {
    return vehicleChassis;
  }
}
