package ramankav

class NullCustomer : AbstractCustomer() {
    override var name: String
        get() = "Not Available in Customer Database"
        set(name) {
            super.name = name
        }

    override val isNil: Boolean
        get() = true
}
