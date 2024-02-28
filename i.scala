import scala.math.pow
import java.util._
object Main {
  val sc = new Scanner(System.in)
  val N = sc.nextInt
  val M = sc.nextInt

  def main(args: Array[String]): Unit = {
    var left = 1.0
    var right = 100000.0

    def isLarger(x: Double): Boolean = {
        val result = (N + 1) * pow(x, 5) + pow(x, 4) + pow(x, 3) + pow(x, 2) + pow(x, 1) + 1
        result > M
    }

    var mid = (left + right) / 2  
    
    while(right - left > 0.01){
        mid = (left + right) / 2        
        if(isLarger(mid)) right = mid
        else left = mid
    }

    println(mid)
  }
}
