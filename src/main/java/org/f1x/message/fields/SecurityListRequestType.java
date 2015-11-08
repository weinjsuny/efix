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
public enum SecurityListRequestType implements org.f1x.message.types.ByteEnum {
    SYMBOL((byte) '0'),
    SECURITYTYPE_AND_OR_CFICODE((byte) '1'),
    PRODUCT((byte) '2'),
    TRADINGSESSIONID((byte) '3'),
    ALL_SECURITIES((byte) '4');

    private final byte code;

    SecurityListRequestType(byte code) {
        this.code = code;
    }

    public byte getCode() {
        return code;
    }

    public static SecurityListRequestType parse(String s) {
        switch (s) {
            case "0":
                return SYMBOL;
            case "1":
                return SECURITYTYPE_AND_OR_CFICODE;
            case "2":
                return PRODUCT;
            case "3":
                return TRADINGSESSIONID;
            case "4":
                return ALL_SECURITIES;
        }
        return null;
    }

}