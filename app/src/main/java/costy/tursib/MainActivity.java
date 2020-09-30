package costy.tursib;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    ListView list;
    String[] Titles;
    String[] Description;

    private static int GetPosition = 0;

    private static String getPositionName;

    Intent thisIntent;

    /*
    int[] Images =
    {
            R.drawable.unu,
            R.drawable.doi,
            R.drawable.cinci,
            R.drawable.zece,
            R.drawable.unsprezece,
            R.drawable.doisprezece,
            R.drawable.treisprezece,
            R.drawable.patrusprezece,
            R.drawable.cincisprezece,
            R.drawable.sasesprezece,
            R.drawable.saptesprezece,
            R.drawable.optsprezece,
            R.drawable.nouasprezece,
            R.drawable.douazecisidoi,
            R.drawable.osutaunsprezece,
            R.drawable.osutadoisprezece,
            R.drawable.osutatreisprezece,
            R.drawable.osutapatrusprezece,
            R.drawable.osutacincisprezece,
            R.drawable.osutasasesprezece,
            R.drawable.osutasaptesprezece,
            R.drawable.osutapotsprezece

    };
    */

    Context cont;

    public Switch mySwitch;

    private static int Dialog_Logic = 0;

    private static int SwitchPosition = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main_old);

        /*------------------------------------*/



        /*------------------------------------*/

        mySwitch = (Switch) findViewById(R.id.color_switch);

        Titles = getResources().getStringArray(R.array.Titles);
        Description = getResources().getStringArray(R.array.Description);

        list = (ListView) findViewById(R.id.list1);

        cont = getApplicationContext();

        MyAdapter adapter = new MyAdapter(this, Titles, Description);//, Images);
        list.setAdapter(adapter);

        list.setClickable(true);

        mySwitch.setChecked(false);

        mySwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if (isChecked)
                {
                    SwitchPosition = 2;
                }
                else
                {
                    SwitchPosition = 1;
                }
            }
        });

        list.setOnItemClickListener(new OnItemClickListener()
        {
            public void onItemClick(AdapterView<?> parent, View view, final int position, long id)
            {
                 GetPosition = position;
                 getPositionName = list.getItemAtPosition(position).toString();

                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this, AlertDialog.THEME_DEVICE_DEFAULT_DARK);
                builder.setMessage("Selectati ruta autobusului dorita :").setCancelable(
                        true).setNegativeButton("Dus",
                        new DialogInterface.OnClickListener()
                        {
                            public void onClick(DialogInterface dialog, int id)
                            {
                                thisIntent = new Intent(getApplicationContext(), Dus.class);
                                startActivity(thisIntent);
                                Dialog_Logic = 1;
                                dialog.cancel();

                            }
                        }).setPositiveButton("Intors",
                        new DialogInterface.OnClickListener()
                        {
                            public void onClick(DialogInterface dialog, int id)
                            {
                                thisIntent = new Intent(getApplicationContext(), Intors.class);
                                startActivity(thisIntent);
                                Dialog_Logic = 2;
                                dialog.cancel();
                            }
                        })
                .setTitle("Tursib").setIcon(R.drawable.bus2);
                AlertDialog alert = builder.create();
                alert.show();

            }
        });
    }

    class MyAdapter extends ArrayAdapter<String>
    {
        Context cont;
        int[] img;
        String ThisTitles[];
        String ThisDescription[];

        MyAdapter(Context c, String[] titles, String[] desc)//, int[] img)
        {
            super(c, R.layout.listview_item_old, R.id.title, titles);
            this.cont = c;
            //this.img = img;
            this.ThisDescription = desc;
            this.ThisTitles = titles;

        }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        LayoutInflater inflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View row = inflater.inflate(R.layout.listview_item_old, parent, false);
        //ImageView MyImage = (ImageView) row.findViewById(R.id.icon1);
        TextView myTitle = (TextView) row.findViewById(R.id.title);
        TextView myDesc = (TextView) row.findViewById(R.id.subtitle1);
        TextView myFirstDesc = (TextView) row.findViewById(R.id.description);
        //MyImage.setImageResource(img[position]);
        myTitle.setText(ThisTitles[position]);
        myDesc.setText(ThisDescription[position]);


        switch (position)
        {
            case 0:
            {
                myFirstDesc.setText("Trasee Principale");
                break;
            }
            case 3:
            {
                myFirstDesc.setText("Trasee Secundare");
                break;
            }
            case 13:
            {
                myFirstDesc.setText("Trasee Turistice");
                break;
            }
            case 14:
            {
                myFirstDesc.setText("Trasee Profesionale");
                break;
            }
        }


        return row;
    }
    }

    public static int getPriPosition()
    {
        return GetPosition;
    }

    public static int getSwitchPosition()
    {
        return SwitchPosition;
    }

    public static int getDialogLogic() { return Dialog_Logic; }

    public static String getPriPositionName() { return getPositionName; }

}
