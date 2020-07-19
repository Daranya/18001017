package question01

object cipherCeaser
{
    val alphabet = 'A' to 'Z'
    val alphabetS = 'a' to 'z'

    def Encryption(text: String, key: Int) = text.map
    {
       case c if alphabet.contains(c) => alphabet((c-alphabet.head+key+alphabet.size)%alphabet.size)
       case c if alphabetS.contains(c) => alphabetS((c-alphabetS.head+key+alphabetS.size)%alphabetS.size)
       case c => c
    }

    def Decryption(text: String, key: Int) = Encryption(text, -key)

    def Cipher(message: String,key: Int): Unit =
    {
        val enc=Encryption(message,key)
        println("Code message: "+enc)

        val dec=Decryption(enc,key)
        print("Real message: " +dec)
    }

   def main(args: Array[String]): Unit =
    {
        println("Enter the message: ")
        val message:String=scala.io.StdIn.readLine()

        println("Enter the shift: ")
        val key:Int=scala.io.StdIn.readInt()

        Cipher(message, key)
    }
}
