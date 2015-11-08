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
public enum TradeRequestType implements org.f1x.message.types.ByteEnum {
    ALL_TRADES((byte) '0'),
    MATCHED_TRADES_MATCHING_CRITERIA_PROVIDED_ON_REQUEST((byte) '1'),
    UNMATCHED_TRADES_THAT_MATCH_CRITERIA((byte) '2'),
    UNREPORTED_TRADES_THAT_MATCH_CRITERIA((byte) '3'),
    ADVISORIES_THAT_MATCH_CRITERIA((byte) '4');

    private final byte code;

    TradeRequestType(byte code) {
        this.code = code;
    }

    public byte getCode() {
        return code;
    }

    public static TradeRequestType parse(String s) {
        switch (s) {
            case "0":
                return ALL_TRADES;
            case "1":
                return MATCHED_TRADES_MATCHING_CRITERIA_PROVIDED_ON_REQUEST;
            case "2":
                return UNMATCHED_TRADES_THAT_MATCH_CRITERIA;
            case "3":
                return UNREPORTED_TRADES_THAT_MATCH_CRITERIA;
            case "4":
                return ADVISORIES_THAT_MATCH_CRITERIA;
        }
        return null;
    }

}