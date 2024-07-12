package com.karsoft.effectivemobile.data.network

import com.karsoft.effectivemobile.data.models.DepartureResponse
import com.karsoft.effectivemobile.data.models.HandLuggageResponse
import com.karsoft.effectivemobile.data.models.LuggageResponse
import com.karsoft.effectivemobile.data.models.OfferResponse
import com.karsoft.effectivemobile.data.models.PriceResponse
import com.karsoft.effectivemobile.data.models.TicketOfferResponse
import com.karsoft.effectivemobile.data.models.TicketResponse

object EffectiveService {

    fun getOffers(): List<OfferResponse> {
        val listOfOffer = mutableListOf<OfferResponse>()
        listOfOffer.addAll(
            mutableListOf(
                OfferResponse(
                    id = 1,
                    title = "Die Antwoord",
                    town = "Будапешт",
                    price = PriceResponse(5000)
                ),
                OfferResponse(
                    id = 2,
                    title = "Socrat&Lera",
                    town = "Санкт-Петербург",
                    price = PriceResponse(1999)
                ),
                OfferResponse(
                    id = 3,
                    title = "Лампабикт",
                    town = "Москва",
                    price = PriceResponse(2390)
                ),
            )
        )
        return listOfOffer
    }

    fun getTicketsOffers(): MutableList<TicketOfferResponse> {
        val listOfTicketOffer = mutableListOf<TicketOfferResponse>()
        listOfTicketOffer.addAll(
            mutableListOf(
                TicketOfferResponse(
                    id = 1,
                    title = "Уральские авиалинии",
                    timeRange = listOf(
                        "07:00",
                        "09:10",
                        "10:00",
                        "11:30",
                        "14:15",
                        "19:10",
                        "21:00",
                        "23:30"
                    ),
                    price = PriceResponse(3999)
                ),
                TicketOfferResponse(
                    id = 10,
                    title = "Победа",
                    timeRange = listOf("09:10", "21:00"),
                    price = PriceResponse(4999)
                ),
                TicketOfferResponse(
                    id = 30,
                    title = "NordStar",
                    timeRange = listOf("07:00"),
                    price = PriceResponse(2390)
                ),
            )
        )
        return listOfTicketOffer
    }

