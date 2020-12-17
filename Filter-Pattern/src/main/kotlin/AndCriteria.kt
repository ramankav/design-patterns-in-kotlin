class AndCriteria(private val criteria: Criteria, private val otherCriteria: Criteria) : Criteria {
    override fun meetCriteria(persons: List<Person>): MutableList<Person> {
        val firstCriteriaPersons = criteria.meetCriteria(persons)
        return otherCriteria.meetCriteria(firstCriteriaPersons)
    }

}