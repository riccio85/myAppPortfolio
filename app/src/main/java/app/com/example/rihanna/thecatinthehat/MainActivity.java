package app.com.example.rihanna.thecatinthehat;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    LinearLayout custom_toast;
    View layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LayoutInflater inflater = getLayoutInflater();

      TextView textView = (TextView) findViewById(R.id.text);
      final Typeface font = Typeface.createFromAsset(this.getAssets(), "fonts/skirmishergrad.ttf");


        layout = inflater.inflate(R.layout.toast_layout,
                (ViewGroup) findViewById(R.id.custom_toast_layout));
        custom_toast= (LinearLayout)findViewById(R.id.custom_toast_layout);

        Button button = (Button)findViewById(R.id.cat);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Drawable d = getResources().getDrawable(R.drawable.cat);
                customToast("Cat clicked!",d);
            }
        });
        Button button1 = (Button)findViewById(R.id.thing1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Drawable d = getResources().getDrawable(R.drawable.thingone);
                customToast("Thing1 clicked!", d);
            }
        });
        Button button2 = (Button)findViewById(R.id.thing2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Drawable d = getResources().getDrawable(R.drawable.thingtwo);
                customToast("Thing2 clicked!",d);
            }
        });
        Button button3 = (Button)findViewById(R.id.thingamajigger);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Drawable d = getResources().getDrawable(R.drawable.jigger);
                customToast("Thingamajigger clicked!",d);
            }
        });
        Button button4 = (Button)findViewById(R.id.sally);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Drawable d = getResources().getDrawable(R.drawable.sally);
                customToast("Sally clicked!",d);
            }
        });
        Button button5 = (Button)findViewById(R.id.nick);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Drawable d = getResources().getDrawable(R.drawable.nick);
                customToast("Nick clicked!",d);
            }
        });
        Button button6 = (Button)findViewById(R.id.seuss);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Drawable d = getResources().getDrawable(R.drawable.seuss);
                customToast("Dr Seuss clicked!",d);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

   public void customToast(String str, Drawable im){
       TextView text = (TextView) layout.findViewById(R.id.text);
       text.setText(str);
       ImageView image = (ImageView) layout.findViewById(R.id.image);
       image.setImageDrawable(im);
       Toast toast = new Toast(getApplication());
      // toast.setGravity(Gravity.CLIP_HORIZONTAL, 0, 0);
       toast.setDuration(Toast.LENGTH_SHORT);
       toast.setView(layout);
       toast.show();
   }



}
