class OrCriteria(private val criteria: Criteria, private val otherCriteria: Criteria) : Criteria {
    override fun meetCriteria(persons: List<Person>): MutableList<Person> {
        val firstCriteriaItems = criteria.meetCriteria(persons)
        val otherCriteriaItems = otherCriteria.meetCriteria(persons)
        firstCriteriaItems.addAll(otherCriteriaItems);
        return firstCriteriaItems
    }

}