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
public enum AllocNoOrdersType implements org.f1x.message.types.ByteEnum {
    NOT_SPECIFIED((byte) '0'),
    EXPLICIT_LIST_PROVIDED((byte) '1');

    private final byte code;

    AllocNoOrdersType(byte code) {
        this.code = code;
    }

    public byte getCode() {
        return code;
    }

    public static AllocNoOrdersType parse(String s) {
        switch (s) {
            case "0":
                return NOT_SPECIFIED;
            case "1":
                return EXPLICIT_LIST_PROVIDED;
        }
        return null;
    }

}