public class ExteriorFeature implements Feature {

  private String exteriorFeature;

  public ExteriorFeature() {

    this.exteriorFeature = "Default";

  }

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

    return "Exterior [" + exteriorFeature + "]";

  }


}
