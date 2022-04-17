package com.example.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        MyMovieData[] myMovieData = new MyMovieData[]{
                new MyMovieData("Группа П50-6-19, П50-11/6-20", "Неделя: Числитель/Знаменатель\n"),
                new MyMovieData("Понедельник","Пара               Предмет                  Преподаватель\n" +
                        "1.\t\t                      РПМ                         А.Ю. Бушин\n" +
                        "  \t\t                     ТРЗБД                       А.С. Токарчук\n" +
                        "2.\t\t                     Физ-ра                       Д.М. Салоникес\n" +
                        "3.\t\t                     ИСР ПО                      Ю.В. Севастьянов\n" +
                        "4.\t\t                      РПМ                         А.А. Шимбирёв\n"),
                new MyMovieData("Вторник","Пара               Предмет                  Преподаватель\n" +
                        "1.\t\t                 ПРАКТИКА\t\n" +
                        "2.\t\t                 ПРАКТИКА\t\n" +
                        "3.\t\t                 ПРАКТИКА\t\n" +
                        "4.\t\t                 ПРАКТИКА\t\n" +
                        "5.\t\t                 ПРАКТИКА\t\n" +
                        "6.\t\t                 ПРАКТИКА\t\n"),
                new MyMovieData("Среда","Пара               Предмет                  Преподаватель\n" +
                        "1.\t\t                 ПРАКТИКА\t\n" +
                        "2.\t\t                 ПРАКТИКА\t\n" +
                        "3.\t\t                 ПРАКТИКА\t\n" +
                        "4.\t\t                 ПРАКТИКА\t\n" +
                        "5.\t\t                 ПРАКТИКА\t\n" +
                        "6.\t\t                 ПРАКТИКА\t\n"),
                new MyMovieData("Четверг","Пара               Предмет                  Преподаватель\n" +
                        "1.\t\t                     ТРПО                         Л.А. Соколова\n" +
                        "2.\t\t                     РПМ                          А.Ю. Бушин\n" +
                        "3.\t\t                     СП                            А.Д. Нилов\n" +
                        "4.\t\t                     РМП                          А.О. Лясников\n"),
                new MyMovieData("Пятница","Пара               Предмет                  Преподаватель\n" +
                        "2.\t\t                 Английский язык        А.Д. Завьялова,\n                                                               А.Ю. Дымская\n" +
                        "3.\t\t                     РЗБД                         А.С. Токарчук\n" +
                        "4.\t\t                     ИСР ПО                     Ю.В. Севастьянов\n" +
                        "  \t\t                      РМП                        А.О. Лясников\n" +
                        "5.\t\t                      ТРПО                       Л.А. Соколова\n" +
                        "  \t\t                      СП                           А.Д. Нилов\n"),
        };

        MyMovieAdapter myMovieAdapter = new MyMovieAdapter(myMovieData,MainActivity.this);
        recyclerView.setAdapter(myMovieAdapter);

    }
}
