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
public enum MDUpdateType implements org.f1x.message.types.ByteEnum {
    FULL_REFRESH((byte) '0'),
    INCREMENTAL_REFRESH((byte) '1');

    private final byte code;

    MDUpdateType(byte code) {
        this.code = code;
    }

    public byte getCode() {
        return code;
    }

    public static MDUpdateType parse(String s) {
        switch (s) {
            case "0":
                return FULL_REFRESH;
            case "1":
                return INCREMENTAL_REFRESH;
        }
        return null;
    }

}