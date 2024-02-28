object Main {
  import java.util._
  val sc = new Scanner(System.in)
  val a = sc.nextInt
  val b = sc.nextInt

  def main(args: Array[String]): Unit = {
    def aux(n: Int): Int = {
      if(n == a) a
      else {
        n + aux(n - 1)
      }
    }
    println(aux(b))
  }
}
