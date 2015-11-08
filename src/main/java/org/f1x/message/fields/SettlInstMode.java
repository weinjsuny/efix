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
public enum SettlInstMode implements org.f1x.message.types.ByteEnum {
    DEFAULT((byte) '0'),
    STANDING_INSTRUCTIONS_PROVIDED((byte) '1'),
    SPECIFIC_ORDER_FOR_A_SINGLE_ACCOUNT((byte) '4'),
    REQUEST_REJECT((byte) '5');

    private final byte code;

    SettlInstMode(byte code) {
        this.code = code;
    }

    public byte getCode() {
        return code;
    }

    public static SettlInstMode parse(String s) {
        switch (s) {
            case "0":
                return DEFAULT;
            case "1":
                return STANDING_INSTRUCTIONS_PROVIDED;
            case "4":
                return SPECIFIC_ORDER_FOR_A_SINGLE_ACCOUNT;
            case "5":
                return REQUEST_REJECT;
        }
        return null;
    }

}