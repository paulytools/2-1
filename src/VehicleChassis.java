public class VehicleChassis implements Chassis {

  String chassisName;

  public static void main(String[] args) {

    VehicleChassis vehicleChassis1 = new VehicleChassis();
    VehicleChassis vehicleChassis2 = new VehicleChassis("Kool Chassis");

    printDetails();

  }

  VehicleChassis() {

    this.chassisName = chassis;

  }

  VehicleChassis(String chassisName) {

    this.chassisName = chassis;

  }

  public Chassis getChassisType() {

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
