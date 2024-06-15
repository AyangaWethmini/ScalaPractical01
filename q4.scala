object ManufactCost {
  def calculateShippingCost(n: Int): Double = {
    if (n < 50) {
      return n * 3;
    }
    return (n - 50) * 0.75 + n * 50;
  }

  def manufacturingCost(p: Double): Double = {
    return 10 / 14 * p;
  }

  def wholesaleCost(n: Int, p: Double): Double = {
    return calculateShippingCost(n) + n * manufacturingCost(p);
  }


  def main(args: Array[String]) : Unit = {
        val cost = wholesaleCost(60, 24.95);
        printf(s"Wholesale cost of 60 books is: $cost \n\n");
    }
}
