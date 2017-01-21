# LinearLayout을 활용한 간단한 ViewPager


    ...
    public Object instantiateItem(ViewGroup container, int position) {

        LayoutInflater inflater = LayoutInflater.from(context);
        LinearLayout layout = (LinearLayout) inflater.inflate(R.layout.pager_item, container, false);
        //pager_item.xml의 LinerLayout을 ViewPager로 사용
        
        TextView textView = (TextView)layout.findViewById(R.id.text);
        textView.setText(text.get(position));
        container.addView(layout, 0);
        return layout;
    }
    ...
