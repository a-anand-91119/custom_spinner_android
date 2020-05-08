package in.notyouraveragedev.customspinner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;
import java.util.Objects;

/**
 * Created by A Anand on 08-05-2020
 */
public class CustomSpinnerAdapter extends ArrayAdapter<CustomSpinnerData> {


    private Context context;
    private List<CustomSpinnerData> spinnerDatas;

    CustomSpinnerAdapter(@NonNull Context context, int resource, @NonNull List<CustomSpinnerData> objects) {
        super(context, resource, objects);
        this.context = context;
        this.spinnerDatas = objects;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return customView(position, convertView, parent);
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return customView(position, convertView, parent);
    }

    private View customView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View customSpinnerView = Objects.requireNonNull(layoutInflater).inflate(R.layout.custom_spinner_layout, parent, false);
        ImageView imageView = customSpinnerView.findViewById(R.id.iv_country_flag);
        TextView textView = customSpinnerView.findViewById(R.id.tv_country_code);
        imageView.setImageResource(spinnerDatas.get(position).getImageForSpinner());
        textView.setText(spinnerDatas.get(position).getTextForSpinner());
        return customSpinnerView;
    }

}
