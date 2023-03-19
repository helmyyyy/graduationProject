package com.example.myquizapp

import android.graphics.Color
import android.graphics.Color.parseColor
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView

class QuizActivity : AppCompatActivity(),View.OnClickListener {
    private var mCurrentPositoin: Int = 1
    private var mQuestionList:ArrayList<Question>? = null
    private var mSelectionOptionPosition: Int = 0


    private var progressBar: ProgressBar? = null
    private var tvProgress: TextView? = null
    private var tvQuestion: TextView? = null
    private var ivImage : ImageView? = null

    private var tvOptionOne : TextView? = null
    private var tvOptionTwo : TextView? = null
    private var tvOptionThree : TextView? = null
    private var tvOptionFour : TextView? = null
    private var btnSubmit: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)
        progressBar = findViewById(R.id.progressBar)
        tvProgress =findViewById(R.id.tv_progress)
        tvQuestion = findViewById(R.id.tv_question)
        ivImage = findViewById(R.id.iv_image)
        tvOptionOne = findViewById(R.id.tv_option_one)
        tvOptionTwo = findViewById(R.id.tv_option_two)
        tvOptionThree = findViewById(R.id.tv_option_three)
        tvOptionFour = findViewById(R.id.tv_option_four)

        mQuestionList = constants.getQuestions()

        setQuestion()
        defaultOptionsView()

    }

    private fun setQuestion() {


        val question: Question = mQuestionList!![mCurrentPositoin - 1]
        ivImage?.setImageResource(question.image)
        progressBar?.progress = mCurrentPositoin
        tvProgress?.text = "$mCurrentPositoin/${progressBar?.max}"
        tvQuestion?.text = question.question
        tvOptionOne?.text = question.optionOne
        tvOptionTwo?.text = question.optionTwo
        tvOptionThree?.text = question.optionThree
        tvOptionFour?.text = question.optionFour

        if (mCurrentPositoin == mQuestionList!!.size){
            btnSubmit?.text = "FINISH"
        }else{
            btnSubmit?.text = "SUBMIT"
        }
    }

    private fun defaultOptionsView(){
        val options = ArrayList<TextView>()
        tvOptionOne?.let {
            options.add(0,it)
        }
        tvOptionTwo?.let {
            options.add(1,it)
        }
        tvOptionThree?.let {
            options.add(2,it)
        }
        tvOptionFour?.let {
            options.add(3,it)
        }
        for (option in options){
            //option.setTextColor(Color.parseColor("#7A8089"))
            option.setTextColor(Color.parseColor("#FF0000"))
        }
    }

    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
    }
}