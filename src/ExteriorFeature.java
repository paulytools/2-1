public class ExteriorFeature implements Feature {

  String exteriorFeature;

  public ExteriorFeature() {

    this.exteriorFeature = "Something";

  }

  public ExteriorFeature(String exteriorFeature) {
    this.exteriorFeature = exteriorFeature;
  }


  public String getExteriorFeature() {



  }

  public void setExteriorFeature(String exteriorFeature) {
    this.exteriorFeature = exteriorFeature;
  }

  @Override
  public String toString() {
    return "Exterior [Generic]";
  }

  public static void printAllFuelGradeValues() {

    System.out.println("Exterior [Generic]");


  }

  public static void printSpecificFuelGradeValues() {

    System.out.println("Exterior [Fog Lamps]");

  }

}