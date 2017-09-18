import queue.IntQueue

/**
  * Created by li on 2017/9/16.
  */
trait Doubling extends IntQueue{

  abstract override def put(x: Int){super.put(2*x)}

}
