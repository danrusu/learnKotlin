package types

// Sealed classes ~ Enums on steroids

sealed class PersonEvent {
    class Awake() : PersonEvent()
    class Asleep() : PersonEvent()
    class Eating(val food: String) : PersonEvent()
}

fun handleEvent(e: PersonEvent) {
    when (e) {
        is PersonEvent.Awake -> println("Awake")
        is PersonEvent.Asleep -> println("Asleep")
        is PersonEvent.Eating -> println("Eating ${e.food}")
        // else -> print('other') - normally not needed if all cases are handled
    }
}


fun main() {
    listOf(
        PersonEvent.Awake(),
        PersonEvent.Eating("spagetti"),
        PersonEvent.Asleep()
    ).forEach { e -> handleEvent(e) }
}