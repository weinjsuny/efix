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
public enum SecurityType implements org.f1x.message.types.StringEnum {
    WILDCARD("?"),
    ASSET_BACKED_SECURITIES("ABS"),
    AMENDED_AND_RESTATED("AMENDED"),
    OTHER_ANTICIPATION_NOTES("AN"),
    BANKERS_ACCEPTANCE("BA"),
    BANK_NOTES("BN"),
    BILL_OF_EXCHANGES("BOX"),
    BRADY_BOND("BRADY"),
    BRIDGE_LOAN("BRIDGE"),
    BUY_SELLBACK("BUYSELL"),
    CONVERTIBLE_BOND("CB"),
    CERTIFICATE_OF_DEPOSIT("CD"),
    CALL_LOANS("CL"),
    CORP_MORTGAGE_BACKED_SECURITIES("CMBS"),
    COLLATERALIZED_MORTGAGE_OBLIGATION("CMO"),
    CERTIFICATE_OF_OBLIGATION("COFO"),
    CERTIFICATE_OF_PARTICIPATION("COFP"),
    CORPORATE_BOND("CORP"),
    COMMERCIAL_PAPER("CP"),
    CORPORATE_PRIVATE_PLACEMENT("CPP"),
    COMMON_STOCK("CS"),
    DEFAULTED("DEFLTED"),
    DEBTOR_IN_POSSESSION("DINP"),
    DEPOSIT_NOTES("DN"),
    DUAL_CURRENCY("DUAL"),
    EURO_CERTIFICATE_OF_DEPOSIT("EUCD"),
    EURO_CORPORATE_BOND("EUCORP"),
    EURO_COMMERCIAL_PAPER("EUCP"),
    EURO_SOVEREIGNS("EUSOV"),
    EURO_SUPRANATIONAL_COUPONS("EUSUPRA"),
    FEDERAL_AGENCY_COUPON("FAC"),
    FEDERAL_AGENCY_DISCOUNT_NOTE("FADN"),
    FOREIGN_EXCHANGE_CONTRACT("FOR"),
    FORWARD("FORWARD"),
    FUTURE("FUT"),
    GENERAL_OBLIGATION_BONDS("GO"),
    IOETTE_MORTGAGE("IET"),
    LETTER_OF_CREDIT("LOFC"),
    LIQUIDITY_NOTE("LQN"),
    MATURED("MATURED"),
    MORTGAGE_BACKED_SECURITIES("MBS"),
    MUTUAL_FUND("MF"),
    MORTGAGE_INTEREST_ONLY("MIO"),
    MULTI_LEG_INSTRUMENT("MLEG"),
    MORTGAGE_PRINCIPAL_ONLY("MPO"),
    MORTGAGE_PRIVATE_PLACEMENT("MPP"),
    MISCELLANEOUS_PASS_THROUGH("MPT"),
    MANDATORY_TENDER("MT"),
    MEDIUM_TERM_NOTES("MTN"),
    NO_SECURITY_TYPE("NONE"),
    OVERNIGHT("ONITE"),
    OPTION("OPT"),
    PRIVATE_EXPORT_FUNDING("PEF"),
    PFANDBRIEFE("PFAND"),
    PROMISSORY_NOTE("PN"),
    PREFERRED_STOCK("PS"),
    PLAZOS_FIJOS("PZFJ"),
    REVENUE_ANTICIPATION_NOTE("RAN"),
    REPLACED("REPLACD"),
    REPURCHASE("REPO"),
    RETIRED("RETIRED"),
    REVENUE_BONDS("REV"),
    REVOLVER_LOAN("RVLV"),
    REVOLVER_TERM_LOAN("RVLVTRM"),
    SECURITIES_LOAN("SECLOAN"),
    SECURITIES_PLEDGE("SECPLEDGE"),
    SPECIAL_ASSESSMENT("SPCLA"),
    SPECIAL_OBLIGATION("SPCLO"),
    SPECIAL_TAX("SPCLT"),
    SHORT_TERM_LOAN_NOTE("STN"),
    STRUCTURED_NOTES("STRUCT"),
    USD_SUPRANATIONAL_COUPONS("SUPRA"),
    SWING_LINE_FACILITY("SWING"),
    TAX_ANTICIPATION_NOTE("TAN"),
    TAX_ALLOCATION("TAXA"),
    TO_BE_ANNOUNCED("TBA"),
    US_TREASURY_BILL("TBILL"),
    US_TREASURY_BOND("TBOND"),
    PRINCIPAL_STRIP_OF_A_CALLABLE_BOND_OR_NOTE("TCAL"),
    TIME_DEPOSIT("TD"),
    TAX_EXEMPT_COMMERCIAL_PAPER("TECP"),
    TERM_LOAN("TERM"),
    INTEREST_STRIP_FROM_ANY_BOND_OR_NOTE("TINT"),
    TREASURY_INFLATION_PROTECTED_SECURITIES("TIPS"),
    US_TREASURY_NOTE("TNOTE"),
    PRINCIPAL_STRIP_FROM_A_NON_CALLABLE_BOND_OR_NOTE("TPRN"),
    TAX_AND_REVENUE_ANTICIPATION_NOTE("TRAN"),
    VARIABLE_RATE_DEMAND_NOTE("VRDN"),
    WARRANT("WAR"),
    WITHDRAWN("WITHDRN"),
    EXTENDED_COMM_NOTE("XCN"),
    INDEXED_LINKED("XLINKD"),
    YANKEE_CORPORATE_BOND("YANK"),
    YANKEE_CERTIFICATE_OF_DEPOSIT("YCD");

