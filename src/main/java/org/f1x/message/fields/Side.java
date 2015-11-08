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
public enum Side implements org.f1x.message.types.ByteEnum {
    BUY((byte) '1'),
    SELL((byte) '2'),
    BUY_MINUS((byte) '3'),
    SELL_PLUS((byte) '4'),
    SELL_SHORT((byte) '5'),
    SELL_SHORT_EXEMPT((byte) '6'),
    UNDISCLOSED((byte) '7'),
    CROSS((byte) '8'),
    CROSS_SHORT((byte) '9'),
    CROSS_SHORT_EXEMPT((byte) 'A'),
    AS_DEFINED((byte) 'B'),
    OPPOSITE((byte) 'C'),
    SUBSCRIBE((byte) 'D'),
    REDEEM((byte) 'E'),
    LEND((byte) 'F'),
    BORROW((byte) 'G');

    private final byte code;

    Side(byte code) {
        this.code = code;
    }

    public byte getCode() {
        return code;
    }

    public static Side parse(String s) {
        switch (s) {
            case "1":
                return BUY;
            case "2":
                return SELL;
            case "3":
                return BUY_MINUS;
            case "4":
                return SELL_PLUS;
            case "5":
                return SELL_SHORT;
            case "6":
                return SELL_SHORT_EXEMPT;
            case "7":
                return UNDISCLOSED;
            case "8":
                return CROSS;
            case "9":
                return CROSS_SHORT;
            case "A":
                return CROSS_SHORT_EXEMPT;
            case "B":
                return AS_DEFINED;
            case "C":
                return OPPOSITE;
            case "D":
                return SUBSCRIBE;
            case "E":
                return REDEEM;
            case "F":
                return LEND;
            case "G":
                return BORROW;
        }
        return null;
    }

}