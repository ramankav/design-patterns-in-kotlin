
import java.util.*


class CriteriaMale : Criteria {
    override fun meetCriteria(persons: List<Person>): MutableList<Person> {
        val malePersons: MutableList<Person> = ArrayList()
        for (person in persons) {
            if (person.gender.equals("MALE", ignoreCase = true)) {
                malePersons.add(person)
            }
        }
        return malePersons
    }
}