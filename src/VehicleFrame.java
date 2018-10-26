public class VehicleFrame implements Chassis {

  String vehicleFrameType;

  String vehicleFrameType = "Unibody";


  public static void main(String[] args) {

    VehicleFrame vehicleFrame1 = new VehicleFrame();
    VehicleFrame vehicleFrame2 = new VehicleFrame(vehicleFrameType);

  }

  VehicleFrame() {

    this.vehicleFrameType = "Unibody";

  }

  VehicleFrame(String vehicleFrameType) {

    this.vehicleFrameType = vehicleFrameType;

  }

  public Chassis getChassisType() {

    return this;

  }

  public void setChassisType(String vehicleFrameType) {

    this.vehicleFrameType = vehicleFrameType;


  }

  public String toString() {

    return "Chassis\t: Chassis\n" +
        "Vehicle Frame\t: Unibody";

  }

}
