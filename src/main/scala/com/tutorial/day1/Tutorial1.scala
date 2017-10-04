package com.tutorial.day1

/**
 * @see https://github.com/tvorogme/scala-tutorial/blob/master/day1/basics.ipynb
 */

object Tutorial1 extends App {

//TODO Переменная - это var
//TODO Константа - это val

  var sum: Int = 5
  sum += 5

  println( s"suma = $sum" )

  var bValue: Boolean = true
  var lValue: Long = 100000000
  var dValue: Double = 123.456
  var sValue: String = """Hello "Sasha"! """
  println( sValue )

  val (x,y) = (1,2)
  val tmp = (3,4)
  println(tmp._1)
  println(tmp._2)

  val randomArray = Array("Андрей", "Творог", "Жизнь")
  val randomList = List("Python", "Мера", "Тонна")
  val randomSet = Set("Гавана", "Классный", "Кокаин", "Смерть")
  val randomMap = Map("Я" -> "крутой", "Собака" -> "кошка", "Граф" -> "Петр 1")
  randomArray.mkString(" ").foreach( print(_) )
  println( "\n" + randomArray(1) )
  println( randomList(1) )
  println( randomMap("Я") )

  randomList :+ "Андрей"
  "Андрей" :: randomList
  randomList ++ List("LOL", "KEK", "CHEBUREK")
  println( randomList )

  for (i <- randomList) {
    println(i)
  }

  def f(ints :Int*){
    for (i <- ints) {print(s"-$i-")}
  }
  f(1,2,3,4)

  def ff(x: Int = 5) = print(s"\n$x\n")
  ff()

  //TODO Неявная передача параметра, что-то новое для питонистов
  def fff(x: String)(implicit y:String) = println (s"$x есть ещё и $y")
  implicit var y1 = "неявный y1"
  fff("явный x1")
  fff("явный x1")("явный y1")

  ///////////////////////////////////////////////
  // OOП


  //TODO По стандарту всё публично.
  class C {
    def m1 = println("m1")
    private def m2 = println("m2") // Но мы можем поспротивиться этому
  }
  val c = new C
  println( c.m1 )

  //TODO В Scala мы создаём конструкторы, а не классы
  class Point3D(val x:Int, var y:Int, z:Int) {   // Тело конструктора
  private var color = "RED"
    def method() = s"Point($x, $y, $z) with color: $color"
  }
  val p = new Point3D(1,2,3)
  println( p.method )

  }
