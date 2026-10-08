package com.masrofy.app.model

data class CurrencyOption(
    val code: String,
    val symbol: String,
    val name: String,
    val flag: String
)

object Currencies {
    val all = listOf(
        CurrencyOption("EGP", "ج.م", "Egyptian Pound", "🇪🇬"),
        CurrencyOption("SAR", "ر.س", "Saudi Riyal", "🇸🇦"),
        CurrencyOption("USD", "$", "US Dollar", "🇺🇸"),
        CurrencyOption("EUR", "€", "Euro", "🇪🇺"),
        CurrencyOption("AED", "د.إ", "UAE Dirham", "🇦🇪"),
        CurrencyOption("KWD", "د.ك", "Kuwaiti Dinar", "🇰🇼"),
        CurrencyOption("QAR", "ر.ق", "Qatari Riyal", "🇶🇦"),
        CurrencyOption("GBP", "£", "British Pound", "🇬🇧"),
        CurrencyOption("BHD", "د.ب", "Bahraini Dinar", "🇧🇭"),
        CurrencyOption("OMR", "ر.ع", "Omani Rial", "🇴🇲"),
        CurrencyOption("JOD", "د.أ", "Jordanian Dinar", "🇯🇴"),
        CurrencyOption("LYD", "د.ل", "Libyan Dinar", "🇱🇾"),
        CurrencyOption("TND", "د.ت", "Tunisian Dinar", "🇹🇳"),
        CurrencyOption("DZD", "د.ج", "Algerian Dinar", "🇩🇿"),
        CurrencyOption("MAD", "د.م", "Moroccan Dirham", "🇲🇦"),
        CurrencyOption("IQD", "ع.د", "Iraqi Dinar", "🇮🇶"),
        CurrencyOption("SYP", "ل.س", "Syrian Pound", "🇸🇾"),
        CurrencyOption("LBP", "ل.ل", "Lebanese Pound", "🇱🇧"),
        CurrencyOption("SDD", "ج.س", "Sudanese Pound", "🇸🇩"),
        CurrencyOption("YER", "ر.ي", "Yemeni Rial", "🇾🇪"),
        CurrencyOption("AUD", "A$", "Australian Dollar", "🇦🇺"),
        CurrencyOption("CAD", "C$", "Canadian Dollar", "🇨🇦"),
        CurrencyOption("JPY", "¥", "Japanese Yen", "🇯🇵"),
        CurrencyOption("CNY", "¥", "Chinese Yuan", "🇨🇳"),
        CurrencyOption("INR", "₹", "Indian Rupee", "🇮🇳"),
    )

    val default get() = all.first { it.code == "EGP" }
}
