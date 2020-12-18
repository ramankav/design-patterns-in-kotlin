package ramankav

class NameRepository : Container {
    var names = arrayOf("Robert", "John", "Julie", "Lora")
    override fun getIterator(): Iterator {
        return NameIterator()
    }

    private inner class NameIterator : Iterator {
         var index = 0

        override fun hasNext(): Boolean {
            return index < names.size
        }

        override fun next(): Any? {
            return if (hasNext()) {
                names[index++]
            } else null
        }
    }
}