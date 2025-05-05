package com.gildedrose

class Item(@kotlin.jvm.JvmField var name: String, var sellIn: Int, var quality: Int) {
    override fun toString(): String {
        return this.name + ", " + this.sellIn + ", " + this.quality
    }
}
