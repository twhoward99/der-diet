package thomas.howard.com.derdiet

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Button
import thomas.howard.com.derdiet.models.NutritionModel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var nutritionModel = NutritionModel()
        (findViewById(R.id.test_button) as? Button)?.setOnClickListener {
            nutritionModel.search("", fun() {
                Log.d("***********", " working")
            })
        }
    }
}
