package com.example.cleanarchitecture.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController

import com.example.cleanarchitecture.R
import kotlinx.android.synthetic.main.fragment_shopping.*


class ShoppingFragment : Fragment(R.layout.fragment_shopping) {

    lateinit var viewModel: ShoppingViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
      viewModel = ViewModelProvider(this).get(ShoppingViewModel::class.java)

        fabAddShoppingItem.setOnClickListener {
            findNavController().navigate(
                ShoppingFragmentDirections.actionShoppingFragmentToAddShoppingItemFragment()
            )
        }
    }
}