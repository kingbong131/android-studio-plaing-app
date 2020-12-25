package com.example.mainpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.room.Room

class SubSubActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub_sub2)

        val result_text: TextView = findViewById(R.id.result_text)
        val add_button: Button = findViewById(R.id.add_button)
        val todo_edit: EditText = findViewById(R.id.todo_edit)
        val db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "database-name"
        )
            .allowMainThreadQueries()
            .build()

        result_text.text = db.todoDao().getAll().toString()

        add_button.setOnClickListener{
            db.todoDao().insert(Todo(todo_edit.text.toString()))
            result_text.text = db.todoDao().getAll().toString()
        }

    }
}