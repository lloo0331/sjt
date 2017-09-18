/**
  * Created by li on 2017/9/14.
  */
class DoubleCau(var aa:Int){

  var values = aa;

  def +(that:DoubleCau): DoubleCau ={
    return new DoubleCau(this.values+2*that.values)
  }

  def -(that:DoubleCau): DoubleCau ={
    return new DoubleCau(this.values-2*that.values)
  }

  def *(that:DoubleCau): DoubleCau ={
    return new DoubleCau(this.values*(2*that.values))
  }

  def /(that:DoubleCau): DoubleCau ={
    return new DoubleCau(this.values/(2*that.values))
  }

  override def toString: String = this.values+""

}

object DoubleCau{
  def main(args:Array[String]): Unit ={

    var cau = new DoubleCau(1)

    var cau2 = new DoubleCau(2)


    println(cau+cau2)

    println(cau-cau2)

    println(cau*cau2)

    println(cau/cau2)

  }
}
