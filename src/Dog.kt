class Dog(val name: String, private val initialWeight: Double) {

    private var weight: Double = initialWeight

    fun feed(food: Double) {
        this.weight += food
        println("Песик стал толще на $food кг")
    }

    fun goToToilet() {
        this.weight -= this.weight / 10
    }

    fun getStatus() {
        if(this.weight < initialWeight){
            println("Песик голоден, покорми его скорее")
        }
        else if(this.weight >= initialWeight && this.weight <= initialWeight * 2) {
            println("Песик покушал и чувствует себя хорошо")
        }
        else{
            println("Песик сильно переел, ему нужно отдохнуть")
        }
    }

    fun getWeight() {
        println("Песик весит ${this.weight} кг")
    }
}