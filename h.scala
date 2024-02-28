import java.util._
object Main {
  val sc = new Scanner(System.in)
  val N = sc.nextInt

  def main(args: Array[String]): Unit = {
    def isOK(x: Double) = {
        x * (x * (x + 1) + 2) + 3 - N >= 0
    }
    var ans = 0.0
    while(!isOK(ans)){
      ans = ans + 0.01
    }
    println(ans)
  }
}
