package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

class Datasource {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1, R.drawable.processador),
            Affirmation(R.string.affirmation2, R.drawable.rtx3090),
            Affirmation(R.string.affirmation3, R.drawable.memoriaram),
            Affirmation(R.string.affirmation4, R.drawable.monitorgamer),
            Affirmation(R.string.affirmation5, R.drawable.tecladogamer),
            Affirmation(R.string.affirmation6, R.drawable.mousegamer),
            Affirmation(R.string.affirmation7, R.drawable.alexa),
            Affirmation(R.string.affirmation8, R.drawable.kimetsu),
            Affirmation(R.string.affirmation9, R.drawable.tokyo),
            Affirmation(R.string.affirmation10, R.drawable.naruto)
        )
    }
}