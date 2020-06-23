// write the BankAccount class here
class BankAccount(var deposited:Long, var witdrawn:Long){
    var balance: Long = deposited - witdrawn
}