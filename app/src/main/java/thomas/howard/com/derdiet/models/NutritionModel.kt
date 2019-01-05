package thomas.howard.com.derdiet.models

import thomas.howard.com.derdiet.services.NutritionService

class NutritionModel {

    fun search(foodString: String, callback: () -> Unit) {
        NutritionService().search(foodString, callback)
    }

}