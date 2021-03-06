package com.timlab.maketherightchoice

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina",
            "Australia",
            "Armenia",
            "Austria",
            1
        )
        questionsList.add(que1)

        val que2 = Question(
            2,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Angola",
            "Austria",
            "Australia",
            "Armenia",
            3
        )
        questionsList.add(que2)

        val que3 = Question(
            3,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Belarus",
            "Brazil",
            "Brunei",
            "Belize",
            2
        )
        questionsList.add(que3)

        val que4 = Question(
            5,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Germany",
            "Georgia",
            "Greece",
            "none of these",
            1
        )
        questionsList.add(que4)

        val que5 = Question(
            2,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Gabon",
            "France",
            "Fiji",
            "Finland",
            3
        )
        questionsList.add(que5)

        val que6 = Question(
            2,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Ethiopia",
            "Egypt",
            "Dominica",
            "Denmark",
            4
        )
        questionsList.add(que6)

        val que7 = Question(
            2,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "Jordan",
            "New Zeeland",
            "Sudan",
            "Palestine",
            2
        )
        questionsList.add(que7)

        val que8 = Question(
            2,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait",
            "New Zeeland",
            "Ireland",
            "none of these",
            1
        )
        questionsList.add(que8)

        val que9 = Question(
            2,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Hungary",
            "Iran",
            "Ireland",
            "India",
            4
        )
        questionsList.add(que9)

        val que10 = Question(
            2,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Belgium",
            "Jordan",
            "Iran",
            "none of these",
            1
        )
        questionsList.add(que10)



        return questionsList
    }

}