package vcmsa.ci.basketballteam

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val q1 = findViewById<TextView>(R.id.q1)
        val q2 = findViewById<TextView>(R.id.q2)
        val q3 = findViewById<TextView>(R.id.q3)
        val q4 = findViewById<TextView>(R.id.q4)
        val q5 = findViewById<TextView>(R.id.q5)
        val edtNum1 = findViewById<EditText>(R.id.edtNum1)
        val edtNum2 = findViewById<EditText>(R.id.edtNum2)
        val edtNum3 = findViewById<EditText>(R.id.edtNum3)
        val edtNum4 = findViewById<EditText>(R.id.edtNum4)
        val edtNum5 = findViewById<EditText>(R.id.edtNum5)
        val btnNext = findViewById<Button>(R.id.btnNext)
        val btnClear = findViewById<Button>(R.id.btnClear)

        btnNext.setOnClickListener{

            val scores = listOf(
                edtNum1.text.toString().toIntOrNull() ?: 0,
                edtNum2.text.toString().toIntOrNull() ?: 0,
                edtNum3.text.toString().toIntOrNull() ?: 0,
                edtNum4.text.toString().toIntOrNull() ?: 0,
                edtNum5.text.toString().toIntOrNull() ?: 0
            )

            val intent = Intent(this, results::class.java)
            intent.putExtra("Art", scores[0])
            intent.putExtra("Bob", scores[1])
            intent.putExtra("Cal", scores[2])
            intent.putExtra("Dan", scores[3])
            intent.putExtra("Eli", scores[4])
            startActivity(intent)
        }

        btnClear.setOnClickListener {
            edtNum1.text.clear()
            edtNum2.text.clear()
            edtNum3.text.clear()
            edtNum4.text.clear()
            edtNum5.text.clear()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}

