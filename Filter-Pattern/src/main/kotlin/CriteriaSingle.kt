
import java.util.*


class CriteriaSingle : Criteria {
    override fun meetCriteria(persons: List<Person>): MutableList<Person> {
        val singlePersons: MutableList<Person> = ArrayList()
        for (person in persons) {
            if (person.maritalStatus.equals("SINGLE", ignoreCase = true)) {
                singlePersons.add(person)
            }
        }
        return singlePersons
    }
}