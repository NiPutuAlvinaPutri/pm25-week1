package com.example.helloapps
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Menghubungkan elemen tampilan dengan variabel
        val inputField = findViewById<EditText>(R.id.editText)
        val actionButton = findViewById<Button>(R.id.button)
        val displayText = findViewById<TextView>(R.id.textView)

        // Menetapkan aksi saat tombol ditekan
        actionButton.setOnClickListener {
            val inputText = inputField.text.toString().trim()

            // Menampilkan teks sesuai dengan input pengguna
            displayText.text = if (inputText.isNotEmpty()) {
                "Hallo, $inputText"
            } else {
                "Hallo,Tanpa Nama! Silahkan Masukkan Nama Anda!"
            }
            displayText.visibility = TextView.VISIBLE // Menampilkan teks setelah tombol ditekan
        }
    }
}
