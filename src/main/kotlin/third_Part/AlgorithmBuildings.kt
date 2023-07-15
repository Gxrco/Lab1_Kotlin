package third_Part

class AlgorithmBuildings {
    fun main(){
        //Set the height of each building
        val input = arrayOf(3, 5, 4, 4, 3, 1, 3, 2)
        val output = mutableListOf<Int>()

        //Use 0 parameter for east direction, and 1 for west
        val direction = 0 //Initial value "EAST"

        checkVisible(input, direction, output)

        //Result
        println(output.joinToString())
    }

    private fun checkVisible(input: Array<Int>, direction: Int, output: MutableList<Int>){
        val sizeI = input.size-1
        if(direction == 1){
            input.reverse()
        }
        for(i in 0..sizeI){
            var j = i+1
            var check = false

            if(i != sizeI) {
                while (!check) {
                    if (j > sizeI) {
                        output.add(i)
                        check = true
                    }else if (input[i] > input[j] && input[i] != input[j]){
                        j++
                    }else{
                        check = true
                    }
                }
            }else{
                output.add(i)
            }
        }
        if(direction == 1){
            var indexes = input.indices.toList()
            indexes = indexes.reversed()
            val values = mutableListOf<Int>()
            for (i in output){
                values.add(i)
            }
            output.clear()
            for(j in values){
                output.add(indexes[j])
            }
        }
    }
}

fun main(){
    val algorithmBuildings = AlgorithmBuildings()
    algorithmBuildings.main()
}