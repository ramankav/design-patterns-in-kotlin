package ramankav

class RealCustomer(name: String) : AbstractCustomer() {
    override var name: String
        get() {
            return super.name;
        }
        set(name) {
            super.name = name
        }

    override val isNil: Boolean
        get() = false

    init {
        this.name = name
    }
}