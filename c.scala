object Main {
  import java.util._
  val sc = new Scanner(System.in)
  val num = sc.nextInt
  val lh = sc.nextInt
  val rh = sc.nextInt
  
  def aux(n: Int, l: Int, r: Int): Int = {
    if (n == 1) r - l + 1
    else if (r < l) 0
    else {
      aux(n - 1,l + 1,r) + aux(n,l + 1,r)
    }
  }

  def main(args: Array[String]): Unit = {
    println(aux(num, lh, rh))
  }
}
