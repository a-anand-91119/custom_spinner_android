package in.notyouraveragedev.customspinner;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Spinner simpleSpinner;
    private Spinner customSpinner;
    private ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simpleSpinner = findViewById(R.id.sp_simple_spinner);
        customSpinner = findViewById(R.id.sp_custom_spinner);
        constraintLayout = findViewById(R.id.constraint_layout_main);


        final List<String> simpleList = new ArrayList<>();
        simpleList.add("Nougat");
        simpleList.add("Marshmallow");
        simpleList.add("Lollipop");
        simpleList.add("Kitkat");
        simpleList.add("JellyBean");
        simpleList.add("Ice Cream Sandwich");
        simpleList.add("Honeycomb");
        simpleList.add("Gingerbread");
        simpleList.add("Froyo");
        simpleList.add("Eclair");
        simpleList.add("Donut");

        ArrayAdapter<String> simpleSpinnerAdapter = new ArrayAdapter<>(this,
                R.layout.support_simple_spinner_dropdown_item, simpleList);

        simpleSpinner.setAdapter(simpleSpinnerAdapter);

        simpleSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Snackbar.make(constraintLayout, simpleList.get(position), Snackbar.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        final List<CustomSpinnerData> customSpinnerDatas =
                CountryFlagDataManager.getAllCountriesFlags(this);

        ArrayAdapter<CustomSpinnerData> customSpinnerDataArrayAdapter =
                new CustomSpinnerAdapter(this, R.layout.custom_spinner_layout, customSpinnerDatas);

        customSpinner.setAdapter(customSpinnerDataArrayAdapter);

        customSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Snackbar.make(constraintLayout, customSpinnerDatas.get(position).getTextForSpinner(), Snackbar.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
