object SphereVolume {

    def sphereVolume(r : Double) : Double = {
        return (4/3) * Pi * pow(r, 3);
    }

    def main(args: Array[String]) : Unit = {
        val volume = sphereVolume(radius);
        printf(s"Volume of the sphere with radius $radius is : $volume \n\n");
    }
}
