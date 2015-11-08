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
public enum BasisPxType implements org.f1x.message.types.ByteEnum {
    CLOSING_PRICE_AT_MORNING_SESSION((byte) '2'),
    CLOSING_PRICE((byte) '3'),
    CURRENT_PRICE((byte) '4'),
    SQ((byte) '5'),
    VWAP_THROUGH_A_DAY((byte) '6'),
    VWAP_THROUGH_A_MORNING_SESSION((byte) '7'),
    VWAP_THROUGH_AN_AFTERNOON_SESSION((byte) '8'),
    VWAP_THROUGH_A_DAY_EXCEPT_YORI((byte) '9'),
    VWAP_THROUGH_A_MORNING_SESSION_EXCEPT_YORI((byte) 'A'),
    VWAP_THROUGH_AN_AFTERNOON_SESSION_EXCEPT_YORI((byte) 'B'),
    STRIKE((byte) 'C'),
    OPEN((byte) 'D'),
    OTHERS((byte) 'Z');

    private final byte code;

    BasisPxType(byte code) {
        this.code = code;
    }

    public byte getCode() {
        return code;
    }

    public static BasisPxType parse(String s) {
        switch (s) {
            case "2":
                return CLOSING_PRICE_AT_MORNING_SESSION;
            case "3":
                return CLOSING_PRICE;
            case "4":
                return CURRENT_PRICE;
            case "5":
                return SQ;
            case "6":
                return VWAP_THROUGH_A_DAY;
            case "7":
                return VWAP_THROUGH_A_MORNING_SESSION;
            case "8":
                return VWAP_THROUGH_AN_AFTERNOON_SESSION;
            case "9":
                return VWAP_THROUGH_A_DAY_EXCEPT_YORI;
            case "A":
                return VWAP_THROUGH_A_MORNING_SESSION_EXCEPT_YORI;
            case "B":
                return VWAP_THROUGH_AN_AFTERNOON_SESSION_EXCEPT_YORI;
            case "C":
                return STRIKE;
            case "D":
                return OPEN;
            case "Z":
                return OTHERS;
        }
        return null;
    }

}