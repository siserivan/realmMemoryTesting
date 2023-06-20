package app.dev.realmmemorytesting.data

import app.dev.realmmemorytesting.model.AnotherComplexModel
import app.dev.realmmemorytesting.model.ComplexModel
import app.dev.realmmemorytesting.model.YetAnotherComplexModel
import io.realm.kotlin.ext.realmListOf
import io.realm.kotlin.types.RealmList

object MockData {

    fun generateRandomComplexModel(): ComplexModel {
        val complexModel = ComplexModel()

        // Set random values for the properties
        complexModel.property1 = generateRandomString()
        complexModel.property2 = generateRandomInt()
        complexModel.property3 = generateRandomBoolean()
        complexModel.property4 = generateRandomFloat()
        complexModel.property5 = generateRandomDouble()
        complexModel.property6 = generateRandomLong()
        complexModel.property7 = generateRandomByte()
        complexModel.property8 = generateRandomShort()
        complexModel.property9 = generateRandomChar()
        complexModel.property10 = generateRandomStringList()
        complexModel.property11 = generateRandomIntList()
        complexModel.property12 = generateRandomBooleanList()
        complexModel.property13 = generateRandomFloatList()
        complexModel.property14 = generateRandomDoubleList()
        complexModel.property15 = generateRandomLongList()
        complexModel.property16 = generateRandomByteList()
        complexModel.property17 = generateRandomShortList()
        complexModel.property18 = generateRandomCharList()
        complexModel.property19 = generateRandomAnotherComplexModel()
        complexModel.property20 = generateRandomAnotherComplexModelList()
        complexModel.property21 = generateRandomYetAnotherComplexModel()
        complexModel.property22 = generateRandomYetAnotherComplexModelList()
        complexModel.property23 = generateRandomString()
        complexModel.property24 = generateRandomString()
        complexModel.property25 = generateRandomString()
        complexModel.property26 = generateRandomString()
        complexModel.property27 = generateRandomString()
        complexModel.property28 = generateRandomString()
        complexModel.property29 = generateRandomString()
        complexModel.property30 = generateRandomString()

        return complexModel
    }

    private fun generateRandomString(): String {
        // Generate and return a random string
        return java.util.UUID.randomUUID().toString()
    }

    fun generateRandomInt(): Int {
        // Generate and return a random integer
        return (0..100).random()
    }

    fun generateRandomBoolean(): Boolean {
        // Generate and return a random boolean value
        return listOf(true, false).random()
    }

    fun generateRandomFloat(): Float {
        // Generate and return a random float value
        return (0..100).random().toFloat()
    }

    fun generateRandomDouble(): Double {
        // Generate and return a random double value
        return (0..100).random().toDouble()
    }

    fun generateRandomLong(): Long {
        // Generate and return a random long value
        return (0..100).random().toLong()
    }

    fun generateRandomByte(): Byte {
        // Generate and return a random byte value
        return (0..Byte.MAX_VALUE).random().toByte()
    }

    fun generateRandomShort(): Short {
        // Generate and return a random short value
        return (0..100).random().toShort()
    }

    fun generateRandomChar(): Char {
        // Generate and return a random char value
        return ('A'..'Z').random()
    }

    fun generateRandomStringList(): RealmList<String> {
        // Generate and return a list of random strings
        val stringList = realmListOf<String>()
        repeat((0..5).random()) {
            stringList.add(generateRandomString())
        }
        return stringList
    }

    fun generateRandomIntList(): RealmList<Int> {
        // Generate and return a list of random integers
        val intList = realmListOf<Int>()
        repeat((0..5).random()) {
            intList.add(generateRandomInt())
        }
        return intList
    }

    fun generateRandomBooleanList(): RealmList<Boolean> {
        // Generate and return a list of random booleans
        val booleanList = realmListOf<Boolean>()
        repeat((0..5).random()) {
            booleanList.add(generateRandomBoolean())
        }
        return booleanList
    }

    fun generateRandomFloatList(): RealmList<Float> {
        // Generate and return a list of random floats
        val floatList = realmListOf<Float>()
        repeat((0..5).random()) {
            floatList.add(generateRandomFloat())
        }
        return floatList
    }

    fun generateRandomDoubleList(): RealmList<Double> {
        // Generate and return a list of random doubles
        val doubleList = realmListOf<Double>()
        repeat((0..5).random()) {
            doubleList.add(generateRandomDouble())
        }
        return doubleList
    }

    fun generateRandomLongList(): RealmList<Long> {
        // Generate and return a list of random longs
        val longList = realmListOf<Long>()
        repeat((0..5).random()) {
            longList.add(generateRandomLong())
        }
        return longList
    }

    fun generateRandomByteList(): RealmList<Byte> {
        // Generate and return a list of random bytes
        val byteList = realmListOf<Byte>()
        repeat((0..5).random()) {
            byteList.add(generateRandomByte())
        }
        return byteList
    }

    fun generateRandomShortList(): RealmList<Short> {
        // Generate and return a list of random shorts
        val shortList = realmListOf<Short>()
        repeat((0..5).random()) {
            shortList.add(generateRandomShort())
        }
        return shortList
    }

    fun generateRandomCharList(): RealmList<Char> {
        // Generate and return a list of random chars
        val charList = realmListOf<Char>()
        repeat((0..5).random()) {
            charList.add(generateRandomChar())
        }
        return charList
    }

    fun generateRandomAnotherComplexModel(): AnotherComplexModel {
        val anotherComplexModel = AnotherComplexModel()

        // Set random values for the properties of AnotherComplexModel
        anotherComplexModel.anotherProperty1 = generateRandomString()
        anotherComplexModel.anotherProperty2 = generateRandomInt()
        anotherComplexModel.anotherProperty3 = generateRandomBoolean()

        return anotherComplexModel
    }

    fun generateRandomAnotherComplexModelList(): RealmList<AnotherComplexModel> {
        val anotherComplexModelList = realmListOf<AnotherComplexModel>()
        repeat((0..3).random()) {
            anotherComplexModelList.add(generateRandomAnotherComplexModel())
        }
        return anotherComplexModelList
    }

    fun generateRandomYetAnotherComplexModel(): YetAnotherComplexModel {
        val yetAnotherComplexModel = YetAnotherComplexModel()

        // Set random values for the properties of YetAnotherComplexModel
        yetAnotherComplexModel.yetAnotherProperty1 = generateRandomString()
        yetAnotherComplexModel.yetAnotherProperty2 = generateRandomInt()
        yetAnotherComplexModel.yetAnotherProperty3 = generateRandomBoolean()

        return yetAnotherComplexModel
    }

    fun generateRandomYetAnotherComplexModelList(): RealmList<YetAnotherComplexModel> {
        val yetAnotherComplexModelList = realmListOf<YetAnotherComplexModel>()
        repeat((0..3).random()) {
            yetAnotherComplexModelList.add(generateRandomYetAnotherComplexModel())
        }
        return yetAnotherComplexModelList
    }

}