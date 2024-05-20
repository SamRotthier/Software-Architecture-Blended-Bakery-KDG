package be.kdg.sa.bakery.senders;

import be.kdg.sa.bakery.controller.dto.ProductDto;
import be.kdg.sa.bakery.controller.dto.ProductIngredientDto;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;

public class NewProductMessage {
    private UUID productId;
    private String name;
    private List<ProductIngredientDto> ingredients;

    @Autowired
    public NewProductMessage(UUID productId, String name, List<ProductIngredientDto> ingredients) {
        this.productId = productId;
        this.name = name;
        this.ingredients = ingredients;
    }
}
