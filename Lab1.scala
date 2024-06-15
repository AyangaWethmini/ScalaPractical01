import scala.math._

object  DiskArea{
    def areaOfDisk(r : Double) : Double = {
        return Pi * pow(r, 2);
    }

    def toFarenheit(tCel : Double) : Double = {
        return 32.00 + tCel * 1.8000;
    }

    def sphereVolume(r : Double) : Double = {
        return (4/3) * Pi * pow(r, 3);
    }

    def calculateShippingCost(n : Int) : Double = {
        if(n < 50) {
            return n * 3;
        }
        return (n - 50) * 0.75 + n * 50;
    }

    def manufacturingCost(p : Double) : Double ={
        return 10 / 14 * p;
    }

    def wholesaleCost(n : Int, p : Double) : Double = {
        return calculateShippingCost(n) + n * manufacturingCost(p);
    }

    def easyTime(d : Double, s : Double): Double = {
        return d / s;
    }

    def tempoTime(d : Double, s : Double): Double = {
        return d / s;
    }

    def fullTime(): Double = {
        return easyTime(2, 8) + easyTime(2, 8) + tempoTime(3, 7);
    }

    def main(args: Array[String]) : Unit = {
        val radius = 5.00;
        val area = areaOfDisk(radius);
        printf(s"The area of a disk with radius $radius is: $area \n\n");

        val temp = 32.00;
        val ftemp = toFarenheit(temp)
        printf(s"Farenheit temperature of $temp degree celcius is: $ftemp \n\n" );

        val volume = sphereVolume(radius);
        printf(s"Volume of the sphere with radius $radius is : $volume \n\n");

        val cost = wholesaleCost(60, 24.95);
        printf(s"Wholesale cost of 60 books is: $cost \n\n");

        val time = fullTime();
        printf(s"Total running time : $time \n\n");

    }
}