    fun getTickets(): MutableList<TicketResponse> {
        val listOfTicketOffer = mutableListOf<TicketResponse>()
        listOfTicketOffer.addAll(
            mutableListOf(
                TicketResponse(
                    id = 100,
                    badge = "Самый удобный",
                    price = PriceResponse(1999),
                    provider_name = "На сайте Купибилет",
                    company = "Якутия",
                    departure = DepartureResponse(
                        town = "Москва",
                        date = "2024-02-23T03:15:00",
                        airport = "VKO"
                    ),
                    arrival = DepartureResponse(
                        town = "Сочи",
                        date = "2024-02-23T07:10:00",
                        airport = "AER"
                    ),
                    has_transfer = false,
                    has_visa_transfer = false,
                    luggage = LuggageResponse(
                        has_luggage = false,
                        price = PriceResponse(1082)
                    ),
                    hand_luggage = HandLuggageResponse(
                        has_hand_luggage = true,
                        size = "55x20x40"
                    ),
                    is_returnable = false,
                    is_exchangable = true
                ),
                TicketResponse(
                    id = 101,
                    badge = null,
                    price = PriceResponse(9999),
                    provider_name = "На сайте Победа",
                    company = "Победа",
                    departure = DepartureResponse(
                        town = "Москва",
                        date = "2024-02-23T04:00:00",
                        airport = "VKO"
                    ),
                    arrival = DepartureResponse(
                        town = "Сочи",
                        date = "2024-02-23T08:30:00",
                        airport = "AER"
                    ),
                    has_transfer = false,
                    has_visa_transfer = false,
                    luggage = LuggageResponse(
                        has_luggage = false,
                        price = PriceResponse(1602)
                    ),
                    hand_luggage = HandLuggageResponse(
                        has_hand_luggage = true,
                        size = "36x30x27"
                    ),
                    is_returnable = false,
                    is_exchangable = true
                ),
                TicketResponse(
                    id = 102,
                    badge = null,
                    price = PriceResponse(8500),
                    provider_name = "На сайте Turkish Airlines",
                    company = "Турецкие авиалинии",
                    departure = DepartureResponse(
                        town = "Москва",
                        date = "2024-02-23T15:00:00",
                        airport = "VKO"
                    ),
                    arrival = DepartureResponse(
                        town = "Сочи",
                        date = "2024-02-23T18:40:00",
                        airport = "AER"
                    ),
                    has_transfer = false,
                    has_visa_transfer = false,
                    luggage = LuggageResponse(
                        has_luggage = true,
                        price = PriceResponse(1111)
                    ),
                    hand_luggage = HandLuggageResponse(
                        has_hand_luggage = true,
                        size = "55x20x40"
                    ),
                    is_returnable = false,
                    is_exchangable = false
                ),
                TicketResponse(
                    id = 103,
                    badge = "Рекомендуемый",
                    price = PriceResponse(8086),
                    provider_name = "На сайте Уральские авиалинии",
                    company = "Уральские авиалинии",
                    departure = DepartureResponse(
                        town = "Москва",
                        date = "2024-02-23T11:30:00",
                        airport = "VKO"
                    ),
                    arrival = DepartureResponse(
                        town = "Сочи",
                        date = "2024-02-23T15:00:00",
                        airport = "AER"
                    ),
                    has_transfer = false,
                    has_visa_transfer = false,
                    luggage = LuggageResponse(
                        has_luggage = false,
                        price = PriceResponse(1570)
                    ),
                    hand_luggage = HandLuggageResponse(
                        has_hand_luggage = true,
                        size = "55x20x40"
                    ),
                    is_returnable = false,
                    is_exchangable = false
                ),
                TicketResponse(
                    id = 104,
                    badge = null,
                    price = PriceResponse(11560),
                    provider_name = "На сайте Aeroflot",
                    company = "Аэрофлот",
                    departure = DepartureResponse(
                        town = "Москва",
                        date = "2024-02-23T11:50:00",
                        airport = "VKO"
                    ),
                    arrival = DepartureResponse(
                        town = "Сочи",
                        date = "2024-02-23T15:20:00",
                        airport = "AER"
                    ),
                    has_transfer = true,
                    has_visa_transfer = false,
                    luggage = LuggageResponse(
                        has_luggage = false,
                        price = PriceResponse(999)
                    ),
                    hand_luggage = HandLuggageResponse(
                        has_hand_luggage = true,
                        size = "55x20x40"
                    ),
                    is_returnable = false,
                    is_exchangable = true
                ),
                TicketResponse(
                    id = 105,
                    badge = null,
                    price = PriceResponse(15600),
                    provider_name = "На сайте Aeroflot",
                    company = "Аэрофлот",
                    departure = DepartureResponse(
                        town = "Москва",
                        date = "2024-02-23T13:50:00",
                        airport = "VKO"
                    ),
                    arrival = DepartureResponse(
                        town = "Сочи",
                        date = "2024-02-23T17:20:00",
                        airport = "AER"
                    ),
                    has_transfer = true,
                    has_visa_transfer = true,
                    luggage = LuggageResponse(
                        has_luggage = true,
                        price = PriceResponse(1999)
                    ),
                    hand_luggage = HandLuggageResponse(
                        has_hand_luggage = true,
                        size = "55x20x40"
                    ),
                    is_returnable = true,
                    is_exchangable = true
                ),
                TicketResponse(
                    id = 106,
                    badge = null,
                    price = PriceResponse(9500),
                    provider_name = "На сайте Aeroflot",
                    company = "Аэрофлот",
                    departure = DepartureResponse(
                        town = "Москва",
                        date = "2024-02-23T21:00:00",
                        airport = "VKO"
                    ),
                    arrival = DepartureResponse(
                        town = "Сочи",
                        date = "2024-02-24T00:20:00",
                        airport = "AER"
                    ),
                    has_transfer = false,
                    has_visa_transfer = false,
                    luggage = LuggageResponse(
                        has_luggage = false,
                        price = PriceResponse(5999)
                    ),
                    hand_luggage = HandLuggageResponse(
                        has_hand_luggage = false,
                        size = "55x20x40"
                    ),
                    is_returnable = false,
                    is_exchangable = false
                )
            )
        )
        return listOfTicketOffer
    }

}