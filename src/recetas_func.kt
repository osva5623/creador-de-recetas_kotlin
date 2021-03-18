fun main(){
    val index_options="""Selecciona la opción deseada
                1. Hacer una receta
                2. Ver mis recetas
                3. Salir""".trimIndent()
    var recetas= mutableListOf<String>()
    var name_r= mutableListOf<String>()


    val index_ingredients="""Elige una de las opciones
         
        1. Agua
        2. Leche
        3. Carne
        4. Verduras
        5. Frutas
        6. Cereal
        7. Huevos
        8. Aceite
        9. Tocino
        10.Queso
        11 Terminar""".trimIndent()
    do {
        println(index_options)
        val select_option:String?= readLine()
        when(select_option){
            "1"-> {
                MakeRecipe(index_ingredients,recetas,name_r)
            }
            "2"->{
                viewRecipe(name_r,recetas)
            }

        }
    }while (select_option!="3")

}

fun MakeRecipe(index_ingredients:String,recetas:MutableList<String>,name_r:MutableList<String>){
    do{
        println(index_ingredients)
        val select_option_i:String?= readLine()
        when(select_option_i){
            "1" -> {recetas.add("Agua")
                println("Ingrediente agregado")}
            "2" -> {recetas.add("Leche")
                println("Ingrediente agregado")}
            "3" -> {recetas.add("Carne")
                println("Ingrediente agregado")}
            "4" -> {recetas.add("Verduras")
                println("Ingrediente agregado")}
            "5" -> {recetas.add("Frutas")
                println("Ingrediente agregado")}
            "6" -> {recetas.add("Cereal")
                println("Ingrediente agregado")}
            "7" -> {recetas.add("Huevos")
                println("Ingrediente agregado")}
            "8" -> {recetas.add("Aceite")
                println("Ingrediente agregado")}
            "9" -> {recetas.add("Tocino")
                println("Ingrediente agregado")}
            "10" -> {recetas.add("Queso")
                println("Ingrediente agregado")}
            "11" -> {println("Receta guardada")
                recetas.add("-----------")}
            else ->{
                println("Opción invalida")
            }


        }

    }while (select_option_i!="11")
    println("Ingrese el nombre de la receta")
    var name:String?= readLine()
    name_r.add("$name")
}
fun viewRecipe(name_r: MutableList<String>, recetas: MutableList<String>){
    val len_recetas=name_r.size-1
    //println(len_recetas)
    val len_ingredientes=recetas.size-1

    termina@for (i in 0..len_recetas){
        println(name_r[i])
        for (e in 0..len_ingredientes){
            println(recetas[e])
            if (recetas[e]=="-----------")continue@termina
            continue
        }
    }
}