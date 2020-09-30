package costy.tursib;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import costy.tursib.MainActivity;

/**
 * Created by Costy on 4/3/2017.
 */

public class Intors extends Activity
{
    ListView Intors;

    String[] position1_titles;
    String[] position2_titles;
    String[] position3_titles;
    String[] position4_titles;
    String[] position5_titles;
    String[] position6_titles;
    String[] position7_titles;
    String[] position8_titles;
    String[] position9_titles;
    String[] position10_titles;
    String[] position11_titles;
    String[] position12_titles;
    String[] position13_titles;
    String[] position14_titles;
    String[] position15_titles;
    String[] position16_titles;
    String[] position17_titles;
    String[] position18_titles;
    String[] position19_titles;
    String[] position20_titles;
    String[] position21_titles;
    String[] position22_titles;

    private static int Select2 = 0;
    private static int PositionSelect2 = 0;
    private static String returnIntors;

    MainActivity main2 = new MainActivity();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.intors_main);

        Intors = (ListView) findViewById(R.id.statii_intors);

        switch (main2.getPriPosition())
        {
            case 0:
            {
                Select2 = 1;
                position1_titles = getResources().getStringArray(R.array.intors_position1);
                Intors.TitleAdapter2 mAdapter = new Intors.TitleAdapter2(this, position1_titles);
                Intors.setAdapter(mAdapter);
                break;
            }
            case 1:
            {
                Select2 = 2;
                position2_titles = getResources().getStringArray(R.array.intors_position2);
                Intors.TitleAdapter2 mAdapter = new Intors.TitleAdapter2(this, position2_titles);
                Intors.setAdapter(mAdapter);
                break;
            }
            case 2:
            {
                Select2 = 3;
                position3_titles = getResources().getStringArray(R.array.intors_position3);
                Intors.TitleAdapter2 mAdapter = new Intors.TitleAdapter2(this, position3_titles);
                Intors.setAdapter(mAdapter);
                break;
            }
            case 3:
            {
                Select2 = 4;
                position4_titles = getResources().getStringArray(R.array.intors_position4);
                Intors.TitleAdapter2 mAdapter = new Intors.TitleAdapter2(this, position4_titles);
                Intors.setAdapter(mAdapter);
                break;
            }
            case 4:
            {
                Select2 = 5;
                position5_titles = getResources().getStringArray(R.array.intors_position5);
                Intors.TitleAdapter2 mAdapter = new Intors.TitleAdapter2(this, position5_titles);
                Intors.setAdapter(mAdapter);
                break;
            }
            case 5:
            {
                Select2 = 6;
                position6_titles = getResources().getStringArray(R.array.intors_position6);
                Intors.TitleAdapter2 mAdapter = new Intors.TitleAdapter2(this, position6_titles);
                Intors.setAdapter(mAdapter);
                break;
            }
            case 6:
            {
                Select2 = 7;
                position7_titles = getResources().getStringArray(R.array.intors_position7);
                Intors.TitleAdapter2 mAdapter = new Intors.TitleAdapter2(this, position7_titles);
                Intors.setAdapter(mAdapter);
                break;
            }
            case 7:
            {
                Select2 = 8;
                position8_titles = getResources().getStringArray(R.array.intors_position8);
                Intors.TitleAdapter2 mAdapter = new Intors.TitleAdapter2(this, position8_titles);
                Intors.setAdapter(mAdapter);
                break;
            }
            case 8:
            {
                Select2 = 9;
                position9_titles = getResources().getStringArray(R.array.intors_position9);
                Intors.TitleAdapter2 mAdapter = new Intors.TitleAdapter2(this, position9_titles);
                Intors.setAdapter(mAdapter);
                break;
            }
            case 9:
            {
                Select2 = 10;
                position10_titles = getResources().getStringArray(R.array.intors_position10);
                Intors.TitleAdapter2 mAdapter = new Intors.TitleAdapter2(this, position10_titles);
                Intors.setAdapter(mAdapter);
                break;
            }
            case 10:
            {
                Select2 = 11;
                position11_titles = getResources().getStringArray(R.array.intors_position11);
                Intors.TitleAdapter2 mAdapter = new Intors.TitleAdapter2(this, position11_titles);
                Intors.setAdapter(mAdapter);
                break;
            }
            case 11:
            {
                Select2 = 12;
                position12_titles = getResources().getStringArray(R.array.intors_position12);
                Intors.TitleAdapter2 mAdapter = new Intors.TitleAdapter2(this, position12_titles);
                Intors.setAdapter(mAdapter);
                break;
            }
            case 12:
            {
                Select2 = 13;
                position13_titles = getResources().getStringArray(R.array.intors_position13);
                Intors.TitleAdapter2 mAdapter = new Intors.TitleAdapter2(this, position13_titles);
                Intors.setAdapter(mAdapter);
                break;
            }
            case 13:
            {
                Select2 = 14;
                position14_titles = getResources().getStringArray(R.array.intors_position14);
                Intors.TitleAdapter2 mAdapter = new Intors.TitleAdapter2(this, position14_titles);
                Intors.setAdapter(mAdapter);
                break;
            }
            case 14:
            {
                Select2 = 15;
                position15_titles = getResources().getStringArray(R.array.intors_position15);
                Intors.TitleAdapter2 mAdapter = new Intors.TitleAdapter2(this, position15_titles);
                Intors.setAdapter(mAdapter);
                break;
            }
            case 15:
            {
                Select2 = 16;
                position16_titles = getResources().getStringArray(R.array.intors_position16);
                Intors.TitleAdapter2 mAdapter = new Intors.TitleAdapter2(this, position16_titles);
                Intors.setAdapter(mAdapter);
                break;
            }
            case 16:
            {
                Select2 = 17;
                position17_titles = getResources().getStringArray(R.array.intors_position17);
                Intors.TitleAdapter2 mAdapter = new Intors.TitleAdapter2(this, position17_titles);
                Intors.setAdapter(mAdapter);
                break;
            }
            case 17:
            {
                Select2 = 18;
                position18_titles = getResources().getStringArray(R.array.intors_position18);
                Intors.TitleAdapter2 mAdapter = new Intors.TitleAdapter2(this, position18_titles);
                Intors.setAdapter(mAdapter);
                break;
            }
            case 18:
            {
                Select2 = 19;
                position19_titles = getResources().getStringArray(R.array.intors_position19);
                Intors.TitleAdapter2 mAdapter = new Intors.TitleAdapter2(this, position19_titles);
                Intors.setAdapter(mAdapter);
                break;
            }
            case 19:
            {
                Select2 = 20;
                position20_titles = getResources().getStringArray(R.array.intors_position20);
                Intors.TitleAdapter2 mAdapter = new Intors.TitleAdapter2(this, position20_titles);
                Intors.setAdapter(mAdapter);
                break;
            }
            case 20:
            {
                Select2 = 21;
                position21_titles = getResources().getStringArray(R.array.intors_position21);
                Intors.TitleAdapter2 mAdapter = new Intors.TitleAdapter2(this, position21_titles);
                Intors.setAdapter(mAdapter);
                break;
            }
            case 21:
            {
                Select2 = 22;
                position22_titles = getResources().getStringArray(R.array.intors_position22);
                Intors.TitleAdapter2 mAdapter = new Intors.TitleAdapter2(this, position22_titles);
                Intors.setAdapter(mAdapter);
                break;
            }
        }

        Intors.setClickable(true);

        Intors.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            public void onItemClick(AdapterView<?> parent, View view, final int position, long id)
            {
                PositionSelect2 = position;
                returnIntors = Intors.getItemAtPosition(position).toString();

                Intent myIntent = new Intent(getApplicationContext(), Ore2.class);
                startActivity(myIntent);
            }
        });

    }

    @Override
    public void onBackPressed()
    {
        finish();
    }

    class TitleAdapter2 extends ArrayAdapter<String>
    {
        Context this_cont;
        String this_titles[];

        TitleAdapter2(Context c, String[] title)
        {
            super(c, R.layout.listview_item2, R.id.title2, title);
            this.this_cont = c;
            this.this_titles = title;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent)
        {
            LayoutInflater inflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = inflater.inflate(R.layout.listview_item2, parent, false);
            ImageView MyImage = (ImageView) row.findViewById(R.id.icon2);
            TextView myTitle = (TextView) row.findViewById(R.id.title2);
            myTitle.setText(this_titles[position]);

            return row;
        }
    }

    public static int getSelect2()
    {
        return Select2;
    }

    public static int getPositionSelect2()
    {
        return PositionSelect2;
    }

    public static void setSelect2(int ammount) { Select2 = ammount; }

    public static void setPositionSelect2(int ammount) { PositionSelect2 = ammount; }

    public static String getReturnIntors() { return returnIntors; }
}
