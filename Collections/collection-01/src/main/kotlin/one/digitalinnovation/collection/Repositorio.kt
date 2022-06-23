package one.digitalinnovation.collection

class Repositorio<T> {
    private val map = mutableMapOf<String, T>()

    fun create(id: String, value: T){
        map[id] = value

    }

    fun frindById(id: String) = map[id]

    fun findAll() = map.values

    fun remove(id: String) = map.remove(id)


}