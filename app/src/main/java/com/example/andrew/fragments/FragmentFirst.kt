package com.example.andrew.fragments

import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.andrew.R
import android.content.SharedPreferences
import android.view.View


class FragmentFirst: Fragment(R.layout.fragment_first) {
    private lateinit var buttonAdd: Button
    private lateinit var textView: TextView
    private lateinit var editNoteText: EditText
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (textView) = view.findViewById(R.id.TextView)
        (buttonAdd) = view.findViewById(R.id.ButtonAdd)
        (editNoteText) = view.findViewById(R.id.EditNoteText)
        var preferences = this.requireActivity().getSharedPreferences("He-man", Context.MODE_PRIVATE)
        val text = preferences.getString("Ragaca", "He-man")
        textView.text = text
        buttonAdd.setOnClickListener {
            var note = editNoteText.text.toString()
            var text = textView.text.toString()
            var result = note + '\n'+ text
            textView.text = result
            preferences.edit().putString("Ragaca", result).apply()
            editNoteText.setText("")
        }



    }
}