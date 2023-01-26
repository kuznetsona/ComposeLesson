package com.example.composelesson

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.gestures.detectDragGesturesAfterLongPress
import androidx.compose.foundation.gestures.detectHorizontalDragGestures
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyColumn(
                modifier = Modifier.fillMaxWidth()
                    .background(Color.LightGray)
            ) {
                itemsIndexed(
                    listOf(
                        ItemRowModel(R.drawable.popov, "Popov",
                            "Арсений предпочитает не делиться подробностями своей личной " +
                                    "жизни, а в социальных сетях выкладывает в основном свои селфи " +
                                    "и фото рабочих моментов. Однако по некоторым снимкам из " +
                                    "инстаграма комика поклонники сделали вывод, что он женат и " +
                                    "воспитывает дочь. Позже самые дотошные из них выяснили, " +
                                    "что жену Арсения Попова зовут Алена, а дочь они нарекли " +
                                    "редким именем Кьяра."
                                    ),
                        ItemRowModel(R.drawable.pozov, "Pozov",
                            "Дмитрий Позов женат на Екатерине Добрачевой (также одна из " +
                                    "участниц КВН). Девушка играет на бас-гитаре, позиционирует себя " +
                                    "как стилиста. Встречаться будущие супруги начали еще в 2010 году, " +
                                    "а 31 августа 2012 года сыграли свадьбу. В 2015 у Дмитрия и " +
                                    "Екатерины родилась дочь Савина. В 2019 году на свет появился сын, " +
                                    "которого назвали Теодором."),
                        ItemRowModel(R.drawable.matvienko, "Matvienko",
                                "С 2011 года Сергей встречался с Марией Бендыч (1988 г.р.), " +
                                    "дизайнером и проектировщиком из Санкт-Петербурга. «Спасибо, " +
                                    "что ты еще рядом», – часто подписывал Матвиенко совместные " +
                                    "фотографии в сети Instagram. Однако в августе 2017 года в " +
                                    "официальной фан-группе артиста появилось сообщение, что девушки " +
                                    "у Сергея в данный момент нет, с Марией он расстался по причинам, " +
                                    "которые предпочел не афишировать."),
                        ItemRowModel(R.drawable.shastoon, "Shastoon",
                                "Сейчас сердце Антона занято. Его возлюбленную зовут " +
                                    "Ирина Кузнецова, она тоже уроженка Воронежа. Антон любит " +
                                    "путешествовать, предпочитая жаркие страны, " +
                                    "где можно загорать на пляже и ходить на экскурсии."),
                        ItemRowModel(R.drawable.stas, "Stas",
                                "Каждый импровизирует ежедневно, потому что у жизни нет " +
                                    "прописанного сценария. Примитивнейший пример: каждый из нас " +
                                    "хоть раз не выучил урок, и, выходя к доске, конечно, приходилось " +
                                    "импровизировать, что-то придумывать на ходу, выкручиваться. " +
                                    "У кого-то это получалось лучше, у кого-то хуже. Кто-то выходил " +
                                    "и честно отвечал, что не готов, и получал двойку. Я же всегда " +
                                    "что-то рассказывал, придумывал на ходу, брал харизмой, и это работало"),
                        ItemRowModel(R.drawable.oksy, "Oksy",
                                "Приветствуем вас в сообществе о замечательной Оксане Сурковой! " +
                                    "Эта девушка известна для многих фанатов шоу «Импровизация» как " +
                                    "администратор концертов, которые многие уже посещали, а " +
                                    "некоторые и не раз. На данный момент Оксана, помимо шоу " +
                                    "«Импровизация», организовывает новое импровизационное шоу " +
                                    "«Мысли вслух». Оксана уже обрела своих поклонников, и мы " +
                                        "надеемся, что со временем их станет только больше.")
                    )
                ){ _, item ->
                    ItemRow(item = item)
                }
            }
        }
    }
}

