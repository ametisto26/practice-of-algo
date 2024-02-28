object Main {
  import java.util._
  val sc = new Scanner(System.in)
  val num = sc.nextInt
  def main(args: Array[String]): Unit = {
    def aux(n: BigInt): BigInt= {
      if(n == 1 || n == 2) n
      else {
        n * aux(n - 2)
      }
    }
    println(aux(num))
  }
}
