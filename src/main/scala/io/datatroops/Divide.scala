package io.datatroops

trait Divide {
  def divide()
}

class Dividation extends Divide {
  var a = 20
  var b = 4

  def divide(): Unit = {
    println("Divide Result is: " + (a / b))
  }
}

object ObjectDivide {
  var div = new Dividation()
  div.divide()
}
