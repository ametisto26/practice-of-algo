object Main {
  import java.util._
  val sc = new Scanner(System.in)
  val num = sc.nextInt
  val str = sc.next
  val x = str.split("")


  def main(args: Array[String]): Unit = {
    def aux(n: Int): String = {
        if (n == 0) x(0)
        else {
            aux(n - 1) + x(n) + aux(n - 1)
        }
    }
    println(aux(num - 1))
  }
}
