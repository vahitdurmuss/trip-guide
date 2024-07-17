package com.triona.triplab.data

object IstanbulDummyTrip {
    val istanbulTripSteps = listOf(
        TripStep(
            title = "Arrival and Check-in",
            quickDescription = "Arrive in Istanbul and check-in at the hotel",
            detailedDescription = "Arrive at the hotel, check-in, and settle into your room.",
            startHour = 14,
            endHour = 15,
            date = "2024-07-22",
            location = "41.015137,28.979530",
            photo = "istanbul_hotel.jpg"
        ),
        TripStep(
            title = "Visit Hagia Sophia",
            quickDescription = "Explore the historic Hagia Sophia museum",
            detailedDescription = "Visit Hagia Sophia, a former Greek Orthodox Christian cathedral and Ottoman imperial mosque.",
            startHour = 10,
            endHour = 12,
            date = "2024-07-22",
            location = "41.008237,28.978359",
            photo = "hagia_sophia.jpg"
        ),
        TripStep(
            title = "Lunch at Sultanahmet",
            quickDescription = "Enjoy lunch in the Sultanahmet area",
            detailedDescription = "Dine at a local restaurant near Sultanahmet Square, surrounded by historic landmarks.",
            startHour = 12,
            endHour = 13,
            date = "2024-07-22",
            location = "41.005500,28.977400",
            photo = "sultanahmet_lunch.jpg"
        ),
        TripStep(
            title = "Explore Grand Bazaar",
            quickDescription = "Shop at the historic Grand Bazaar",
            detailedDescription = "Discover thousands of shops selling carpets, jewelry, ceramics, spices, and more.",
            startHour = 14,
            endHour = 16,
            date = "2024-07-22",
            location = "41.010521,28.968065",
            photo = "grand_bazaar.jpg"
        ),
        TripStep(
            title = "Bosphorus Cruise",
            quickDescription = "Take a scenic cruise along the Bosphorus",
            detailedDescription = "Enjoy breathtaking views of Istanbul from the water, passing by palaces, mosques, and bridges.",
            startHour = 17,
            endHour = 18,
            date = "2024-07-22",
            location = "41.165041,29.036198",
            photo = "bosphorus_cruise.jpg"
        ),
        TripStep(
            title = "Dinner at Maiden's Tower",
            quickDescription = "Dine at Maiden's Tower",
            detailedDescription = "Enjoy dinner at a restaurant located on Maiden's Tower, surrounded by the Bosphorus.",
            startHour = 19,
            endHour = 20,
            date = "2024-07-22",
            location = "41.020659,29.004975",
            photo = "maidens_tower.jpg"
        ),
        TripStep(
            title = "Return to Hotel",
            quickDescription = "Return to the hotel and relax",
            detailedDescription = "After a day of exploring Istanbul, return to the hotel and relax for the evening.",
            startHour = 21,
            endHour = 22,
            date = "2024-07-22",
            location = "41.015137,28.979530",
            photo = "istanbul_hotel_night.jpg"
        )
    )

    val istanbulTrip = Trip(
        id = 1,
        title = "İstanbul Keşfi",
        likeCount = 100,
        description = "İstanbul'un tarihini ve güzelliklerini keşfetmek için mükemmel bir plan",
        location = "İstanbul, Türkiye",
        steps = istanbulTripSteps
    )
}