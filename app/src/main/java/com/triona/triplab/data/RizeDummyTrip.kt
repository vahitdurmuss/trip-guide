package com.triona.triplab.data

object RizeDummyTrip {
    val rizeTripSteps = listOf(
        TripStep(
            title = "Sabah Kahvaltısı",
            quickDescription = "Rize'nin lezzetli kahvaltılarından keyif alın.",
            detailedDescription = "Rize'de güzel bir kahvaltı yapın ve yöresel lezzetleri deneyin.",
            startTime = "08:00",
            endTime = "09:00",
            date = "2024-07-25",
            location = "40.9091, 40.8933",
            photo = "kahvalti.jpg"
        ),
        TripStep(
            title = "Botanik Park Ziyareti",
            quickDescription = "Doğanın güzelliklerini keşfedin.",
            detailedDescription = "Rize Botanik Parkı'nda yürüyüş yapın ve çeşitli bitki türlerini keşfedin.",
            startTime = "10:00",
            endTime = "12:00",
            date = "2024-07-25",
            location = "40.9300, 40.8889",
            photo = "botanik_park.jpg"
        ),
        TripStep(
            title = "Çay Fabrikası Turu",
            quickDescription = "Rize'nin çay üretim sürecini öğrenin.",
            detailedDescription = "Rize çay fabrikasını ziyaret edin ve çayın üretim aşamalarını görün.",
            startTime = "13:00",
            endTime = "15:00",
            date = "2024-07-25",
            location = "40.9194, 40.8707",
            photo = "cay_fabrikasi.jpg"
        ),
        TripStep(
            title = "Öğle Yemeği",
            quickDescription = "Yöresel bir restoranda öğle yemeği.",
            detailedDescription = "Rize'nin meşhur lezzetlerini tadabileceğiniz bir restoranda öğle yemeği.",
            startTime = "12:00",
            endTime = "13:00",
            date = "2024-07-25",
            location = "40.9047, 40.9059",
            photo = "ogle_yemegi.jpg"
        ),
        TripStep(
            title = "Şelale Ziyareti",
            quickDescription = "Doğanın içinde serinleyin.",
            detailedDescription = "Rize'nin doğal güzelliklerinden biri olan şelaleyi ziyaret edin ve serinleyin.",
            startTime = "15:00",
            endTime = "17:00",
            date = "2024-07-25",
            location = "40.9561, 40.6903",
            photo = "selale.jpg"
        ),
        TripStep(
            title = "El Sanatları Atölyesi Ziyareti",
            quickDescription = "Yöresel el sanatlarına tanıklık edin.",
            detailedDescription = "Rize'de bir el sanatları atölyesini ziyaret edin ve geleneksel el işçiliği hakkında bilgi edinin.",
            startTime = "17:00",
            endTime = "18:00",
            date = "2024-07-25",
            location = "40.9069, 40.9216",
            photo = "el_sanatlari.jpg"
        ),
        TripStep(
            title = "Akşam Çay Keyfi",
            quickDescription = "Rize çayının tadını çıkarın.",
            detailedDescription = "Akşam üzeri bir çay bahçesinde Rize'nin meşhur çayını içerek keyif yapın.",
            startTime = "18:00",
            endTime = "19:00",
            date = "2024-07-25",
            location = "40.9084, 40.9552",
            photo = "aksam_cay.jpg"
        ),
        TripStep(
            title = "Akşam Yemeği",
            quickDescription = "Akşam yemeği için yerel bir restorana gidin.",
            detailedDescription = "Rize'nin lezzetli yemeklerinden oluşan bir akşam yemeği için yerel bir restorana gidin.",
            startTime = "19:00",
            endTime = "20:00",
            date = "2024-07-25",
            location = "40.9047, 40.9059",
            photo = "aksam_yemegi.jpg"
        ),
        TripStep(
            title = "Sahil Gezisi",
            quickDescription = "Rize'nin sahilini keşfedin.",
            detailedDescription = "Güneşin batışını izlemek için Rize'nin sahilini gezin ve manzaraya hayran kalın.",
            startTime = "20:00",
            endTime = "21:00",
            date = "2024-07-25",
            location = "40.9371, 40.9357",
            photo = "sahil_gezisi.jpg"
        ),
        TripStep(
            title = "Dönüş ve Konaklama",
            quickDescription = "Otele dönüş ve geceyi dinlenerek geçirin.",
            detailedDescription = "Günün sonunda otele dönün ve dinlenmek için zaman ayırın.",
            startTime = "21:00",
            endTime = "22:00",
            date = "2024-07-25",
            location = "40.9063, 40.9075",
            photo = "konaklama.jpg"
        )
    )


    // Rize için Trip nesnesini oluşturma
    val rizeTrip = Trip(
        id = 1,
        title = "Rize Keşfi",
        likeCount = 300,
        description = "Rize'nin doğal güzelliklerini ve kültürel zenginliklerini keşfedin.",
        location = "Rize, Türkiye",
        steps = rizeTripSteps
    )

}