package com.triona.triplab.data

import com.triona.triplab.R

object MuglaDummyTrip {
    val muglaTripSteps = listOf(
        TripStep(
            title = "Ölüdeniz Plajı Ziyareti",
            quickDescription = "Muhteşem manzarasıyla ünlü Ölüdeniz Plajı'nı ziyaret edin.",
            detailedDescription = "Muğla'nın Fethiye ilçesinde bulunan Ölüdeniz Plajı'nın turkuaz rengi denizi ve beyaz kumuyla ünlüdür.",
            startTime = "09:00",
            endTime = "11:00",
            date = "2024-08-10",
            location = "36.5650, 29.1155",
            photo = "oludeniz.jpg",
            drawable = R.mipmap.img_oludeniz
        ),
        TripStep(
            title = "Saklıkent Kanyonu Trekking",
            quickDescription = "Saklıkent Kanyonu'nda doğa yürüyüşü yapın.",
            detailedDescription = "Muğla'nın Fethiye ilçesinde bulunan Saklıkent Kanyonu, yüksek duvarları ve serin sularıyla ünlüdür.",
            startTime = "12:00",
            endTime = "14:00",
            date = "2024-08-10",
            location = "36.5720, 29.3482",
            photo = "saklikent.jpg",
            drawable = R.mipmap.img_saklikent_kanyon
        ),
        TripStep(
            title = "Dalyan Tekne Turu",
            quickDescription = "Dalyan'da Caretta Caretta kaplumbağalarını görebileceğiniz bir tekne turuna çıkın.",
            detailedDescription = "Muğla'nın Ortaca ilçesinde bulunan Dalyan, antik kalıntıları, kaplumbağa plajları ve termal sularıyla ünlüdür.",
            startTime = "15:00",
            endTime = "17:00",
            date = "2024-08-10",
            location = "36.8297, 28.6423",
            photo = "dalyan.jpg",
            drawable = R.mipmap.img_dalyan_tekneturu
        ),
        TripStep(
            title = "Bodrum'da Akşam Yemeği ve Gece Hayatı",
            quickDescription = "Bodrum'un eğlenceli gece hayatını keşfedin ve deniz ürünleriyle ünlü restoranlarda akşam yemeği yiyin.",
            detailedDescription = "Muğla'nın Bodrum ilçesi, yat limanları, antik kalıntıları ve gece kulüpleriyle ünlüdür.",
            startTime = "19:00",
            endTime = "22:00",
            date = "2024-08-10",
            location = "37.0359, 27.4305",
            photo = "bodrum.jpg",
            drawable = R.mipmap.img_bodrum_aksam_yemegi
        ),
        TripStep(
            title = "Konaklama",
            quickDescription = "Muğla'nın güzel bir otelinde konaklayın.",
            detailedDescription = "Muğla'nın çeşitli ilçelerinde birçok konaklama seçeneği bulunmaktadır.",
            startTime = "22:00",
            endTime = "23:00",
            date = "2024-08-10",
            location = "37.1649, 28.2457",
            photo = "konaklama.jpg",
            drawable = R.mipmap.img_konaklama
        )
    )

    // Muğla için Trip nesnesini oluşturma
    val muglaTrip = Trip(
        id = 1,
        drawable = R.mipmap.img_seruven_mugla,
        title = "Muğla Serüveni",
        description = "Muğla'nın doğal güzelliklerini ve tarihi yerlerini keşfedin.",
        likeCount = 200,
        location = "Muğla, Türkiye",
        steps = muglaTripSteps
    )

}