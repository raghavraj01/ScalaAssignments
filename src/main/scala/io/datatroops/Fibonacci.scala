package io.datatroops

trait Fibonacci {
  def fibonacciSeries(): Unit
}

class FibonacciSeries extends Fibonacci {
  var a = 0
  var b = 1
  var c = 0

  def fibonacciSeries(): Unit = {
    println("Required Fibonacci Series:")
    print(a + " " + b)
    for (i <- 1 to 10) {
      c = a + b
      print(" " + c)
      a = b
      b = c
    }
  }
}

object ObjectFibonacci {
  var fs = new FibonacciSeries()
  fs.fibonacciSeries()
}
