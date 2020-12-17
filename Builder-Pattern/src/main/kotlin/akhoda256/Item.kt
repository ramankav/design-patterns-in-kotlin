package akhoda256


interface Item {
    fun name(): String?
    fun packing(): Packing?
    fun price(): Float
}
