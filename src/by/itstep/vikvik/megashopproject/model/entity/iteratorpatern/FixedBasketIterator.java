package by.itstep.vikvik.megashopproject.model.entity.iteratorpatern;

import by.itstep.vikvik.megashopproject.model.entity.abstracts.Product;
import by.itstep.vikvik.megashopproject.model.entity.container.FixedBasket;

public class FixedBasketIterator implements MyIterator {
    private FixedBasket basket;
    private int current;

    public FixedBasketIterator(FixedBasket basket) {
        this.basket = basket;
        current = 0;
    }

    @Override
    public Product next() {
        return basket.get(current++);
    }

    @Override
    public boolean hasNext() {
        return current < basket.size();
    }

    @Override
    public void reset() {
        current = 0;
    }
}