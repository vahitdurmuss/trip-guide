package com.triona.triplab.screens

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.triona.triplab.R
import com.triona.triplab.data.Guider
import com.triona.triplab.data.IstanbulDummyTrip
import com.triona.triplab.ui.TripsInGrid
import com.triona.triplab.ui.TripsInLazyRow

/**
 * All Guiders
 */

@Composable
fun GuiderDetail(guider: Guider, modifier: Modifier = Modifier) {

    Column(Modifier.fillMaxWidth()) {


        Row(modifier.padding(30.dp)) {

            Image(
                painter = painterResource(id = R.mipmap.img_woman_traveler),
                contentDescription = "Guider Profile",
                modifier = modifier
                    .size(100.dp)
                    .clip(shape = CircleShape)
                    .border(width = 1.dp, color = Color.LightGray, shape = CircleShape),
                contentScale = ContentScale.Fit
            )

            Column(horizontalAlignment = Alignment.End, modifier = modifier.fillMaxWidth()) {

                Text(text = guider.name, style = MaterialTheme.typography.displaySmall)

                Text(text = guider.surname, style = MaterialTheme.typography.displaySmall)

                Text(text = "Rize, Turkiye", style = MaterialTheme.typography.labelLarge)

            }
        }

        Column(
            modifier
                .fillMaxWidth()
                .padding(16.dp)
                .verticalScroll(rememberScrollState())
        ) {

            Text(text = " Yazar Biyografisi", style = MaterialTheme.typography.headlineMedium)

            Spacer(modifier = modifier.height(16.dp))

            Text(
                text = "Merhaba! Ben [Adınız], [Çalıştığınız Bölge/Şehir] bölgesinde uzmanlaşmış bir turizm rehberiyim. [Deneyim süreniz] yılı aşkın süredir yerli ve yabancı turistlere bölgenin tarihi, kültürel ve doğal güzelliklerini tanıtarak unutulmaz deneyimler yaşatıyorum.\n" +
                        "\n" +
                        "Uzmanlık alanlarım arasında [Tarihî Mekânlar, Doğa Yürüyüşleri, Gurme Turları, Kültürel Geziler vb.] yer almaktadır. Misafirlerime sadece gezilecek yerleri göstermekle kalmayıp, bölgenin geçmişi, yerel yaşamı ve saklı kalmış güzellikleri hakkında da bilgiler sunuyorum.\n" +
                        "\n" +
                        "Bölgenin en iyi rotalarını keşfetmek, eşsiz deneyimler yaşamak ve unutulmaz bir tur yapmak için benimle iletişime geçebilirsiniz!",
                style = MaterialTheme.typography.bodyMedium
            )


//            TripsInLazyRow(trips =List(10){IstanbulDummyTrip.istanbulTrip}, onClickTrip ={})


        }


    }


}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_NO or Configuration.UI_MODE_TYPE_NORMAL)
@Composable
fun GuiderDetailPreview() {
    GuiderDetail(guider = Guider(id = 1, "Vahit", "Durmuş"))
}