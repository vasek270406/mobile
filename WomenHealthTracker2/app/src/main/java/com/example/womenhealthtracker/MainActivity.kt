package com.example.womenhealthtracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Находим кнопку по ID
        val getStartedButton = findViewById<Button>(R.id.getStartedButton)

        // Устанавливаем обработчик нажатия на кнопку
        getStartedButton.setOnClickListener {
            // Показываем сообщение о нажатии
            Toast.makeText(
                this,
                "Переход на следующую страницу",
                Toast.LENGTH_SHORT
            ).show()

            // Здесь будет переход на следующую активность
            // Когда создадите следующую страницу, раскомментируйте:
            /*
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
            */
        }
    }
}