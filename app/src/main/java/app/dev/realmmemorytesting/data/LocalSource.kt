package app.dev.realmmemorytesting.data

import app.dev.realmmemorytesting.model.AnotherComplexModel
import app.dev.realmmemorytesting.model.ComplexModel
import app.dev.realmmemorytesting.model.YetAnotherComplexModel
import io.realm.kotlin.Realm
import io.realm.kotlin.RealmConfiguration
import io.realm.kotlin.notifications.ResultsChange
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

object LocalSource {

    private const val VERSION_CODE: Long = 1
    private const val DATABASE_NAME: String = "myvalamar_storage"

    private val schema = setOf(
        ComplexModel::class,
        AnotherComplexModel::class,
        YetAnotherComplexModel::class
    )

    val config = RealmConfiguration.Builder(schema)
        .deleteRealmIfMigrationNeeded()
        .schemaVersion(VERSION_CODE)
        .name(DATABASE_NAME)
        .build()

    fun saveComplexModel() {
        val realm = Realm.open(config)
        realm.writeBlocking {
            copyToRealm(MockData.generateRandomComplexModel())
        }
        realm.close()
    }

    fun observeComplex() : Flow<ResultsChange<ComplexModel>> {
        val realm = Realm.open(config)
       return realm.query(ComplexModel::class).find().asFlow()
    }

}



