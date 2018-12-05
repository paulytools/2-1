public class ExteriorFeature implements Feature {

  private String exteriorFeature;

  public ExteriorFeature(String exteriorFeature) {

    this.exteriorFeature = exteriorFeature;

  }

  public String getFeature() {

    return this.exteriorFeature;

  }

  public void setFeature(String feature) {

    this.exteriorFeature = feature;

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
