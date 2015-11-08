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
public enum TickDirection implements org.f1x.message.types.ByteEnum {
    PLUS_TICK((byte) '0'),
    ZERO_PLUS_TICK((byte) '1'),
    MINUS_TICK((byte) '2'),
    ZERO_MINUS_TICK((byte) '3');

    private final byte code;

    TickDirection(byte code) {
        this.code = code;
    }

    public byte getCode() {
        return code;
    }

    public static TickDirection parse(String s) {
        switch (s) {
            case "0":
                return PLUS_TICK;
            case "1":
                return ZERO_PLUS_TICK;
            case "2":
                return MINUS_TICK;
            case "3":
                return ZERO_MINUS_TICK;
        }
        return null;
    }

}