package thomas.howard.com.derdiet

import org.junit.Test
import thomas.howard.com.derdiet.objects.Food
import thomas.howard.com.derdiet.presenters.NutritionPresenter
import thomas.howard.com.derdiet.protocols.INutritionPresenter

class DerDietTests {
    @Test
    fun serviceReturnsObject() {
        val nutritionPresenter: INutritionPresenter = NutritionPresenter()
        assert(nutritionPresenter.foods("test") is Array<Food>)
    }
}