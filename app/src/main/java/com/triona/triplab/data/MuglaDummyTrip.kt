package com.triona.triplab.data

object MuglaDummyTrip {
    val muglaTripSteps = listOf(
        TripStep(
            title = "Ölüdeniz Plajı Ziyareti",
            quickDescription = "Muhteşem manzarasıyla ünlü Ölüdeniz Plajı'nı ziyaret edin.",
            detailedDescription = "Muğla'nın Fethiye ilçesinde bulunan Ölüdeniz Plajı'nın turkuaz rengi denizi ve beyaz kumuyla ünlüdür.",
            startHour = 9,
            endHour = 11,
            date = "2024-08-10",
            location = "36.5650, 29.1155",
            photo = "oludeniz.jpg"
        ),
        TripStep(
            title = "Saklıkent Kanyonu Trekking",
            quickDescription = "Saklıkent Kanyonu'nda doğa yürüyüşü yapın.",
            detailedDescription = "Muğla'nın Fethiye ilçesinde bulunan Saklıkent Kanyonu, yüksek duvarları ve serin sularıyla ünlüdür.",
            startHour = 12,
            endHour = 14,
            date = "2024-08-10",
            location = "36.5720, 29.3482",
            photo = "saklikent.jpg"
        ),
        TripStep(
            title = "Dalyan Tekne Turu",
            quickDescription = "Dalyan'da Caretta Caretta kaplumbağalarını görebileceğiniz bir tekne turuna çıkın.",
            detailedDescription = "Muğla'nın Ortaca ilçesinde bulunan Dalyan, antik kalıntıları, kaplumbağa plajları ve termal sularıyla ünlüdür.",
            startHour = 15,
            endHour = 17,
            date = "2024-08-10",
            location = "36.8297, 28.6423",
            photo = "dalyan.jpg"
        ),
        TripStep(
            title = "Bodrum'da Akşam Yemeği ve Gece Hayatı",
            quickDescription = "Bodrum'un eğlenceli gece hayatını keşfedin ve deniz ürünleriyle ünlü restoranlarda akşam yemeği yiyin.",
            detailedDescription = "Muğla'nın Bodrum ilçesi, yat limanları, antik kalıntıları ve gece kulüpleriyle ünlüdür.",
            startHour = 19,
            endHour = 22,
            date = "2024-08-10",
            location = "37.0359, 27.4305",
            photo = "bodrum.jpg"
        ),
        TripStep(
            title = "Konaklama",
            quickDescription = "Muğla'nın güzel bir otelinde konaklayın.",
            detailedDescription = "Muğla'nın çeşitli ilçelerinde birçok konaklama seçeneği bulunmaktadır.",
            startHour = 22,
            endHour = 23,
            date = "2024-08-10",
            location = "37.1649, 28.2457",
            photo = "konaklama.jpg"
        )
    )

    // Muğla için Trip nesnesini oluşturma
    val muglaTrip = Trip(
        id = 1,
        title = "Muğla Serüveni",
        description = "Muğla'nın doğal güzelliklerini ve tarihi yerlerini keşfedin.",
        location = "Muğla, Türkiye",
        steps = muglaTripSteps
    )

}