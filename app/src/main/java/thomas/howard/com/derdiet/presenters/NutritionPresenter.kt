package thomas.howard.com.derdiet.presenters

import thomas.howard.com.derdiet.objects.Food
import thomas.howard.com.derdiet.protocols.INutritionPresenter

class NutritionPresenter : INutritionPresenter {
    override fun foods(lookup: String): Array<Food> {
        return (arrayOf(Food()))
    }
}