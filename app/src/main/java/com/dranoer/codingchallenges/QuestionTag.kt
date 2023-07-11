package com.dranoer.codingchallenges

fun main() {

    val questions = listOf(
        question(
            id = "1",
            title = "how do i install vs code",
            tags = listOf(tag(tag = "mac"), tag("vs code"))
        ),
        question(
            id = "2",
            title = "my program is too slow please help",
            tags = listOf(tag(tag = "python"), tag(tag = "ai"))
        )
    )

    val volunteers = listOf(
        volunteers(
            id = "sam5k",
            tags = listOf(tag(tag = "mac"), tag("vs code"))
        ),
        volunteers(
            id = "a",
            tags = listOf(tag(tag = "python"))
        )
    )

    val visibleResponse = solution(questionList = questions, volunteerList = volunteers)
    println("The response should contain response ${visibleResponse}")
}

fun solution(questionList: List<question>, volunteerList: List<volunteers>): List<response> {

    var response = mutableListOf<response>()

    // Search in questions, volunteer
    for (question in questionList) {
        for (volunteer in volunteerList) {
            val a = volunteer.tags.any { question.tags.contains(it) }
            if (a) response.add(response(questionId = question.id, volunteer = volunteer.id))
        }
    }

    // return a list of response
    return response
}

data class question(
    val id: String,
    val title: String,
    val tags: List<tag>,
)

data class tag(
    val tag: String,
)

data class volunteers(
    val id: String,
    val tags: List<tag>
)

data class response(
    val questionId: String,
    val volunteer: String,
)