object temperature {
  
    def toFarenheit(tCel : Double) : Double = {
        return 32.00 + tCel * 1.8000;
    }

    def main(args: Array[String]) : Unit = {
        val temp = 32.00;
        val ftemp = toFarenheit(temp)
        printf(s"Farenheit temperature of $temp degree celcius is: $ftemp \n\n" );
    }
}
