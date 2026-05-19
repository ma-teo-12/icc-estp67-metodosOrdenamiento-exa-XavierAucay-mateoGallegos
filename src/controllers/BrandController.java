package controllers;

import models.Brand;

public class BrandController {
  public Brand[] sortBubbleDesc(Brand[] brands) {
    Brand[] result = brands.clone();
    for (int i = 0; i < brands.length - 1; i++) {
      for (int j = 0; j < brands.length - i - 1; j++) {
        if (result[j].getTotalValidYears() > result[j + 1].getTotalValidYears()) {
          Brand temp = result[j];
          result[j] = result[j + 1];
          result[j + 1] = temp;
        }
      }
    }
    return result;

  }

  public Brand binarySearchByValidYears(Brand[] brands, int validYears, boolean isAscending) {
    int left = 0;
    int right = brands.length - 1;

    while (left <= right) {
      int mid = left + (right - left) / 2;
      int midYears = brands[mid].getTotalValidYears();

      if (midYears == validYears) {
        return brands[mid];
      }

      if (isAscending) {
        if (midYears < validYears) {
          left = mid + 1;
        } else {
          right = mid - 1;
        }
      } else {
        if (midYears > validYears) {
          left = mid + 1;
        } else {
          right = mid - 1;
        }
      }
    }
    return null;
  }

}
