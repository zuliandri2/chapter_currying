import scala.concurrent.ExecutionContext

object currying {

  def main(args: Array[String]): Unit = {

    val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val res = numbers.foldLeft(0)((m, n) => m + n)
    println(res)

    val anotherres2 = numbers.foldLeft(0)(_ + _)
    println(anotherres2)

    val numberFunc = numbers.foldLeft(List[Int]())_
//    println(numberFunc)

    val square = numberFunc((xs, x) => xs :+ x * x)
    println(square)

    val cubes = numberFunc((xs, x) => xs :+ x * x * x)
    println(cubes)

  }

}
