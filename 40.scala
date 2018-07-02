//Goldbach's conjecture.
import scala.io.StdIn
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object test_40{
	def main(args:Array[String]){
		def prime(n:Int):Boolean={
			for (i <- 2 to n-1){
				if(n%i==0) return false
			}
			true
		}                              
		val n=81                        
		var i=2                          
		var key=true                      
		while(key){
			if(prime(i) && prime(n-i)){
				println(f"$i ${n-i}")
				key=false
			}
			i+=1
		}

	}
}