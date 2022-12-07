package org.tarik.gridlayoutproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Person> personList = Arrays.asList(
            new Person(
                    "https://xsgames.co/randomusers/assets/avatars/male/6.jpg",
                    "Raul Durance"
            ),
            new Person(
                    "https://xsgames.co/randomusers/assets/avatars/female/23.jpg",
                    "Tamra Heulitt"
            ),
            new Person(
                    "https://xsgames.co/randomusers/assets/avatars/female/58.jpg",
                    "Celsa Radel"
            ),
            new Person(
                    "https://xsgames.co/randomusers/assets/avatars/male/62.jpg",
                    "Barrett Esquivel"
            ),
            new Person(
                    "https://xsgames.co/randomusers/assets/avatars/female/9.jpg",
                    "Althea Neafsey"
            ),
            new Person(
                    "https://xsgames.co/randomusers/assets/avatars/male/34.jpg",
                    "Palmer Bilella"
            ),
            new Person(
                    "https://xsgames.co/randomusers/assets/avatars/female/54.jpg",
                    "Rima Bernaiche"
            ),
            new Person(
                    "https://xsgames.co/randomusers/assets/avatars/female/51.jpg",
                    "Sherice Hamma"
            ),
            new Person(
                    "https://xsgames.co/randomusers/assets/avatars/female/28.jpg",
                    "Maryjo Moermond"
            ),
            new Person(
                    "https://xsgames.co/randomusers/assets/avatars/female/31.jpg",
                    "Sherell Braendle"
            ),
            new Person(
                    "https://xsgames.co/randomusers/assets/avatars/male/48.jpg",
                    "Otto Vandenakker"
            ),
            new Person(
                    "https://xsgames.co/randomusers/assets/avatars/male/0.jpg",
                    "Antony Kosanovich"
            )
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}