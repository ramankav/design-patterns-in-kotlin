package ramankav

interface Iterator {
    operator fun hasNext(): Boolean
    operator fun next(): Any?
}