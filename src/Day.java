public enum Day {
    /*Күндөргө enum түзүңүз (Monday, Tuesday ...)
Консолдон бир күндү белгилеңиз.
Эгер Monday болсо - анда "Дуйшөмбү куну жава окуйм" же
Tuesday болсо - анда "Шейшемби күнү англис тили сабагын окуйм"
деп күнгө жараша кайсы сабакты окуганыңызды консолго чыгарыңыз.
Жуманын күндөрүн кыргыз тилинде көрсөтүңүз.*/

    MONDAY("В понидельник новая тема Exception handling"),
    TUESDAY("В вторник session на тему Exception handling"),
    WEDNESDAY("В среду новая тема try"),
    THURSDAY("В четверг session на тему try"),
    FRIDAY("В пятницу новая тема catch"),
    SATURDAY("Практика"),
    SUNDAY("Практикааааааа");
    private final String lesson;

    Day(String lesson) {
        this.lesson = lesson;
    }

    public String getLesson() {
        return lesson;
    }
}
