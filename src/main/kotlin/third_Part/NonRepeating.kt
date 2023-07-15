package third_Part

class NonRepeating {
    fun main(){
        //First parameter
        val chain = "aaaaf"

        //Call method to check String chain
        val index = checkString(chain)

        //Result
        if(index == -1){
            println("All letters appear more than once")
        }else{
            println("The letter ${chain[index]} appears only once before the others, located in index ${index}")
        }
    }

    private fun checkString(chain: String):Int{
        var count = -1
        val chainL = chain.length-1
        for(i in 0..chain.length){
            if(count == 0){
                return i-1
            }else if(i >= chain.length){
                return -1
            }
            count = -1
            outer@ for(j in 0..chainL){
                if(chain[i] == chain[j]){
                    count++
                    if(count == 1){
                        break@outer
                    }
                }
            }

        }
        return -1
    }
}

fun main(){
    val nonRepeating = NonRepeating()
        nonRepeating.main()
}