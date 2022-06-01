package com.example.cleanarchitecture.repositories

import androidx.lifecycle.LiveData
import com.example.cleanarchitecture.data.local.ShoppingItem
import com.example.cleanarchitecture.data.remote.responses.ImageResponse
import com.example.cleanarchitecture.other.Resource

interface ShoppingRepository {

    suspend fun insertShoppingItem(shoppingItem: ShoppingItem)

    suspend fun deleteShoppingItem(shoppingItem: ShoppingItem)

    fun observeAllShoppingItems(): LiveData<List<ShoppingItem>>

    fun observeTotalPrice(): LiveData<Float>

    suspend fun searchForImage(imageQuery: String): Resource<ImageResponse>
}