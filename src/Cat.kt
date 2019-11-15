class Cat(val name: String, private val initialWeight: Double) {

    private var weight: Double = initialWeight

    fun feed(food: Double) {
        this.weight += food
        println("Котик стал толще на $food кг")
    }

    fun goToToilet() {
        this.weight -= this.weight / 10
    }

    fun getStatus() {
        if(this.weight < initialWeight){
            println("Котик голоден, покорми его скорее")
        }
        else if(this.weight >= initialWeight && this.weight <= initialWeight * 2) {
            println("Котик покушал и чувствует себя хорошо")
        }
        else{
            println("Котик сильно переел, ему нужно отдохнуть")
        }
    }

    fun getWeight() {
        println("Котик весит ${this.weight} кг")
    }
}