package edu.temple.cis3515_palettecanvasfragment;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Spinner;

public class PaletteFragment extends Fragment {
    public static final String ARGS_COLOR = "bundle_key";
    private onSpinnerSelect listener;

    public static PaletteFragment newInstance(Bundle b) {
        PaletteFragment fragment = new PaletteFragment();
        fragment.setArguments(b);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_palette, container, false);
        final Spinner colorSpinner = v.findViewById(R.id.colorSpinner);

        colorSpinner.setAdapter(new ColorAdapter(getActivity(),getArguments().getStringArray(ARGS_COLOR)));

        colorSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String cp = "" + colorSpinner.getSelectedItemPosition();

                if (!cp.equals("0")) {
                    listener.colorCanvas(cp);
                }
                view.setBackgroundColor(Color.WHITE);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        return v;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            listener = (onSpinnerSelect) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        listener = null;
    }

    public interface onSpinnerSelect {
        void colorCanvas(String colorPosition);
    }
}
