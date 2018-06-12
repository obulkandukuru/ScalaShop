package shopcart

object ShopCart {
  
  private val priceList: Map[String, Double] = Map(("apple", 0.60), ("orange", 0.25))

  /*
  Calculates total price of all items in the cart without discount
   */

  def checkout(items: Array[String]): Double = {
    val total = items.flatMap(price).sum
    BigDecimal(total).toDouble 
  }
/*
Retrieve price of item from priceList
 */
  def getPrice
  (item: String): Double = {
    priceList.getOrElse(item toLowerCase(), 0)
  }

  def price(item: String): Option[Double] = priceList.get(item toLowerCase)


  /*
     Calculates total price of all items in the cart without discount
      */

  def checkoutWithoutOffer(items: Array[String]): Double = {
    val total = items.flatMap(price).sum
    BigDecimal(total).toDouble
  }

}

