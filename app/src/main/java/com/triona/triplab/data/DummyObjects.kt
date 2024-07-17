package com.triona.triplab.data

val listGuiders = List(10) { Guider(it, "Vahit", "Durmuş") }

val categories = listOf(
    "SeaSide", "Beach", "Mountain", "Historical", "Cultural", "Adventure",
    "CityBreak", "Wellness", "Gastronomy", "Nature", "Sports", "Family",
    "Romantic", "Luxury", "Backpacking", "Cruise", "Wildlife", "Festival",
    "Pilgrimage", "Shopping", "Photography"
)
val regions = listOf(
    "Marmara",
    "Aegean",
    "Black Sea",
    "Central Anatolia",
    "Eastern Anatolia",
    "Southeastern Anatolia",
    "Mediterranean"
)
val cities = listOf(
    "Adana", "Adıyaman", "Afyonkarahisar", "Ağrı", "Aksaray", "Amasya", "Ankara", "Antalya",
    "Ardahan", "Artvin", "Aydın", "Balıkesir", "Bartın", "Batman", "Bayburt", "Bilecik",
    "Bingöl", "Bitlis", "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankırı", "Çorum",
    "Denizli", "Diyarbakır", "Düzce", "Edirne", "Elazığ", "Erzincan", "Erzurum",
    "Eskişehir", "Gaziantep", "Giresun", "Gümüşhane", "Hakkari", "Hatay", "Iğdır",
    "Isparta", "İstanbul", "İzmir", "Kahramanmaraş", "Karabük", "Karaman", "Kars",
    "Kastamonu", "Kayseri", "Kırıkkale", "Kırklareli", "Kırşehir", "Kilis", "Kocaeli",
    "Konya", "Kütahya", "Malatya", "Manisa", "Mardin", "Mersin", "Muğla", "Muş",
    "Nevşehir", "Niğde", "Ordu", "Osmaniye", "Rize", "Sakarya", "Samsun", "Siirt",
    "Sinop", "Sivas", "Şanlıurfa", "Şırnak", "Tekirdağ", "Tokat", "Trabzon",
    "Tunceli", "Uşak", "Van", "Yalova", "Yozgat", "Zonguldak"
)

val onClickTrip: (Trip) -> Unit = {}
val onClickCategory: (String) -> Unit = {}
val onClickGuider: (Guider) -> Unit = {}
