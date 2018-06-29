//A list of prime numbers.
import scala.io.StdIn
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object test_39{
	def main(args:Array[String]){
		def prime(n:Int):Boolean={
			for (i <- 2 to n-1){
				if(n%i==0) return false
			}
			true
		}                                         
		val n=5
		val m=27                           
		val arr=new ArrayBuffer[Int]
                             
		for (i <- n to m){
			if(prime(i)) arr+=i
		}
		print(arr.toList)
	}
}