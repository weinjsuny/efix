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
public enum SettlType implements org.f1x.message.types.ByteEnum {
    REGULAR((byte) '0'),
    CASH((byte) '1'),
    NEXT_DAY((byte) '2'),
    T_PLUS_2((byte) '3'),
    T_PLUS_3((byte) '4'),
    T_PLUS_4((byte) '5'),
    FUTURE((byte) '6'),
    WHEN_AND_IF_ISSUED((byte) '7'),
    SELLERS_OPTION((byte) '8'),
    T_PLUS_5((byte) '9');

    private final byte code;

    SettlType(byte code) {
        this.code = code;
    }

    public byte getCode() {
        return code;
    }

    public static SettlType parse(String s) {
        switch (s) {
            case "0":
                return REGULAR;
            case "1":
                return CASH;
            case "2":
                return NEXT_DAY;
            case "3":
                return T_PLUS_2;
            case "4":
                return T_PLUS_3;
            case "5":
                return T_PLUS_4;
            case "6":
                return FUTURE;
            case "7":
                return WHEN_AND_IF_ISSUED;
            case "8":
                return SELLERS_OPTION;
            case "9":
                return T_PLUS_5;
        }
        return null;
    }

}