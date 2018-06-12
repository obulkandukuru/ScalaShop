package shopcart

import org.specs2.mutable.Specification

class TestShopCart  extends Specification  {

  "Price of an apple is 0.60'" in {
    ShopCart.getPrice("apple") must be equalTo 0.60
  }
  "Price of an orange is 0.25'" in {
    ShopCart.getPrice("orange") must be equalTo 0.25
  }
  " No-Offer Price - 3 apples and 3 oranges should cost 2.55" in {
    ShopCart.checkoutWithoutOffer(Array("apple", "apple", "apple", "orange", "orange", "orange")) must be equalTo 2.55
  }

}
