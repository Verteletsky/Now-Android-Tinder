package ru.now_android.nowandroidtinder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.athbk.avatarview.TinderRecyclerView;

import java.util.ArrayList;
import java.util.List;

import ru.now_android.nowandroidtinder.adapter.CustomAdapter;
import ru.now_android.nowandroidtinder.model.Item;

public class MainActivity extends AppCompatActivity {

    List<Item> items = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TinderRecyclerView tinderRecyclerView = findViewById(R.id.rv);

        initData();

        CustomAdapter customAdapter = new CustomAdapter(items, this);
        tinderRecyclerView.initRecyclerView(this, customAdapter);

    }

    private void initData() {
        Item item = new Item(0, "http://anekdotu.info/wp-content/uploads/2017/05/prikol-s-sobakoy.jpg?x15694");
        items.add(item);
        item = new Item(1, "http://humor.fm/uploads/posts/2016-03/09/y6rty_usski.jpg");
        items.add(item);
        item = new Item(2, "http://cdn.fishki.net/upload/post/2017/06/29/2324753/smeshnye-kartinki-s-nadpisjami-0.jpg");
        items.add(item);
        item = new Item(3, "http://bipbap.ru/wp-content/uploads/2015/12/9VKyLRcIwQQ-1.jpg");
        items.add(item);
        item = new Item(4, "https://i.pinimg.com/originals/ae/de/55/aede558cff950e2fe40d285c297f732e.jpg");
        items.add(item);
        item = new Item(5, "http://razvlecuxa.ru/wp-content/uploads/2015/08/smeshnye_kartinki_02.jpg");
        items.add(item);
        item = new Item(6, "http://cdn.fishki.net/upload/post/201407/09/1283891/14.jpg");
        items.add(item);
        item = new Item(7, "http://coolinet.ru/wp-content/uploads/2016/02/obezyan-Kopirovat.jpg");
        items.add(item);
        item = new Item(8, "http://kaifolog.ru/uploads/posts/2014-03/thumbs/1395283917_036.jpg");
        items.add(item);
        item = new Item(9, "http://cdn.fishki.net/upload/post/2016/10/24/2114760/smeshnye-kartinki-s-nadpisjami-0.jpg");
        items.add(item);
        item = new Item(10, "http://cdn.trinixy.ru/pics5/20140625/kartinki_i_nadpisi_23.jpg");
        items.add(item);
    }
}
