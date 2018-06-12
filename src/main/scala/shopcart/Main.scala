package shopcart

object Main {
 
  def main( args: Array[String]) {
   
    println("[ " + args.mkString(", ") + " ] => �" + ShopCart.checkoutWithoutOffer(args))
  }
}