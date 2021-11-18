
object MyClass {
  def count(changes:List[Int],length:Int,capacity:Int) :Int={
  if (capacity==0) 1
  else if (capacity<0) 0
  else if(length<0 && capacity>=1 ) 0
    return count(changes,length-1,capacity)+count(changes,length,capacity-changes(length-1))
  }


  def main(args:Array[String])={
    val coins:List[Int]=List(1,2,3)
    val m=coins.size
    print(count(coins,m,4))
  }
}
