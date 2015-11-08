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
public enum DayBookingInst implements org.f1x.message.types.ByteEnum {
    CAN_TRIGGER_BOOKING_WITHOUT_REFERENCE_TO_THE_ORDER_INITIATOR((byte) '0'),
    SPEAK_WITH_ORDER_INITIATOR_BEFORE_BOOKING((byte) '1'),
    ACCUMULATE((byte) '2');

    private final byte code;

    DayBookingInst(byte code) {
        this.code = code;
    }

    public byte getCode() {
        return code;
    }

    public static DayBookingInst parse(String s) {
        switch (s) {
            case "0":
                return CAN_TRIGGER_BOOKING_WITHOUT_REFERENCE_TO_THE_ORDER_INITIATOR;
            case "1":
                return SPEAK_WITH_ORDER_INITIATOR_BEFORE_BOOKING;
            case "2":
                return ACCUMULATE;
        }
        return null;
    }

}