public class VehicleChassis implements Chassis {

  String chassisName;


  VehicleChassis() {

    this.chassisName = chassis;

  }

  VehicleChassis(String chassisName) {

    this.chassisName = chassis;

  }

  public VehicleChassis getChassisType() {

    return this;

  }

  public void setChassisType(String vehicleChassis) {

    this.chassisName = vehicleChassis;

  }

  public String toString() {

    return "Chassis Name\t\t\t: Chassis";

  }

  public static void printDetails() {

    System.out.println("Chassis\t\t: Chassis");
    System.out.println("Vehicle Frame\t: Unibody");
    System.out.println("Vehicle Frame\t: Ladder Frame");

  }

}
