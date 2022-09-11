import org.junit.Test;
import praktikum.IngredientType;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class IngredientTypeTest {
    @Test
    public void sauceInIngerientTypeList() {
        IngredientType ingredientType = IngredientType.valueOf("SAUCE");
        assertThat(ingredientType, equalTo(IngredientType.SAUCE));
    }
    @Test
    public void fillingInIngerientTypeList() {
        IngredientType ingredientType = IngredientType.valueOf("FILLING");
        assertThat(ingredientType, equalTo(IngredientType.FILLING));
    }
}
