//Calculate Euler's totient function phi(m).
import scala.io.StdIn
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object test_34{
	def main(args:Array[String]){
		def prime(n:Int):Boolean={
			for (i <- 2 to n-1){
				if(n%i==0) return false
			}
			true
		}                                         
		val n=15                                 
		var count=0                               
		for (i <- 2 to n){
			if(prime(i)) count+=1
		}
		print(count)
	}
}