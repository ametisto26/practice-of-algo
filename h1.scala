import java.util._
object Main {
  val sc = new Scanner(System.in)
  val N = sc.nextInt

  def main(args: Array[String]): Unit = {
    def f(x: Double) = {
        x * (x * (x + 1) + 2) + 3 - N
    }
    def fp(x: Double) = {
        3 * x * x + 2 * x + 2
    }    
    
    var ans = 0.0
    var next = ans - f(ans) / fp(ans)

    while(next - ans >= 0.01 || ans - next >= 0.01){
      ans = next
      next = ans - f(ans) / fp(ans)
    }
    println(ans)
  }
}
