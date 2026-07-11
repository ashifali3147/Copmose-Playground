package com.tlw.composeplayground.projects.smartdashboard.model

data class RoomFilterModel(
    val id: Int,
    val name: String,
    val isSelected: Boolean
)

fun getRoomFilterList(): List<RoomFilterModel>{
    val roomFilterList: MutableList<RoomFilterModel> = mutableListOf()
    roomFilterList.add(
        RoomFilterModel(id = 1, "Favourite", false)
    )
    roomFilterList.add(
        RoomFilterModel(id = 2, "Kitchen", false)
    )
    roomFilterList.add(
        RoomFilterModel(id = 3, "Living Room", false)
    )
    roomFilterList.add(
        RoomFilterModel(id = 4, "Wash Room", false)
    )
    roomFilterList.add(
        RoomFilterModel(id = 5, "Kitchen", false)
    )
    roomFilterList.add(
        RoomFilterModel(id = 6, "Room 1", false)
    )
    return roomFilterList
}
