/**
  * Created by li on 2017/9/14.
  */

object Hello2{
  def main(args:Array[String]): Unit ={
    val a = 2;

    var b = 3;

    b+=2;

    val d:Int = 2;


    add(d);

    println(add(b));

  }

  def add(a:Int): Int ={
    var c = 0;
    c+=a;
    c+=1;
    c
  }

}