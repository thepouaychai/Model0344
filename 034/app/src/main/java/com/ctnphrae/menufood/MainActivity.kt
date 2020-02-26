package com.ctnphrae.menufood

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    var recyclerView : RecyclerView? = null

    var foods = arrayOf(
        "Model 1",
        "Model 2",
        "Model 3",
        "Model 4",
        "Model 5",
        "Model 6",
        "Model 7",
        "Model 8",
        "Model 9",
        "Model 10",
        "Model 11",
        "Model 12"
    )
    var arrImg = arrayOf(
        R.drawable.image1,
        R.drawable.image2,
        R.drawable.image3,
        R.drawable.image4,
        R.drawable.image5,
        R.drawable.image6,
        R.drawable.image7,
        R.drawable.image8,
        R.drawable.image9,
        R.drawable.image10,
        R.drawable.image11,
        R.drawable.image12
    )
    var foodMenuImage= arrayOf(
        "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTXdswVEJd-uuoVHT6uCjEupCoYSRKoakdkpMfPscY0uODijfQP",
        "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSZ-WzAzl16BGQjYCxuqQI7vVVs5o7W1ivBQ5A7VrJWaYpvGcxx",
        "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQd38oOvxdvTGtTT8d_P1cLEmGGiaJSk_Ay0qzyTvN9R5vpRhs0",
        "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSCSzOMTLOS8M8cWDj1hwQxFfXHeABaM_09UspksqiZdRTtOlHg",
        "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQoQxRA-CgpRahTVm4g99e-HadmOpYy4UTMb7MWdeDYNVRtyQPC",
        "https://img.kaidee.com/prd/20191024/351194033/m/2db6a011-ee03-4768-8a10-a160c432961c.jpg",
        "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQoazkXy1CWw48Z7UlM4ggaScMnP17CpsT5fbVmnxaSl8njhysp",
        "https://cf.shopee.co.th/file/29754673b4536df6b1cb397463855158",
        "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSbiH5xejChhiCSDZJKJLMTuqNdyGGu3s1p98jM62K_7u3UlL1a",
        "https://img.kaidee.com/prd/20191023/351180764/m/1608cd92-2b61-493e-bbff-9a26faef9bc7.jpg",
        "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQl6gQb_tIud4MV1DFkwudIyPFxdTeHPTX6SLsi5rtVvngfRVCL",
        "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQ1_zhLKTZcbw99u61mScslsElXPTndV8v08OhYbqdXGeXDHy4c"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycleView) as RecyclerView

        recyclerView!!.layoutManager = LinearLayoutManager(this)
        recyclerView!!.setLayoutManager(GridLayoutManager(this, 2))
        val myAdapter = AdapterRecycleView(foods,foodMenuImage,this)
        recyclerView!!.setAdapter(myAdapter)

    }
}
