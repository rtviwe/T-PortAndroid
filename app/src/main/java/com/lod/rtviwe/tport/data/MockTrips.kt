package com.lod.rtviwe.tport.data

import androidx.lifecycle.MutableLiveData
import com.lod.rtviwe.tport.model.*
import java.util.*

object MockTrips : TripsProvider {

    override fun getItems() = data

    private fun getDatePlus(hours: Int, minutes: Int): Date =
        Calendar.getInstance().apply {
            add(Calendar.HOUR, hours)
            add(Calendar.MINUTE, minutes)
        }.time

    private val data = MutableLiveData<MutableList<Trip>>().apply {
        postValue(
            mutableListOf(
                Trip(
                    "stub id",
                    Destination(
                        Place(
                            "Москва",
                            "Moscow",
                            "MOW",
                            Coordinates(
                                53.35,
                                5.2
                            )
                        ),
                        Place(
                            "Ростов-на-Дону",
                            "Rostov",
                            "ROS",
                            Coordinates(
                                5.6445,
                                0.9
                            )
                        )
                    ),
                    listOf(
                        Route(
                            "stub id",
                            Transport(
                                "UberX",
                                TransportationType.TAXI
                            ),
                            350.0,
                            Destination(
                                Place(
                                    "Отель \"Галерея\"",
                                    "Moscow",
                                    "MOW",
                                    Coordinates(
                                        52.0,
                                        69.69
                                    )
                                ),
                                Place(
                                    "Домодедово",
                                    "MOW",
                                    "DOM",
                                    Coordinates(
                                        69.69,
                                        14.88
                                    )
                                )
                            ),
                            Date(),
                            getDatePlus(1, 10),
                            true
                        ),
                        Route(
                            "stub id",
                            Transport(
                                "Аэрофлот",
                                TransportationType.AIRPLANE
                            ),
                            3500.0,
                            Destination(
                                Place(
                                    "Домодедово",
                                    "Moscow",
                                    "MOW",
                                    Coordinates(
                                        45.12,
                                        45.54
                                    )
                                ),
                                Place(
                                    "Платов",
                                    "Rostov",
                                    "ROS",
                                    Coordinates(
                                        45.12,
                                        45.54
                                    )
                                )
                            ),
                            getDatePlus(1, 10),
                            getDatePlus(2, 30)
                        ),
                        Route(
                            "stub id",
                            Transport(
                                "РЖД",
                                TransportationType.TRAIN
                            ),
                            1200.0,
                            Destination(
                                Place(
                                    "Платов",
                                    "Rostov",
                                    "ROS",
                                    Coordinates(
                                        45.12,
                                        45.54
                                    )
                                ),
                                Place(
                                    "Ростов-на-Дону",
                                    "Rostov",
                                    "ROS",
                                    Coordinates(
                                        45.12,
                                        45.54
                                    )
                                )
                            ),
                            getDatePlus(2, 30),
                            getDatePlus(4, 55)
                        )
                    ),
                    700.0
                ),
                Trip(
                    "stub id",
                    Destination(
                        Place(
                            "Санкт-Петербург",
                            "Moscow",
                            "MOW",
                            Coordinates(
                                53.35,
                                5.2
                            )
                        ),
                        Place(
                            "Иркутск",
                            "Rostov",
                            "ROS",
                            Coordinates(
                                5.6445,
                                0.9
                            )
                        )
                    ),
                    listOf(
                        Route(
                            "stub id",
                            Transport(
                                "UberX",
                                TransportationType.TAXI
                            ),
                            350.0,
                            Destination(
                                Place(
                                    "Точка А",
                                    "Moscow",
                                    "MOW",
                                    Coordinates(
                                        52.0,
                                        69.69
                                    )
                                ),
                                Place(
                                    "Домодедово",
                                    "MOW",
                                    "DOM",
                                    Coordinates(
                                        69.69,
                                        14.88
                                    )
                                )
                            ),
                            Date(),
                            Date(),
                            true
                        ),
                        Route(
                            "stub id",
                            Transport(
                                "Аэрофлот",
                                TransportationType.AIRPLANE
                            ),
                            3500.0,
                            Destination(
                                Place(
                                    "Домодедово",
                                    "Moscow",
                                    "MOW",
                                    Coordinates(
                                        45.12,
                                        45.54
                                    )
                                ),
                                Place(
                                    "Платов",
                                    "Rostov",
                                    "ROS",
                                    Coordinates(
                                        45.12,
                                        45.54
                                    )
                                )
                            ),
                            Date(),
                            Date()
                        ),
                        Route(
                            "stub id",
                            Transport(
                                "РЖД",
                                TransportationType.TRAIN
                            ),
                            1200.0,
                            Destination(
                                Place(
                                    "Платов",
                                    "Rostov",
                                    "ROS",
                                    Coordinates(
                                        45.12,
                                        45.54
                                    )
                                ),
                                Place(
                                    "Ростов-на-Дону",
                                    "Rostov",
                                    "ROS",
                                    Coordinates(
                                        45.12,
                                        45.54
                                    )
                                )
                            ),
                            Date(),
                            Date()
                        )
                    ),
                    700.0
                ),
                Trip(
                    "stub id",
                    Destination(
                        Place(
                            "Краснодар",
                            "Moscow",
                            "MOW",
                            Coordinates(
                                53.35,
                                5.2
                            )
                        ),
                        Place(
                            "Мурманск",
                            "Rostov",
                            "ROS",
                            Coordinates(
                                5.6445,
                                0.9
                            )
                        )
                    ),
                    listOf(
                        Route(
                            "stub id",
                            Transport(
                                "UberX",
                                TransportationType.TAXI
                            ),
                            350.0,
                            Destination(
                                Place(
                                    "Горняк-2",
                                    "Moscow",
                                    "MOW",
                                    Coordinates(
                                        52.0,
                                        69.69
                                    )
                                ),
                                Place(
                                    "Домодедово",
                                    "MOW",
                                    "DOM",
                                    Coordinates(
                                        69.69,
                                        14.88
                                    )
                                )
                            ),
                            Date(),
                            Date(),
                            true
                        ),
                        Route(
                            "stub id",
                            Transport(
                                "Аэрофлот",
                                TransportationType.AIRPLANE
                            ),
                            3500.0,
                            Destination(
                                Place(
                                    "Домодедово",
                                    "Moscow",
                                    "MOW",
                                    Coordinates(
                                        45.12,
                                        45.54
                                    )
                                ),
                                Place(
                                    "Платов",
                                    "Rostov",
                                    "ROS",
                                    Coordinates(
                                        45.12,
                                        45.54
                                    )
                                )
                            ),
                            Date(),
                            Date()
                        ),
                        Route(
                            "stub id",
                            Transport(
                                "РЖД",
                                TransportationType.TRAIN
                            ),
                            1200.0,
                            Destination(
                                Place(
                                    "Платов",
                                    "Rostov",
                                    "ROS",
                                    Coordinates(
                                        45.12,
                                        45.54
                                    )
                                ),
                                Place(
                                    "Ростов-на-Дону",
                                    "Rostov",
                                    "ROS",
                                    Coordinates(
                                        45.12,
                                        45.54
                                    )
                                )
                            ),
                            Date(),
                            Date()
                        )
                    ),
                    700.0
                )
            )
        )
    }
}