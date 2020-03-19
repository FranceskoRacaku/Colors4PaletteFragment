package edu.temple.cis3515_palettecanvasfragment;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ColorAdapter extends BaseAdapter {

    private Context context;
    private String[] colors;

    ColorAdapter(Context context, String[] colors) {
        this.context = context;
        this.colors = colors;
    }

    @Override
    public int getCount() {
        return colors.length;
    }

    @Override
    public Object getItem(int position) {
        return colors[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView tv;
        if (convertView instanceof TextView)
            tv = (TextView) convertView;
        else
            tv = new TextView(context);
        String c = "" + position;
        tv.setText(colors[position]);
        switch (c) {
            case "0":
                tv.setBackgroundColor(Color.WHITE);
                break;
            case "1":
                tv.setBackgroundColor(Color.parseColor("#FF0000"));
                break;
            case "2":
                tv.setBackgroundColor(Color.parseColor("#FFA500"));
                break;
            case "3":
                tv.setBackgroundColor(Color.parseColor("#FFFF00"));
                break;
            case "4":
                tv.setBackgroundColor(Color.parseColor("#008000"));
                break;
            case "5":
                tv.setBackgroundColor(Color.parseColor("#0000FF"));
                break;
            case "6":
                tv.setBackgroundColor(Color.parseColor("#EE82EE"));
                break;
            case "7":
                tv.setBackgroundColor(Color.parseColor("#808080"));
                break;
            case "8":
                tv.setBackgroundColor(Color.parseColor("#00FFFF"));
                break;
            case "9":
                tv.setBackgroundColor(Color.parseColor("#FF00FF"));
                break;
            case "10":
                tv.setBackgroundColor(Color.parseColor("#000000"));
                break;
        }
        tv.setTextSize(22);
        tv.setPadding(5, 5, 5, 5);
        //tv.setTextColor(Color.parseColor("#808080"));
        tv.setTextColor(Color.parseColor("#FFFFFF"));
        return tv;
    }
}
