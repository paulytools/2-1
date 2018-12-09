public class VehicleFrame implements Chassis {

  private String vehicleFrameType;

  VehicleFrame() {

    this.vehicleFrameType = "Unibody";

  }

  VehicleFrame(String vehicleFrameType) {

    this.vehicleFrameType = vehicleFrameType;

  }

  public Chassis getChassisType() {

    return this; // return copy of this class

  }

  public void setChassisType(String vehicleFrameType) {

    this.vehicleFrameType = vehicleFrameType;


  }

  @Override
  public String toString() {
    return "Chassis : " + chassis +
        "Vehicle Frame : " + vehicleFrameType + '\'' +
        '}';
  }
}
