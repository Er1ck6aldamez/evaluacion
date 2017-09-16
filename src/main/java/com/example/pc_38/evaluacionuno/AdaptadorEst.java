package com.example.pc_38.evaluacionuno;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by PC-38 on 16/9/2017.
 */

public class AdaptadorEst extends ArrayAdapter <Estudiantes>{

    public AdaptadorEst(@NonNull Context context, @LayoutRes int resource, @NonNull List<Estudiantes> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Estudiantes e = getItem(position);
        if(convertView==null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_lista,parent,false);
        }

        TextView nombre = (TextView) convertView.findViewById(R.id.nombre);
        TextView mat = (TextView) convertView.findViewById(R.id.mat);
        TextView prom = (TextView) convertView.findViewById(R.id.prom);

        prom.setText(e.getNombre());
        mat.setText(e.getMateria());
        prom.setText("  "+e.getPromedio());

        return convertView;
    }
}
