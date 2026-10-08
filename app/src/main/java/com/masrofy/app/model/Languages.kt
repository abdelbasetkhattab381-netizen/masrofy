package com.masrofy.app.model

data class LanguageOption(
    val code: String,
    val displayName: String,
    val greeting: String,
    val nativeName: String
)

object Languages {
    val all = listOf(
        LanguageOption("ar-EG", "Egyptian Arabic", "إزيك يا باشا؟", "مصري"),
        LanguageOption("ar-SA", "Saudi Arabic", "هلا والله", "سعودي"),
        LanguageOption("ar-DZ", "Algerian Arabic", "واش راك خويا", "جزائري"),
        LanguageOption("ar-MA", "Moroccan Arabic", "كيداير؟", "مغربي"),
        LanguageOption("ar-TN", "Tunisian Arabic", "أهلا سفك", "تونسي"),
        LanguageOption("ar-IQ", "Iraqi Arabic", "هلا والله خوية", "عراقي"),
        LanguageOption("ar-SY", "Syrian Arabic", "كيفك يا أخي؟", "سوري"),
        LanguageOption("ar-LB", "Lebanese Arabic", "كيفك حبيبي؟", "لبناني"),
        LanguageOption("ar-JO", "Jordanian Arabic", "كيفك يا صاحبي؟", "أردني"),
        LanguageOption("ar-PS", "Palestinian Arabic", "كيف حالك؟", "فلسطيني"),
        LanguageOption("ar-LY", "Libyan Arabic", "كيفك يا وي؟", "ليبي"),
        LanguageOption("ar-SD", "Sudanese Arabic", "كيفك يا زول؟", "سوداني"),
        LanguageOption("ar-YE", "Yemeni Arabic", "كيفك يا أهل؟", "يمني"),
        LanguageOption("ar-OM", "Omani Arabic", "كيف حالك؟", "عماني"),
        LanguageOption("ar-AE", "Emirati Arabic", "كيفك يا خوي؟", "إماراتي"),
        LanguageOption("ar-QA", "Qatari Arabic", "كيفك يا خوي؟", "قطري"),
        LanguageOption("ar-BH", "Bahraini Arabic", "كيفك يا خوي؟", "بحريني"),
        LanguageOption("ar-KW", "Kuwaiti Arabic", "كيفك يا خوي؟", "كويتي"),
        LanguageOption("ar-MR", "Mauritanian Arabic", "كيفك يا خوي؟", "موريتاني"),
        LanguageOption("ar-KM", "Comorian Arabic", "كيفك يا خوي؟", "قمري"),
        LanguageOption("ar-DJ", "Djiboutian Arabic", "كيفك يا خوي؟", "جيبوتي"),
        LanguageOption("en-US", "English (US)", "How are you?", "English"),
        LanguageOption("en-GB", "English (UK)", "How are you, mate?", "English"),
        LanguageOption("en-AU", "English (AU)", "How ya going, mate?", "English"),
        LanguageOption("fr-FR", "French", "Comment ça va ?", "Français"),
        LanguageOption("fr-CA", "French (Canadian)", "Comment tu vas?", "Français"),
        LanguageOption("es-ES", "Spanish", "¿Cómo estás?", "Español"),
        LanguageOption("es-MX", "Spanish (Mexico)", "¿Qué onda?", "Español"),
        LanguageOption("de-DE", "German", "Wie geht's?", "Deutsch"),
        LanguageOption("it-IT", "Italian", "Come stai?", "Italiano"),
        LanguageOption("pt-PT", "Portuguese", "Como estás?", "Português"),
        LanguageOption("pt-BR", "Portuguese (Brazil)", "Tudo bem?", "Português"),
        LanguageOption("tr-TR", "Turkish", "Nasilsin?", "Türkçe"),
        LanguageOption("ru-RU", "Russian", "Как дела?", "Русский"),
        LanguageOption("zh-CN", "Chinese", "你好吗？", "中文"),
        LanguageOption("ja-JP", "Japanese", "お元気ですか？", "日本語"),
        LanguageOption("ko-KR", "Korean", "잘 지내세요?", "한국어"),
        LanguageOption("hi-IN", "Hindi", "आप कैसे हैं?", "हिन्दी"),
        LanguageOption("ur-PK", "Urdu", "آپ کیسے ہیں؟", "اردو"),
        LanguageOption("fa-IR", "Persian", "حالت چطوره؟", "فارسی"),
        LanguageOption("nl-NL", "Dutch", "Hoe gaat het?", "Nederlands"),
        LanguageOption("sv-SE", "Swedish", "Hur mår du?", "Svenska"),
        LanguageOption("id-ID", "Indonesian", "Apa kabar?", "Indonesia"),
    )

    val default get() = all.first { it.code == "ar-EG" }
}
