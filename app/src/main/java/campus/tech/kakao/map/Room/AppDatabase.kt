package campus.tech.kakao.map.Room

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [MapItem::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun selectMapItemDao(): SelectMapItemDao

}