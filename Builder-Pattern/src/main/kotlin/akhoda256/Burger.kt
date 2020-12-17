package akhoda256

abstract class Burger : Item{
    override fun packing(): Packing? {
        return Wrapper()
    }

    abstract override fun price(): Float
}