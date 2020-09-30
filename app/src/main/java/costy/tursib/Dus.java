package costy.tursib;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.TimedText;
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


import org.w3c.dom.Text;

import costy.tursib.MainActivity;

/**
 * Created by Costy on 4/3/2017.
 */

public class Dus extends Activity
{
    ListView Dus;

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

    private static int Select = 0;
    private static int PositionSelect = 0;
    private static String returnDus;

    MainActivity main = new MainActivity();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.dus_main);

        Dus = (ListView) findViewById(R.id.statii_dus);

        switch(main.getPriPosition())
        {
            case 0:
            {
                Select = 1;
                position1_titles = getResources().getStringArray(R.array.dus_position1);
                //TitleAdapter mAdapter = new TitleAdapter(this, position1_titles, image_position1); // 20 statii
                TitleAdapter mAdapter = new TitleAdapter(this, position1_titles);
                Dus.setAdapter(mAdapter);
                break;
            }
            case 1:
            {
                Select = 2;
                position2_titles = getResources().getStringArray(R.array.dus_position2);
                //TitleAdapter mAdapter = new TitleAdapter(this, position2_titles, image_position1); // 20 statii
                TitleAdapter mAdapter = new TitleAdapter(this, position2_titles);
                Dus.setAdapter(mAdapter);
                break;
            }
            case 2:
            {
                Select = 3;
                position3_titles = getResources().getStringArray(R.array.dus_position3);
                //TitleAdapter mAdapter = new TitleAdapter(this, position3_titles, image_position3);
                TitleAdapter mAdapter = new TitleAdapter(this, position3_titles);
                Dus.setAdapter(mAdapter);
                break;
            }
            case 3:
            {
                Select = 4;
                position4_titles = getResources().getStringArray(R.array.dus_position4);
                //TitleAdapter mAdapter = new TitleAdapter(this, position4_titles, image_position4);
                TitleAdapter mAdapter = new TitleAdapter(this, position4_titles);
                Dus.setAdapter(mAdapter);
                break;
            }
            case 4:
            {
                Select = 5;
                position5_titles = getResources().getStringArray(R.array.dus_position5);
               // TitleAdapter mAdapter = new TitleAdapter(this, position5_titles, image_position1); // 2- statii
                TitleAdapter mAdapter = new TitleAdapter(this, position5_titles);
                Dus.setAdapter(mAdapter);
                break;
            }
            case 5:
            {
                Select = 6;
                position6_titles = getResources().getStringArray(R.array.dus_position6);
                //TitleAdapter mAdapter = new TitleAdapter(this, position6_titles, image_position6); // 11 - statii
                TitleAdapter mAdapter = new TitleAdapter(this, position6_titles);
                Dus.setAdapter(mAdapter);
                break;
            }
            case 6:
            {
                Select = 7;
                position7_titles = getResources().getStringArray(R.array.dus_position7);
                //TitleAdapter mAdapter = new TitleAdapter(this, position7_titles, image_position7); // 12 - statii
                TitleAdapter mAdapter = new TitleAdapter(this, position7_titles);
                Dus.setAdapter(mAdapter);
                break;
            }
            case 7:
            {
                Select = 8;
                position8_titles = getResources().getStringArray(R.array.dus_position8);
               // TitleAdapter mAdapter = new TitleAdapter(this, position8_titles, image_position8); // 15
                TitleAdapter mAdapter = new TitleAdapter(this, position8_titles);
                Dus.setAdapter(mAdapter);
                break;
            }
            case 8:
            {
                Select = 9;
                position9_titles = getResources().getStringArray(R.array.dus_position9);
                //TitleAdapter mAdapter = new TitleAdapter(this, position9_titles, image_position9); // 22
                TitleAdapter mAdapter = new TitleAdapter(this, position9_titles);
                Dus.setAdapter(mAdapter);
                break;
            }
            case 9:
            {
                Select = 10;
                position10_titles = getResources().getStringArray(R.array.dus_position10);
               // TitleAdapter mAdapter = new TitleAdapter(this, position10_titles, image_position1); // 20
                TitleAdapter mAdapter = new TitleAdapter(this, position10_titles);
                Dus.setAdapter(mAdapter);
                break;
            }
            case 10:
            {
                Select = 11;
                position11_titles = getResources().getStringArray(R.array.dus_position11);
               // TitleAdapter mAdapter = new TitleAdapter(this, position11_titles, image_position11); // 9
                TitleAdapter mAdapter = new TitleAdapter(this, position11_titles);
                Dus.setAdapter(mAdapter);
                break;
            }
            case 11:
            {
                Select = 12;
                position12_titles = getResources().getStringArray(R.array.dus_position12);
                //TitleAdapter mAdapter = new TitleAdapter(this, position12_titles, image_position12); // 17
                TitleAdapter mAdapter = new TitleAdapter(this, position12_titles);
                Dus.setAdapter(mAdapter);
                break;
            }
            case 12:
            {
                Select = 13;
                position13_titles = getResources().getStringArray(R.array.dus_position13); // 10
               // TitleAdapter mAdapter = new TitleAdapter(this, position13_titles, image_position13);
                TitleAdapter mAdapter = new TitleAdapter(this, position13_titles);
                Dus.setAdapter(mAdapter);
                break;
            }
            case 13:
            {
                Select = 14;
                position14_titles = getResources().getStringArray(R.array.dus_position14);
                //TitleAdapter mAdapter = new TitleAdapter(this, position14_titles, image_position14); // 1
                TitleAdapter mAdapter = new TitleAdapter(this, position14_titles);
                Dus.setAdapter(mAdapter);
                break;
            }
            case 14:
            {
                Select = 15;
                position15_titles = getResources().getStringArray(R.array.dus_position15);
                //TitleAdapter mAdapter = new TitleAdapter(this, position15_titles, image_position15); //24
                TitleAdapter mAdapter = new TitleAdapter(this, position15_titles);
                Dus.setAdapter(mAdapter);
                break;
            }
            case 15:
            {
                Select = 16;
                position16_titles = getResources().getStringArray(R.array.dus_position16);
                //TitleAdapter mAdapter = new TitleAdapter(this, position16_titles, image_position16); //19
                TitleAdapter mAdapter = new TitleAdapter(this, position16_titles);
                Dus.setAdapter(mAdapter);
                break;
            }
            case 16:
            {
                Select = 17;
                position17_titles = getResources().getStringArray(R.array.dus_position17);
                //TitleAdapter mAdapter = new TitleAdapter(this, position17_titles, image_position16); // 19
                TitleAdapter mAdapter = new TitleAdapter(this, position17_titles);
                Dus.setAdapter(mAdapter);
                break;
            }
            case 17:
            {
                Select = 18;
                position18_titles = getResources().getStringArray(R.array.dus_position18);
                //TitleAdapter mAdapter = new TitleAdapter(this, position18_titles, image_position9); // 22
                TitleAdapter mAdapter = new TitleAdapter(this, position18_titles);
                Dus.setAdapter(mAdapter);
                break;
            }
            case 18:
            {
                Select = 19;
                position19_titles = getResources().getStringArray(R.array.dus_position19); //33
                //TitleAdapter mAdapter = new TitleAdapter(this, position19_titles, image_position19);
                TitleAdapter mAdapter = new TitleAdapter(this, position19_titles);
                Dus.setAdapter(mAdapter);
                break;
            }
            case 19:
            {
                Select = 20;
                position20_titles = getResources().getStringArray(R.array.dus_position20);
                //TitleAdapter mAdapter = new TitleAdapter(this, position19_titles, image_position12); // 17
                TitleAdapter mAdapter = new TitleAdapter(this, position20_titles);
                Dus.setAdapter(mAdapter);
                break;
            }
            case 20:
            {
                Select = 21;
                position21_titles = getResources().getStringArray(R.array.dus_position21);
                //TitleAdapter mAdapter = new TitleAdapter(this, position21_titles, image_position16); // 19
                TitleAdapter mAdapter = new TitleAdapter(this, position21_titles);
                Dus.setAdapter(mAdapter);
                break;
            }
            case 21:
            {
                Select = 22;
                position22_titles = getResources().getStringArray(R.array.dus_position22);
                //TitleAdapter mAdapter = new TitleAdapter(this, position22_titles, image_position22); // 19
                TitleAdapter mAdapter = new TitleAdapter(this, position22_titles);
                Dus.setAdapter(mAdapter);
                break;
            }
        }

        Dus.setClickable(true);

        Dus.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            public void onItemClick(AdapterView<?> parent, View view, final int position, long id)
            {
                PositionSelect = position;
                returnDus = Dus.getItemAtPosition(position).toString();

                Intent myIntent = new Intent(getApplicationContext(), Ore.class);
                startActivity(myIntent);
            }
        });



    }

    @Override
    public void onBackPressed()
    {
        finish();
    }

    class TitleAdapter extends ArrayAdapter<String>
    {
        Context this_cont;
        String this_titles[];

        TitleAdapter(Context c, String[] title)
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
            TextView myTitle = (TextView) row.findViewById(R.id.title2);
            myTitle.setText(this_titles[position]);

            return row;
        }
    }

    public static int getSelect()
    {
        return Select;
    }

    public static int getPositionSelect()
    {
        return PositionSelect;
    }

    public void  setSelect(int ammount) { Select = ammount; }

    public void  setPositionSelect(int ammount) { PositionSelect = ammount; }

    public static String getReturnDus() { return returnDus; }

}
