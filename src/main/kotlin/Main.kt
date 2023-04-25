fun main(args: Array<String>) {
passwordCheck("roseKivuvandu")
    multiples(1..100)
    randomString()
}

//Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not. (6pts)

fun randomString(word:String):Any{
//    val check=word.random()
    var vowels = arrayOf("a", "e", "i", "o", "u")
    val first = word[0]
    for (first in word) {
        if (first === vowels) {
            return first
        } else {
            println("First character is a constant")
        }
        var lengthOfString = word.length
        return lengthOfString

        var firstChar = word[0]
        return firstChar

        var lastChar = word[-1]
        return lastChar
    }
}







//Create a function that takes in a password as a parameter. For a password to
//be valid it must meet the following conditions:
//1. Must be at least 8 characters long
//2. Must be at most 16 characters long
//3. Must not be “password”
//4. Must contain a digit
//Your function should determine whether the password provided is valid or not.
//The function returns true/false (7pts)

fun passwordCheck(password:String){
//    var characters=password.length>=8 && password<=16
    for(x in password){
        if(password.length>=8 && password.length<=16 && password!=password){
            println("Password is valid")
        }
        else{
            println("Not valid")
        }
    }
}


//Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 and 8 it should print out “Bingo!” (5pts)
fun multiples(nums:IntRange){
    for (n in nums){
        if(n%6==0 && n%8==8){
            println("Bingo!")
        }
        else if(n%6==0){
            println("$n is multiple of 6")
        }
        else  if(n%8==0){
            println("$n is mulitple of 8")
        }
        else{
            println("$n")
        }
    }
}

//Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
//a. deposit(amount: Double) - Increments the balance by the amount
//deposited
//b. withdraw(amount: Double) - Decrements the balance by the amount
//withdrawn
//c. details() - Prints out the account number and balance and name in
//this format: “Account number x with balance y is operated by z” (6pts)
 open data class CurrentAccount(var accountName:String, var accountNumber:Int, var balance:Double ){
    open  fun deposit(amount: Double):Double{
         balance+=amount
         return balance

     }

    open fun withdraw(amount: Double):Double{
        balance-=amount
        return balance
    }
    open  fun details(){
        println("Account number $accountNumber with balance $balance is operated by $accountName")
    }
 }

//Create another class SavingsAccount. It has the same functions and
//attributes as the current account except for one attribute, withdrawals: Int.
//Withdrawals is a counter variable that is used to keep track of how many
//withdrawals have been made from the account in a year. The only other
//difference is that the savings account withdraw() method first checks if the
//number of withdrawals is less than 4 for it to allow one to withdraw money
//from the account. It also increments the withdrawals attribute after a
//successful withdrawal (6pts)

data class  SavingAccount(var accountName:String, var accountNumber:Int, var balance:Double):CurrentAccount(accountName,accountNumber,balance){

}









