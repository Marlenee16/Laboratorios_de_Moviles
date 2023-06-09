package com.example.laboratorio5

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment

class MovieFragment : Fragment() {

    private lateinit var navigationToMoviePantalla: CardView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        saveInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_movie, container, false)
    }

    override fun onViewCreated(view: View, saveInstanceState: Bundle?) {
        super.onViewCreated(view, saveInstanceState)
    }
}