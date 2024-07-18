package com.triona.triplab.data

object AyderDummyTrip {

    val ayderYaylasiDummySteps = listOf(
        TripStep(
            title = "Ayder Yaylası'na Varış",
            quickDescription = "Yaylaya ulaşıp manzaranın tadını çıkarma.",
            detailedDescription = "Rize'den araçla Ayder Yaylası'na varış. Yaylanın muhteşem manzarası ve temiz havasıyla tanışma.",
            startHour = 9,
            endHour = 10,
            date = "2024-08-01",
            location = "40.9505, 41.1357",
            photo = "https://example.com/photos/ayder_varis.jpg"
        ), TripStep(
            title = "Ayder Yaylası Gezisi",
            quickDescription = "Yaylayı keşfetme ve yürüyüş.",
            detailedDescription = "Ayder Yaylası'nda yürüyüş yaparak çevreyi keşfetme. Doğa ile iç içe bir gün geçirme.",
            startHour = 10,
            endHour = 12,
            date = "2024-08-01",
            location = "40.9505, 41.1357",
            photo = "https://example.com/photos/ayder_gezi.jpg"
        ), TripStep(
            title = "Ayder Kaplıcaları",
            quickDescription = "Kaplıca keyfi.",
            detailedDescription = "Ayder'in ünlü kaplıcalarında dinlenme ve rahatlama.",
            startHour = 12,
            endHour = 14,
            date = "2024-08-01",
            location = "40.9520, 41.1370",
            photo = "https://example.com/photos/ayder_kaplica.jpg"
        ), TripStep(
            title = "Zilkale Ziyareti",
            quickDescription = "Tarihi kale ziyareti.",
            detailedDescription = "Yakınlardaki Zilkale'yi ziyaret ederek tarihi bir yapıyı keşfetme.",
            startHour = 15,
            endHour = 16,
            date = "2024-08-01",
            location = "40.9238, 41.1183",
            photo = "https://example.com/photos/zilkale.jpg"
        ), TripStep(
            title = "Fırtına Deresi'nde Rafting",
            quickDescription = "Heyecan dolu rafting deneyimi.",
            detailedDescription = "Fırtına Deresi'nde profesyonel rehberler eşliğinde rafting yapma.",
            startHour = 16,
            endHour = 18,
            date = "2024-08-01",
            location = "40.9505, 41.1357",
            photo = "https://example.com/photos/firtina_raft.jpg"
        ), TripStep(
            title = "Çamlıhemşin Gezisi",
            quickDescription = "Çamlıhemşin kasabasında gezi.",
            detailedDescription = "Ayder Yaylası'na yakın Çamlıhemşin kasabasını ziyaret etme ve yerel kültürü tanıma.",
            startHour = 10,
            endHour = 12,
            date = "2024-08-02",
            location = "40.9248, 41.0728",
            photo = "https://example.com/photos/camlihemsin.jpg"
        ), TripStep(
            title = "Huser Yaylası",
            quickDescription = "Huser Yaylası'nda manzara izleme.",
            detailedDescription = "Huser Yaylası'na çıkarak bulutların üzerinde bir manzara izleme deneyimi.",
            startHour = 13,
            endHour = 15,
            date = "2024-08-02",
            location = "40.9046, 41.0497",
            photo = "https://example.com/photos/huser.jpg"
        ), TripStep(
            title = "Pokut Yaylası",
            quickDescription = "Pokut Yaylası'nda kamp.",
            detailedDescription = "Pokut Yaylası'nda kamp yaparak doğayla iç içe bir gece geçirme.",
            startHour = 15,
            endHour = 18,
            date = "2024-08-02",
            location = "40.8884, 41.0497",
            photo = "https://example.com/photos/pokut.jpg"
        ), TripStep(
            title = "Elevit Yaylası",
            quickDescription = "Elevit Yaylası'nda doğa yürüyüşü.",
            detailedDescription = "Elevit Yaylası'nda doğa yürüyüşü yaparak bölgenin flora ve faunasını keşfetme.",
            startHour = 10,
            endHour = 12,
            date = "2024-08-03",
            location = "40.9435, 41.0417",
            photo = "https://example.com/photos/elevit.jpg"
        ), TripStep(
            title = "Ayder Yaylası'nda Akşam Yemeği",
            quickDescription = "Yerel yemeklerle akşam yemeği.",
            detailedDescription = "Ayder Yaylası'nda bir restoranda yerel Karadeniz mutfağının lezzetlerini tatma.",
            startHour = 18,
            endHour = 20,
            date = "2024-08-03",
            location = "40.9505, 41.1357",
            photo = "https://example.com/photos/ayder_yemek.jpg"
        )
    )

    val ayderYaylasiTrip = Trip(
        id = 3,
        likeCount = 0,
        title = "Ayder Yaylası Turu",
        description = "Ayder Yaylası ve çevresindeki doğa harikalarını ve aktiviteleri keşfetme.",
        location = "Rize, Türkiye",
        steps = ayderYaylasiDummySteps
    )

}