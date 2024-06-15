import scala.math._

object DiskArea{

    def areaOfDisk(r : Double) : Double = {
        return Pi * pow(r, 2);
    }

    def main(args: Array[String]) : Unit = {
        val radius = 5.00;
        val area = areaOfDisk(radius);
        printf(s"The area of a disk with radius $radius is: $area \n\n");
    }
}