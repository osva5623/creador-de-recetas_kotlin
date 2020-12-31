fun main(){
    val name_recetas= mutableListOf<String>()
    val ingredients= mutableListOf<String>()

    name_recetas.add("Masa de pizza")
    name_recetas.add("lasañe")

    ingredients.add("masa")
    ingredients.add("agua")
    ingredients.add("sal")
    ingredients.add("----------")
    ingredients.add("pasta")
    ingredients.add("carne")
    ingredients.add("queso")
    ingredients.add("----------")

    val len_recetas=name_recetas.size-1
    //println(len_recetas)
    val len_ingredientes=ingredients.size-1

    termina@for (i in 0..len_recetas){
        println(name_recetas[i])
        for (e in 0..len_ingredientes){
            println(ingredients[e])
            if (ingredients[e]=="----------")continue@termina
            continue
        }
    }


}