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


  public Vehicle() {

    this.vehicleManufacturedDate = new Date();
    this.vehicleManufacturer = "Generic";
    this.vehicleMake = "Generic";
    this.vehicleModel = "Generic";
    this.vehicleFrame = new VehicleChassis();
    this.vehicleType = "Generic";
    this.driveTrain = "Generic";
    this.vehicleEngine = new ManufacturedEngine();

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

  public Chassis getChassisType() {
    return vehicleFrame.getChassisType();
  }

  public void setChassisType(String chassisType) {
    vehicleFrame.setChassisType(chassisType);
  }

  public void setVehicleManufacturedDate(Date vehicleManufacturedDate) {
    this.vehicleManufacturedDate = vehicleManufacturedDate;
  }

  public void setVehicleManufacturer(String vehicleManufacturer) {
    this.vehicleManufacturer = vehicleManufacturer;
  }

  public void setVehicleMake(String vehicleMake) {
    this.vehicleMake = vehicleMake;
  }

  public void setVehicleModel(String vehicleModel) {
    this.vehicleModel = vehicleModel;
  }

  public void setVehicleFrame(Chassis vehicleFrame) {
    this.vehicleFrame = vehicleFrame;
  }

  public void setVehicleType(String vehicleType) {
    this.vehicleType = vehicleType;
  }

  public void setVehicleEngine(Engine vehicleEngine) {
    this.vehicleEngine = vehicleEngine;
  }

  public void setDriveTrain(String driveTrain) {
    this.driveTrain = driveTrain;
  }

  public void setEngineCylinders(int engineCylinders) {
    vehicleEngine.setEngineCylinders(engineCylinders);
  }

  public void setEngineManufacturedDate(Date date) {
    vehicleEngine.setEngineManufacturedDate(date);
  }

  public void setEngineManufacturer(String manufacturer) {
    vehicleEngine.setEngineManufacturer(manufacturer);
  }

  public void setEngineMake(String engineMake) {
    vehicleEngine.setEngineMake(engineMake);
  }

  public void setEngineModel(String engineModel) {
    vehicleEngine.setEngineModel(engineModel);
  }

  public void setEngineType(String fuel) {
    vehicleEngine.setEngineType(fuel);
  }

  @Override
  public String toString() {

    return "Manufacturer Name\t: " + this.vehicleManufacturer + "\n" +
        "Manufactured Date\t: " + this.vehicleManufacturedDate + "\n" +
        "Vehicle Make\t: " + this.vehicleMake + "\n" +
        "Vehicle Model\t: " + this.vehicleModel + "\n" +
        "Vehicle Type\t: " + this.vehicleType + "\n" +
        "Engine Manufacturer\t: " + vehicleEngine.. + "\n" +
        "Engine Manufactured\t: " +  + "\n" +
        "Engine Make\t: H-Series\n" +
        "Engine Model\t: H23A1\n" +
        "Engine Type\t: 88 AKI\n" +
        "Engine Cylinders\t: 4\n" +
        "Drive Train\t: 2WD: Two-Wheel Drive";

  }

}
