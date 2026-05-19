package models;

public class CarYear {
  private boolean isValid;
  private int year;

  public CarYear() {
  }

  public CarYear(int year, boolean isValid) {
    this.isValid = isValid;
    this.year = year;
  }

  public boolean isValid() {
    return isValid;
  }

  public void setValid(boolean isValid) {
    this.isValid = isValid;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  @Override
  public String toString() {
    return "CarYear [isValid = " + isValid + ", year = " + year + "]";
  }

}
