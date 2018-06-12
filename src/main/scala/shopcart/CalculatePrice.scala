package shopcart

object CalculatePrice {

  def noOfferPrice(numberOfItems: Int, costOfOne: Double): Double = ( numberOfItems * costOfOne ) 
  
  def offerPriceOrange(numberOfItems: Int, costOfOne: Double): Double = (numberOfItems/3)*(2*costOfOne) + (numberOfItems%3)* (1*costOfOne)
  
  def offerPriceApple(numberOfItems: Int, costOfOne: Double): Double = (numberOfItems/2)*(1*costOfOne) + (numberOfItems%2)* costOfOne
  
  //  orange sum += (size/3)*(2*unitPrice) + (size%3)* (1*unitPrice);
 // apple  sum += (size/2)*(1*unitPrice) + (size%2)* unitPrice;
  
  /*
   * Calculate price of a single item by its number passed in as an option
   */
  def calculatePrice(item: String): Int => Double = {
    val price: Double = ShopCart.getPrice(item)
    item toLowerCase() match {
      case "apple" => (numberOfItems:Int) => offerPriceApple(numberOfItems, price)

      case "orange" => (numberOfItems:Int) => offerPriceOrange(numberOfItems, price)
      case _ => (numberOfItems:Int) => numberOfItems * price
    }
  }
}
