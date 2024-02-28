import java.util._
object Main {
  val sc = new Scanner(System.in)
  val N = sc.nextInt

  def main(args: Array[String]): Unit = {
    def isOK(x: Double) = {
        x * (x * (x + 1) + 2) + 3 - N >= 0
    }

    var left = 0.0
    var right = 100.0
    var mid = (right + left) / 2

    while(right - left > 0.01){
        if(isOK(mid)){
            right = mid
        }
        else {
            left = mid
        }
        mid = (right + left) / 2
    }
    println(mid)
  }
}
