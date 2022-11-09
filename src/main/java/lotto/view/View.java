package lotto.view;

import lotto.constant.Constant;

public class View {
    // TODO: 숫자가 들어간 메시지는 printf로 리팩토링하는 것 고려
    private static final String GET_PURCHASE_AMOUNT_MESSAGE = "구입 금액을 입력해 주세요.";
    private static final String PURCHASE_INFORMATION_MESSAGE = "%d개를 구매했습니다.";
    private static final String GET_LOTTO_NUMBER_MESSAGE = "당첨 번호를 입력해 주세요.";
    private static final String GET_BONUS_NUMBER_MESSAGE = "보너스 번호를 입력해 주세요.";
    private static final String RESULT_TITLE = "당첨 통계" + "\n" + "---";
    private static final String GET_RESULT_MESSAGE = "%d개 일치 (%d원) - %d개";
    private static final String GET_PROFIT_RATES_MESSAGE = "총 수익률은 입니다.";

    private static final String ERROR_MESSAGE = "[ERROR]";
    private static final String NOT_INTEGER_MESSAGE = ERROR_MESSAGE + " 정수만 입력 가능합니다. 게임이 종료됩니다.";
    private static final String NOT_LOTTO_PRICE_MESSAGE = ERROR_MESSAGE + "%d단위로만 입력 가능합니다. 게임이 종료됩니다.%n";
    private static final String NOT_LOTTO_SIZE_MESSAGE = ERROR_MESSAGE + "%d개의 숫자만 입력 가능합니다. 게임이 종료됩니다.%n";
    private static final String NOT_LOTTO_NUMBER_MESSAGE = ERROR_MESSAGE + "%d ~ %d 사이의 숫자만 입력 가능합니다. 게임이 종료됩니다.%n";
    private static final String NOT_UNIQUE_NUMBER_MESSAGE = ERROR_MESSAGE + "중복된 숫자는 입력할 수 없습니다. 게임이 종료됩니다.";

    public static void printInputPurchaseAmount() {
        System.out.println(GET_PURCHASE_AMOUNT_MESSAGE);
    }

    public static void printPurchaseInformation() {
        System.out.println(PURCHASE_INFORMATION_MESSAGE);
    }

    public static void printInputLottoNumber() {
        System.out.println(GET_LOTTO_NUMBER_MESSAGE);
    }

    public static void printInputBonusNumber() {
        System.out.println(GET_BONUS_NUMBER_MESSAGE);
    }

    public static void printResult() {
        System.out.println(GET_RESULT_MESSAGE);
    }

    public static void printProfitRate() {
        System.out.println(GET_PROFIT_RATES_MESSAGE);
    }

    public static void printNotInteger() {
        System.out.println(NOT_INTEGER_MESSAGE);
    }

    public static void printNotLottoPrice() {
        System.out.printf(NOT_LOTTO_PRICE_MESSAGE, Constant.LOTTO_PRICE);
    }

    public static void printNotLottoSize() {
        System.out.printf(NOT_LOTTO_SIZE_MESSAGE, Constant.LOTTO_SIZE);
    }

    public static void printNotLottoNumber() {
        System.out.printf(NOT_LOTTO_NUMBER_MESSAGE, Constant.LOTTO_START_NUMBER, Constant.LOTTO_END_NUMBER);
    }

    public static void printNotUniqueNumber() {
        System.out.println(NOT_UNIQUE_NUMBER_MESSAGE);
    }

}