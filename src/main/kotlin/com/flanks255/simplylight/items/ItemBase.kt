package com.flanks255.simplylight.items

import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.Item

//just in case i need any pure items...
class ItemBase(val name: String): Item() {
    init {
        setTranslationKey(name)
        setRegistryName(name)
    }

    override fun setCreativeTab(tab: CreativeTabs): ItemBase {
        super.setCreativeTab(tab)
        return this
    }
}