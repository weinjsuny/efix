package org.efix.message.field;


public class CrossType {

    public static final int CROSS_TRADE_WHICH_IS_EXECUTED_COMPLETELY_OR_NOT = 1;
    public static final int CROSS_TRADE_WHICH_IS_EXECUTED_PARTIALLY_AND_THE_REST_IS_CANCELLED = 2;
    public static final int CROSS_TRADE_WHICH_IS_PARTIALLY_EXECUTED_WITH_THE_UNFILLED_PORTIONS_REMAINING_ACTIVE = 3;
    public static final int CROSS_TRADE_IS_EXECUTED_WITH_EXISTING_ORDERS_WITH_THE_SAME_PRICE = 4;

}