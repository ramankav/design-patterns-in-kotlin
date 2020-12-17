interface Criteria {
    fun meetCriteria(persons: List<Person>): MutableList<Person>
}