    private final String code;

    SecurityType(String code) {
        this.code = code;
        bytes = code.getBytes();
    }

    public String getCode() {
        return code;
    }

    private final byte[] bytes;

    public byte[] getBytes() {
        return bytes;
    }


    public static SecurityType parse(String s) {
        switch (s) {
            case "?":
                return WILDCARD;
            case "ABS":
                return ASSET_BACKED_SECURITIES;
            case "AMENDED":
                return AMENDED_AND_RESTATED;
            case "AN":
                return OTHER_ANTICIPATION_NOTES;
            case "BA":
                return BANKERS_ACCEPTANCE;
            case "BN":
                return BANK_NOTES;
            case "BOX":
                return BILL_OF_EXCHANGES;
            case "BRADY":
                return BRADY_BOND;
            case "BRIDGE":
                return BRIDGE_LOAN;
            case "BUYSELL":
                return BUY_SELLBACK;
            case "CB":
                return CONVERTIBLE_BOND;
            case "CD":
                return CERTIFICATE_OF_DEPOSIT;
            case "CL":
                return CALL_LOANS;
            case "CMBS":
                return CORP_MORTGAGE_BACKED_SECURITIES;
            case "CMO":
                return COLLATERALIZED_MORTGAGE_OBLIGATION;
            case "COFO":
                return CERTIFICATE_OF_OBLIGATION;
            case "COFP":
                return CERTIFICATE_OF_PARTICIPATION;
            case "CORP":
                return CORPORATE_BOND;
            case "CP":
                return COMMERCIAL_PAPER;
            case "CPP":
                return CORPORATE_PRIVATE_PLACEMENT;
            case "CS":
                return COMMON_STOCK;
            case "DEFLTED":
                return DEFAULTED;
            case "DINP":
                return DEBTOR_IN_POSSESSION;
            case "DN":
                return DEPOSIT_NOTES;
            case "DUAL":
                return DUAL_CURRENCY;
            case "EUCD":
                return EURO_CERTIFICATE_OF_DEPOSIT;
            case "EUCORP":
                return EURO_CORPORATE_BOND;
            case "EUCP":
                return EURO_COMMERCIAL_PAPER;
            case "EUSOV":
                return EURO_SOVEREIGNS;
            case "EUSUPRA":
                return EURO_SUPRANATIONAL_COUPONS;
            case "FAC":
                return FEDERAL_AGENCY_COUPON;
            case "FADN":
                return FEDERAL_AGENCY_DISCOUNT_NOTE;
            case "FOR":
                return FOREIGN_EXCHANGE_CONTRACT;
            case "FORWARD":
                return FORWARD;
            case "FUT":
                return FUTURE;
            case "GO":
                return GENERAL_OBLIGATION_BONDS;
            case "IET":
                return IOETTE_MORTGAGE;
            case "LOFC":
                return LETTER_OF_CREDIT;
            case "LQN":
                return LIQUIDITY_NOTE;
            case "MATURED":
                return MATURED;
            case "MBS":
                return MORTGAGE_BACKED_SECURITIES;
            case "MF":
                return MUTUAL_FUND;
            case "MIO":
                return MORTGAGE_INTEREST_ONLY;
            case "MLEG":
                return MULTI_LEG_INSTRUMENT;
            case "MPO":
                return MORTGAGE_PRINCIPAL_ONLY;
            case "MPP":
                return MORTGAGE_PRIVATE_PLACEMENT;
            case "MPT":
                return MISCELLANEOUS_PASS_THROUGH;
            case "MT":
                return MANDATORY_TENDER;
            case "MTN":
                return MEDIUM_TERM_NOTES;
            case "NONE":
                return NO_SECURITY_TYPE;
            case "ONITE":
                return OVERNIGHT;
            case "OPT":
                return OPTION;
            case "PEF":
                return PRIVATE_EXPORT_FUNDING;
            case "PFAND":
                return PFANDBRIEFE;
            case "PN":
                return PROMISSORY_NOTE;
            case "PS":
                return PREFERRED_STOCK;
            case "PZFJ":
                return PLAZOS_FIJOS;
            case "RAN":
                return REVENUE_ANTICIPATION_NOTE;
            case "REPLACD":
                return REPLACED;
            case "REPO":
                return REPURCHASE;
            case "RETIRED":
                return RETIRED;
            case "REV":
                return REVENUE_BONDS;
            case "RVLV":
                return REVOLVER_LOAN;
            case "RVLVTRM":
                return REVOLVER_TERM_LOAN;
            case "SECLOAN":
                return SECURITIES_LOAN;
            case "SECPLEDGE":
                return SECURITIES_PLEDGE;
            case "SPCLA":
                return SPECIAL_ASSESSMENT;
            case "SPCLO":
                return SPECIAL_OBLIGATION;
            case "SPCLT":
                return SPECIAL_TAX;
            case "STN":
                return SHORT_TERM_LOAN_NOTE;
            case "STRUCT":
                return STRUCTURED_NOTES;
            case "SUPRA":
                return USD_SUPRANATIONAL_COUPONS;
            case "SWING":
                return SWING_LINE_FACILITY;
            case "TAN":
                return TAX_ANTICIPATION_NOTE;
            case "TAXA":
                return TAX_ALLOCATION;
            case "TBA":
                return TO_BE_ANNOUNCED;
            case "TBILL":
                return US_TREASURY_BILL;
            case "TBOND":
                return US_TREASURY_BOND;
            case "TCAL":
                return PRINCIPAL_STRIP_OF_A_CALLABLE_BOND_OR_NOTE;
            case "TD":
                return TIME_DEPOSIT;
            case "TECP":
                return TAX_EXEMPT_COMMERCIAL_PAPER;
            case "TERM":
                return TERM_LOAN;
            case "TINT":
                return INTEREST_STRIP_FROM_ANY_BOND_OR_NOTE;
            case "TIPS":
                return TREASURY_INFLATION_PROTECTED_SECURITIES;
            case "TNOTE":
                return US_TREASURY_NOTE;
            case "TPRN":
                return PRINCIPAL_STRIP_FROM_A_NON_CALLABLE_BOND_OR_NOTE;
            case "TRAN":
                return TAX_AND_REVENUE_ANTICIPATION_NOTE;
            case "VRDN":
                return VARIABLE_RATE_DEMAND_NOTE;
            case "WAR":
                return WARRANT;
            case "WITHDRN":
                return WITHDRAWN;
            case "XCN":
                return EXTENDED_COMM_NOTE;
            case "XLINKD":
                return INDEXED_LINKED;
            case "YANK":
                return YANKEE_CORPORATE_BOND;
            case "YCD":
                return YANKEE_CERTIFICATE_OF_DEPOSIT;
        }
        return null;
    }

}