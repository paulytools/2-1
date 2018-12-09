public class InteriorFeature implements Feature {

  String interiorFeature;

  public InteriorFeature() {

    this.interiorFeature = "Generic";

  }


  public InteriorFeature(String interiorFeature) {

    this.interiorFeature = interiorFeature;

  }

  public String getFeature() {

    return this.interiorFeature;

  }

  public void setFeature(String interiorFeature) {

    this.interiorFeature = interiorFeature;

  }

  @Override
  public String toString() {
    return "Interior [Generic]";
  }

  public static void printAllFuelGradeValues() {

    System.out.println("Interior [Generic]");


  }

  public static void printSpecificFuelGradeValues() {

    System.out.println("Interior [Climate Control]");

  }


}
