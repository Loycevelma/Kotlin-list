fun main(){
 println(isEven(23))
 println(isEven(12))
    println((Product("Watermelon",59.4,50,"Grocery")))
    println((Product("Meat",2.0,100,"hygene")))
    println((Product("MIlk",1.5,200,"other")))
println(names(arrayOf("Catherine","Juliet","Loyce","Mary","celine")))


    var number=values("Pineaple")



}
 fun isEven(num:Int):Boolean {
     if (num % 2 == 0) {
         return true
     } else  {
         return false
     }

 }

data class Product(var name:String,var weight:Double,var price:Int,var category:String){
    fun myOpinion(Product:Product){
        var groceriesList= mutableListOf<Product>()
        var hygeneList= mutableListOf<Product>()
        var otherList= mutableListOf<Product>()

        when (category){
            "Groceries"->groceriesList.add(Product)
            "Hygene"-> hygeneList.add(Product)
            else->otherList.add(Product)


        }
        println(groceriesList)
        println(hygeneList)
        println(otherList)
    }
}
fun values(a:String):String{
    var b=" "
    for (values in a){
        if(a.indexOf(values)%2==0){
            print(values)
        }
    }
    return b
}
fun names(name:Array<String>):List<String>{
    var nameList= mutableListOf<String>()
    name.forEach { names->
        if (names.length%2==0){
            nameList.add(names)
        }

    }
    return nameList

}