/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.f1x.message.fields;

// Generated by org.f1x.tools.DictionaryGenerator from QuickFIX dictionary
public enum TrdType implements org.f1x.message.types.IntEnum {
    REGULAR_TRADE(0),
    BLOCK_TRADE(1),
    EFP(2),
    TRANSFER(3),
    LATE_TRADE(4),
    T_TRADE(5),
    WEIGHTED_AVERAGE_PRICE_TRADE(6),
    BUNCHED_TRADE(7),
    LATE_BUNCHED_TRADE(8),
    PRIOR_REFERENCE_PRICE_TRADE(9),
    AFTER_HOURS_TRADE(10);

    private final int code;

    TrdType(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static TrdType parse(String s) {
        switch (s) {
            case "0":
                return REGULAR_TRADE;
            case "1":
                return BLOCK_TRADE;
            case "2":
                return EFP;
            case "3":
                return TRANSFER;
            case "4":
                return LATE_TRADE;
            case "5":
                return T_TRADE;
            case "6":
                return WEIGHTED_AVERAGE_PRICE_TRADE;
            case "7":
                return BUNCHED_TRADE;
            case "8":
                return LATE_BUNCHED_TRADE;
            case "9":
                return PRIOR_REFERENCE_PRICE_TRADE;
            case "10":
                return AFTER_HOURS_TRADE;
        }
        return null;
    }

}