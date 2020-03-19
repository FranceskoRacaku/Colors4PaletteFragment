package edu.temple.cis3515_palettecanvasfragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements PaletteFragment.onSpinnerSelect {

    //CanvasFragment cf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] c = getResources().getStringArray(R.array.colors);

        Bundle b = new Bundle();
        b.putStringArray(PaletteFragment.ARGS_COLOR, c);

        Fragment pf = PaletteFragment.newInstance(b);
        getSupportFragmentManager().beginTransaction().replace(R.id.paletteContainer, pf).commit();

        getFragmentManager().beginTransaction().replace(R.id.canvasContainer, new CanvasFragment()).commit();
        setTitle(R.string.Title);
    }

    @Override
    public void colorCanvas(String colorPosition) {
        ((CanvasFragment) getFragmentManager().findFragmentById(R.id.canvasContainer)).changeCanvasColor(colorPosition);
    }
}

