package edu.temple.cis3515_palettecanvasfragment;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class CanvasFragment extends Fragment {
    View v;
    ConstraintLayout cl;

    public CanvasFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_canvas, container, false);
        cl = v.findViewById(R.id.cl);
        return v;
    }

    public void changeCanvasColor(String colorPosition) {
        assert  colorPosition != null;

        switch (colorPosition) {
            case "0":
                cl.setBackgroundColor(Color.WHITE);
                break;
            case "1":
                cl.setBackgroundColor(Color.parseColor("#FF0000"));
                break;
            case "2":
                cl.setBackgroundColor(Color.parseColor("#FFA500"));
                break;
            case "3":
                cl.setBackgroundColor(Color.parseColor("#FFFF00"));
                break;
            case "4":
                cl.setBackgroundColor(Color.parseColor("#008000"));
                break;
            case "5":
                cl.setBackgroundColor(Color.parseColor("#0000FF"));
                break;
            case "6":
                cl.setBackgroundColor(Color.parseColor("#EE82EE"));
                break;
            case "7":
                cl.setBackgroundColor(Color.parseColor("#808080"));
                break;
            case "8":
                cl.setBackgroundColor(Color.parseColor("#00FFFF"));
                break;
            case "9":
                cl.setBackgroundColor(Color.parseColor("#FF00FF"));
                break;
            case "10":
                cl.setBackgroundColor(Color.parseColor("#000000"));
                break;
        }
    }
}
