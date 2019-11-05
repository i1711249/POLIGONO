package com.example.alumno.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.alumno.myapplication.models.xPath;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayList<xPath> mylista = new ArrayList<>();

        xPath myPath = new xPath(-72.2791412,42.927514);
        mylista.add(myPath);
        xPath myPath2 = new xPath(-72.2786692, 42.9271664);
        mylista.add(myPath2);
        xPath myPath3 = new xPath(-72.279042,42.9268678);
        mylista.add(myPath3);
        xPath myPath4 = new xPath(72.2783473,42.9268993);
        mylista.add(myPath4);
        xPath myPath5 = new xPath(-72.2786692,42.9271693);
        mylista.add(myPath5);
        xPath myPath6 = new xPath(-72.2784036,42.927457);
        mylista.add(myPath6);
        xPath myPath7 = new xPath(-72.2791225,42.9275356);
        mylista.add(myPath7);

        String url = "https://www.keene.edu/campus/maps/tool/?coordinates= ";
        String ruta = "";
        //Esto no se hace "Hay " + mylist.size()+ " elementos"
        //message
        Toast.makeText(this, String.format("Hay %s elementos %s", mylista.size(), "todo va bien"), Toast.LENGTH_LONG).show();
        int i=1;

        for (xPath current_object : mylista)
        {
            ruta += current_object.latitud + "%2C%20" + current_object.longitud;
            if (i < mylista.size())
            {
                if (i < mylista.size()){
                    ruta += "0%0A";
                }
                i++;
            }

            }
        }


        }

