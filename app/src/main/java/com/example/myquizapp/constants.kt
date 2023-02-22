package com.example.myquizapp

object constants {
  fun  getQuestions():ArrayList<Question>{
      val questionsList = ArrayList<Question>()
      val que1 = Question(
          1,
          "What's AIET apreviation for?",
          R.drawable.ic_of_aiet,
          "Autologous Immune Enhancement Therapy",
          "Alexandria Higher Institute of Engineering and Technology",
          "Alexandria Institute Engineering Technology",
          "All of the above",
          4


      )
      questionsList.add(que1)

      val que2 = Question(
          2, "What country does this flag belong to?",
          R.drawable.ic_flag_of_egypt,
          "Mother of nations", "Masr",
          "Egypt", "all of the obove", 4
      )

      questionsList.add(que2)

      // 3
      val que3 = Question(
          3, "What country does this flag belong to?",
          R.drawable.ic_flag_of_brazil,
          "Belarus", "Belize",
          "Brunei", "Brazil", 4
      )

      questionsList.add(que3)

      // 4
      val que4 = Question(
          4, "What country does this flag belong to?",
          R.drawable.ic_flag_of_belgium,
          "Bahamas", "Belgium",
          "Barbados", "Belize", 2
      )

      questionsList.add(que4)

      // 5
      val que5 = Question(
          5, "What country does this flag belong to?",
          R.drawable.ic_flag_of_denmark,
          "Gabon", "France",
          "Denmark", "Finland", 3
      )

      questionsList.add(que5)

      // 6
      val que6 = Question(
          6, "What country does this flag belong to?",
          R.drawable.ic_flag_of_germany,
          "Germany", "Georgia",
          "Greece", "none of these", 1
      )

      questionsList.add(que6)

      // 7
      val que7 = Question(
          7, "What country does this flag belong to?",
          R.drawable.ic_flag_of_denmark,
          "Dominica", "Egypt",
          "Denmark", "Ethiopia", 3
      )

      questionsList.add(que7)

      // 8
      val que8 = Question(
          8, "What country does this flag belong to?",
          R.drawable.ic_flag_of_india,
          "Ireland", "Iran",
          "Hungary", "India", 4
      )

      questionsList.add(que8)

      // 9
      val que9 = Question(
          9, "What country does this flag belong to?",
          R.drawable.ic_flag_of_new_zealand,
          "Australia", "New Zealand",
          "Tuvalu", "United States of America", 2
      )

      questionsList.add(que9)

      // 10
      val que10 = Question(
          10, "What country does this flag belong to?",
          R.drawable.ic_flag_of_australia,
          "Australia", "New Zealand",
          "Tuvalu", "United States of America", 1
      )

      questionsList.add(que10)
      return questionsList
  }
}