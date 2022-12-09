package com.egorpoprotskiy.recyclerviewhw.Data

import com.egorpoprotskiy.recyclerviewhw.R
import com.egorpoprotskiy.recyclerviewhw.model.Hmm

class Datasource {
    fun loadDataSource(): List<Hmm> {
        return listOf<Hmm>(
            Hmm(R.string.hmm1, R.string.hmm1date, R.drawable.heroes1),
            Hmm(R.string.hmm2, R.string.hmm2date, R.drawable.heroes2),
            Hmm(R.string.hmm3, R.string.hmm3date, R.drawable.heroes3),
            Hmm(R.string.hmm4, R.string.hmm4date, R.drawable.heroes4),
            Hmm(R.string.hmm5, R.string.hmm5date, R.drawable.heroes5),
            Hmm(R.string.hmm6, R.string.hmm6date, R.drawable.heroes6),
            Hmm(R.string.hmm7, R.string.hmm7date, R.drawable.heroes7)
        )
    }
}