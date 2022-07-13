package com.example.lesson20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.lesson20.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding
//    val lostArray = arrayOf(10000, 2300, 45000, 65000, 6500, 400)
//    val earnArray = arrayOf(15000, 300, 345000, 5000, 16500, 3400)
//    val resultArray = ArrayList<String>()
    val bad = 0..3
    val normal = 4..6
    val nice = 7..9
    val excellent = 10
    val gradeArray = arrayOf(4, 7, 3, 6, 10, 2)
    val nameArray = arrayOf("Антон", "Егор", "Маша", "Светлана", "Юля", "Семен")
    val badArray = ArrayList<String>()
    val normalArray = ArrayList<String>()
    val niceArray = ArrayList<String>()
    val excellentArray = ArrayList<String>()
    var result = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
        val names = resources.getStringArray(R.array.names)



        for((index, grade) in gradeArray.withIndex()){
            when(grade){
                in bad -> {
                    badArray.add("Плохие оценки: Ученик: ${nameArray[index]} - $grade")
                }
                in normal -> {
                    normalArray.add("Нормальные оценки: Ученик: ${nameArray[index]} - $grade")
                }
                in nice -> {
                    niceArray.add("Хорошие оценки: Ученик: ${nameArray[index]} - $grade")
                }
                excellent -> {
                    excellentArray.add("Отличные оценки: Ученик: ${nameArray[index]} - $grade")
                }
            }
        }

        badArray.forEach{
            result += "$it\n"
        }
        normalArray.forEach{
            result += "$it\n"
        }
        niceArray.forEach{
            result += "$it\n"
        }
        excellentArray.forEach{
            result += "$it\n"
        }

        bindingClass.tvmResult.setText(result)
    }
}