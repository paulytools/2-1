public class VehicleChassis implements Chassis {

  String chassisName;


  VehicleChassis() {

    this.chassisName = chassis;

  }

  VehicleChassis(String chassisName) {

    this.chassisName = chassisName;

  }

  public VehicleChassis getChassisType() {

    return this;

  }

  public void setChassisType(String vehicleChassis) {

    this.chassisName = vehicleChassis;

  }

  public String toString() {

    return "Chassis Name\t\t\t: " + this.chassisName;

  }

}
