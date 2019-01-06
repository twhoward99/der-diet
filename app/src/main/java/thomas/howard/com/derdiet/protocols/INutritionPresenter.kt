package thomas.howard.com.derdiet.protocols

import thomas.howard.com.derdiet.objects.Food

interface INutritionPresenter {
    fun foods(lookup: String): Array<Food>
}
