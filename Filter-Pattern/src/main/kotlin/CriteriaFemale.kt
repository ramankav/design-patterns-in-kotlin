
import java.util.*


class CriteriaFemale : Criteria {
    override fun meetCriteria(persons: List<Person>): MutableList<Person> {
        val femalePersons: MutableList<Person> = ArrayList()
        for (person in persons) {
            if (person.gender.equals("FEMALE", ignoreCase = true)) {
                femalePersons.add(person)
            }
        }
        return femalePersons
    }
}