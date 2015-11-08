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
public enum DistribPaymentMethod implements org.f1x.message.types.IntEnum {
    CREST(1),
    NSCC(2),
    EUROCLEAR(3),
    CLEARSTREAM(4),
    CHEQUE(5),
    TELEGRAPHIC_TRANSFER(6),
    FEDWIRE(7),
    DIRECT_CREDIT(8),
    ACH_CREDIT(9),
    BPAY(10),
    HIGH_VALUE_CLEARING_SYSTEM(11),
    REINVEST_IN_FUND(12);

    private final int code;

    DistribPaymentMethod(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static DistribPaymentMethod parse(String s) {
        switch (s) {
            case "1":
                return CREST;
            case "2":
                return NSCC;
            case "3":
                return EUROCLEAR;
            case "4":
                return CLEARSTREAM;
            case "5":
                return CHEQUE;
            case "6":
                return TELEGRAPHIC_TRANSFER;
            case "7":
                return FEDWIRE;
            case "8":
                return DIRECT_CREDIT;
            case "9":
                return ACH_CREDIT;
            case "10":
                return BPAY;
            case "11":
                return HIGH_VALUE_CLEARING_SYSTEM;
            case "12":
                return REINVEST_IN_FUND;
        }
        return null;
    }

}