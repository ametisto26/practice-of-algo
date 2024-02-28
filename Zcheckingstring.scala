// object Main {
    val s = """}]"""
    val t = """}]"""

    def main(str: String, str2: String) = { //(args: Array[String]):Unit = {
        val n = str.length
        val n2 = str2.length
        
        var isSame = true
        // var result: List[String] = List()

        if (n * n2 == 0) println("Empty")
        else if (n != n2) println("Different Length")
        else {
            for (i <- 0 to n - 1){
                isSame = isSame && (str(i) == str2(i))
            }
            println(isSame)
        }
    }
    main(s, t)
// }

