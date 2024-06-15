object RunTime {
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
        val time = fullTime();
        printf(s"Total running time : $time \n\n");
    }
}
