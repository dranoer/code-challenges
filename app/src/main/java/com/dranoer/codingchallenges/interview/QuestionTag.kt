package com.dranoer.codingchallenges.interview

fun main() {

    val questions = listOf(
        Question(
            id = "1",
            title = "how do i install vs code",
            tags = listOf(Tag(tag = "mac"), Tag("vs code"))
        ),
        Question(
            id = "2",
            title = "my program is too slow please help",
            tags = listOf(Tag(tag = "python"), Tag(tag = "ai"))
        )
    )

    val volunteers = listOf(
        Volunteers(
            id = "sam5k",
            tags = listOf(Tag(tag = "mac"), Tag("vs code"))
        ),
        Volunteers(
            id = "a",
            tags = listOf(Tag(tag = "python"))
        )
    )

    val visibleResponse = solution(questionList = questions, volunteerList = volunteers)
    println("The response should contain response ${visibleResponse}")
}

fun solution(questionList: List<Question>, volunteerList: List<Volunteers>): List<Response> {

    val response = mutableListOf<Response>()

    // Search in questions, volunteer
    for (question in questionList) {
        for (volunteer in volunteerList) {
            val a = volunteer.tags.any { question.tags.contains(it) }
            if (a) response.add(Response(questionId = question.id, volunteer = volunteer.id))
        }
    }

    // return a list of response
    return response
}

data class Question(
    val id: String,
    val title: String,
    val tags: List<Tag>,
)

data class Volunteers(
    val id: String,
    val tags: List<Tag>
)

data class Tag(
    val tag: String,
)

data class Response(
    val questionId: String,
    val volunteer: String,
)