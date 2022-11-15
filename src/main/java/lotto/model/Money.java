package lotto.model;

import lotto.view.View;

/*
 * 로또 구입 금액을 의미하는 객체
 */

public class Money {

    private static final int ZERO = 0;
    private static final int LOTTO_PRICE = 1000;

    private final int money;

    public Money(int money) {
        validatePurchase(money);
        validatePrice(money);
        this.money = money;
    }

    public static int getLottoPrice() {
        return LOTTO_PRICE;
    }

    public int getMoney() {
        return this.money;
    }

    private void validatePurchase(int money) {
        if (money == ZERO) {
            View.printNotPurchase();
            throw new IllegalArgumentException();
        }
    }

    private void validatePrice(int money) {
        if (money % LOTTO_PRICE != 0) {
            View.printNotLottoPrice(LOTTO_PRICE);
            throw new IllegalArgumentException();
        }
    }

}
