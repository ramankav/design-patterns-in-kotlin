package ramankav

abstract class AbstractCustomer {
    open lateinit var name: String
    abstract val isNil: Boolean
}