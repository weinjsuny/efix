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
public enum MassCancelRequestType implements org.f1x.message.types.ByteEnum {
    CANCEL_ORDERS_FOR_A_SECURITY((byte) '1'),
    CANCEL_ORDERS_FOR_AN_UNDERLYING_SECURITY((byte) '2'),
    CANCEL_ORDERS_FOR_A_PRODUCT((byte) '3'),
    CANCEL_ORDERS_FOR_A_CFICODE((byte) '4'),
    CANCEL_ORDERS_FOR_A_SECURITYTYPE((byte) '5'),
    CANCEL_ORDERS_FOR_A_TRADING_SESSION((byte) '6'),
    CANCEL_ALL_ORDERS((byte) '7');

    private final byte code;

    MassCancelRequestType(byte code) {
        this.code = code;
    }

    public byte getCode() {
        return code;
    }

    public static MassCancelRequestType parse(String s) {
        switch (s) {
            case "1":
                return CANCEL_ORDERS_FOR_A_SECURITY;
            case "2":
                return CANCEL_ORDERS_FOR_AN_UNDERLYING_SECURITY;
            case "3":
                return CANCEL_ORDERS_FOR_A_PRODUCT;
            case "4":
                return CANCEL_ORDERS_FOR_A_CFICODE;
            case "5":
                return CANCEL_ORDERS_FOR_A_SECURITYTYPE;
            case "6":
                return CANCEL_ORDERS_FOR_A_TRADING_SESSION;
            case "7":
                return CANCEL_ALL_ORDERS;
        }
        return null;
    }

}