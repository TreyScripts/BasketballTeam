package vcmsa.ci.basketballteam

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class results : AppCompatActivity() {
    @SuppressLint("SetTextI18n", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results)

        val art = intent.getIntExtra("Art", 0)
        val bob = intent.getIntExtra("Bob", 0)
        val cal = intent.getIntExtra("Cal", 0)
        val dan = intent.getIntExtra("Dan", 0)
        val eli = intent.getIntExtra("Eli", 0)

        val art2 = findViewById<TextView>(R.id.art)
        val bob2 = findViewById<TextView>(R.id.bob)
        val cal2 = findViewById<TextView>(R.id.cal)
        val dan2 = findViewById<TextView>(R.id.dan)
        val eli2 = findViewById<TextView>(R.id.eli)
        val btnBack = findViewById<Button>(R.id.btnBack)

        art2.text = "Art: " + "*".repeat(art)
        bob2.text = "Bob: " + "*".repeat(bob)
        cal2.text = "Cal: " + "*".repeat(cal)
        dan2.text = "Dan: " + "*".repeat(dan)
        eli2.text = "Eli: " + "*".repeat(eli)

        btnBack.setOnClickListener{
           val intent = Intent(this, MainActivity :: class.java)
            startActivity(intent)
        }
    }
}