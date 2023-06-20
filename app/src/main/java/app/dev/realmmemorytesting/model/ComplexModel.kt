package app.dev.realmmemorytesting.model

import io.realm.kotlin.ext.realmListOf
import io.realm.kotlin.types.RealmList
import io.realm.kotlin.types.RealmObject

open class ComplexModel : RealmObject {
    var property1: String? = null
    var property2: Int = 0
    var property3: Boolean = false
    var property4: Float = 0.0f
    var property5: Double = 0.0
    var property6: Long = 0L
    var property7: Byte = 0
    var property8: Short = 0
    var property9: Char = '\u0000'
    var property10: RealmList<String> = realmListOf()
    var property11: RealmList<Int> = realmListOf()
    var property12: RealmList<Boolean> = realmListOf()
    var property13: RealmList<Float> = realmListOf()
    var property14: RealmList<Double> = realmListOf()
    var property15: RealmList<Long> = realmListOf()
    var property16: RealmList<Byte> = realmListOf()
    var property17: RealmList<Short> = realmListOf()
    var property18: RealmList<Char> = realmListOf()
    var property19: AnotherComplexModel? = null
    var property20: RealmList<AnotherComplexModel> = realmListOf()
    var property21: YetAnotherComplexModel? = null
    var property22: RealmList<YetAnotherComplexModel> = realmListOf()
    var property23: String? = null
    var property24: String? = null
    var property25: String? = null
    var property26: String? = null
    var property27: String? = null
    var property28: String? = null
    var property29: String? = null
    var property30: String? = null
}

open class AnotherComplexModel : RealmObject {
    var anotherProperty1: String? = null
    var anotherProperty2: Int = 0
    var anotherProperty3: Boolean = false
    // ... add more properties as needed
}

open class YetAnotherComplexModel : RealmObject {
    var yetAnotherProperty1: String? = null
    var yetAnotherProperty2: Int = 0
    var yetAnotherProperty3: Boolean = false
    // ... add more properties as needed
}