package puzzleleaf.tistory.com.viewpager;


import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by cmtyx on 2017-01-21.
 */
//테스트2
//테스트3
    //개발자1
public class Item extends PagerAdapter {
    Context context;
    ArrayList<String> text;

    Item(Context context, ArrayList<String> text) {
        this.context = context;
        this.text = text;
    }

    @Override
    public int getCount() {
        return text.size();
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        LayoutInflater inflater = LayoutInflater.from(context);
        LinearLayout layout = (LinearLayout) inflater.inflate(R.layout.pager_item, container, false);
        TextView textView = (TextView)layout.findViewById(R.id.text);
        textView.setText(text.get(position));
        container.addView(layout, 0);
        return layout;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == (View)object;
    }
}
