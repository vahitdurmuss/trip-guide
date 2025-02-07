package com.triona.triplab.data

object IstanbulDummyTrip {
    val istanbulTripSteps = listOf(
        TripStep(
            id = 0,
            title = "Arrival and Check-in",
            quickDescription = "Arrive in Istanbul and check-in at the hotel",
            detailedDescription = "Arrive at the hotel, check-in, and settle into your room.",
            startTime = "14:00",
            endTime = "15:00",
            date = "2024-07-22",
            location = "41.015137,28.979530",
            photo = "istanbul_hotel.jpg"
        ),
        TripStep(
            id = 0,
            title = "Visit Hagia Sophia",
            quickDescription = "Explore the historic Hagia Sophia museum",
            detailedDescription = "Visit Hagia Sophia, a former Greek Orthodox Christian cathedral and Ottoman imperial mosque.",
            startTime = "10:00",
            endTime = "12:00",
            date = "2024-07-22",
            location = "41.008237,28.978359",
            photo = "hagia_sophia.jpg"
        ),
        TripStep(
            id = 0,
            title = "Lunch at Sultanahmet",
            quickDescription = "Enjoy lunch in the Sultanahmet area",
            detailedDescription = "Dine at a local restaurant near Sultanahmet Square, surrounded by historic landmarks.",
            startTime = "12:00",
            endTime = "13:00",
            date = "2024-07-22",
            location = "41.005500,28.977400",
            photo = "sultanahmet_lunch.jpg"
        ),
        TripStep(
            id = 0,
            title = "Explore Grand Bazaar",
            quickDescription = "Shop at the historic Grand Bazaar",
            detailedDescription = "Discover thousands of shops selling carpets, jewelry, ceramics, spices, and more.",
            startTime = "14:00",
            endTime = "16:00",
            date = "2024-07-22",
            location = "41.010521,28.968065",
            photo = "grand_bazaar.jpg"
        ),
        TripStep(
            id = 0,
            title = "Bosphorus Cruise",
            quickDescription = "Take a scenic cruise along the Bosphorus",
            detailedDescription = "Enjoy breathtaking views of Istanbul from the water, passing by palaces, mosques, and bridges.",
            startTime = "17:00",
            endTime = "18:00",
            date = "2024-07-22",
            location = "41.165041,29.036198",
            photo = "bosphorus_cruise.jpg"
        ),
        TripStep(
            id = 0,
            title = "Dinner at Maiden's Tower",
            quickDescription = "Dine at Maiden's Tower",
            detailedDescription = "Enjoy dinner at a restaurant located on Maiden's Tower, surrounded by the Bosphorus.",
            startTime = "19:00",
            endTime = "20:00",
            date = "2024-07-22",
            location = "41.020659,29.004975",
            photo = "maidens_tower.jpg"
        ),
        TripStep(
            id = 0,
            title = "Return to Hotel",
            quickDescription = "Return to the hotel and relax",
            detailedDescription = "After a day of exploring Istanbul, return to the hotel and relax for the evening.",
            startTime = "21:00",
            endTime = "22:00",
            date = "2024-07-22",
            location = "41.015137,28.979530",
            photo = "istanbul_hotel_night.jpg"
        )
    )

    val istanbulTrip = Trip(
        guiderId = 0,
        id = 1,
        title = "İstanbul Keşfi",
        likeCount = 100,
        description = "İstanbul'un tarihini ve güzelliklerini keşfetmek için mükemmel bir plan",
        location = "İstanbul, Türkiye",
        steps = istanbulTripSteps
    )
}