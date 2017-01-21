package puzzleleaf.tistory.com.viewpager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ViewPager pager;
    ArrayList<String> eng;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eng = new ArrayList<>();
        eng.add("Hello");
        eng.add("world");
        eng.add("good");


        pager = (ViewPager)findViewById(R.id.viewpager);
        Item mPagerAdapter = new Item(this,eng);
        pager.setAdapter(mPagerAdapter);
    }
}
